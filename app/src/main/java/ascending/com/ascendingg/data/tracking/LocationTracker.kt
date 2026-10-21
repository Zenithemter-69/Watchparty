package ascending.com.ascendingg.data.tracking

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Looper
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.callbackFlow

class LocationTracker(private val context: Context) {

    private val fusedLocationClient: FusedLocationProviderClient =
        LocationServices.getFusedLocationProviderClient(context)

    private val permissions = arrayOf(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )

    private fun hasLocationPermission(): Boolean {
        return permissions.all { permission -> ContextCompat.checkSelfPermission(
            context,
            permission
        ) == PackageManager.PERMISSION_GRANTED
        }
    }

    // State flows
    private val _currentLocation = MutableStateFlow<android.location.Location?>(null)
    val currentLocationFlow: StateFlow<android.location.Location?> = _currentLocation.asStateFlow()
    val currentLocation: android.location.Location?
        get() = _currentLocation.value

    private var _totalDistanceMeters = 0f
    private var _stepCount = 0

    val totalDistanceMeters: Float
        get() = _totalDistanceMeters

    val stepCount: Int
        get() = _stepCount

    // Distance per step estimation (average human step ~0.75m)
    private val DISTANCE_PER_STEP = 0.75f

    private var lastLocation: android.location.Location? = null

    /**
     * Start tracking location and calculate steps/distance.
     * Returns a Flow that emits continuous location updates.
     */
    fun startTracking(): Flow<android.location.Location?> = callbackFlow {
        if (!hasLocationPermission()) {
            close()
            return@callbackFlow
        }

        // Get last known location for initial value
        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
            location?.let {
                _currentLocation.value = it
                trySend(it)
                lastLocation = it
            }
        }

        val locationRequest = LocationRequest.Builder(Priority.PRIORITY_HIGH_ACCURACY, 5000L)
            .setMinUpdateIntervalMillis(2000L)
            .build()

        val callback = object : LocationCallback() {
            override fun onLocationResult(result: LocationResult) {
                val location = result.lastLocation ?: return
                _currentLocation.value = location

                // Calculate distance and steps
                lastLocation?.let { previous ->
                    val distance = previous.distanceTo(location)
                    _totalDistanceMeters += distance
                    _stepCount += (distance / DISTANCE_PER_STEP).toInt()
                }
                lastLocation = location

                trySend(location)
            }
        }

        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            callback,
            Looper.getMainLooper()
        )

        awaitClose {
            fusedLocationClient.removeLocationUpdates(callback)
        }
    }

    fun resetStats() {
        _totalDistanceMeters = 0f
        _stepCount = 0
        lastLocation = null
    }
}
