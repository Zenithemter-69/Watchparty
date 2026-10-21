package ascending.com.ascendingg.data.tracking;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Lascending/com/ascendingg/data/tracking/LocationTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DISTANCE_PER_STEP", "", "_currentLocation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/location/Location;", "_stepCount", "", "_totalDistanceMeters", "currentLocation", "getCurrentLocation", "()Landroid/location/Location;", "currentLocationFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentLocationFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastLocation", "permissions", "", "", "[Ljava/lang/String;", "stepCount", "getStepCount", "()I", "totalDistanceMeters", "getTotalDistanceMeters", "()F", "hasLocationPermission", "", "resetStats", "", "startTracking", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class LocationTracker {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] permissions = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<android.location.Location> _currentLocation = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<android.location.Location> currentLocationFlow = null;
    private float _totalDistanceMeters = 0.0F;
    private int _stepCount = 0;
    private final float DISTANCE_PER_STEP = 0.75F;
    @org.jetbrains.annotations.Nullable
    private android.location.Location lastLocation;
    
    public LocationTracker(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final boolean hasLocationPermission() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<android.location.Location> getCurrentLocationFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.Location getCurrentLocation() {
        return null;
    }
    
    public final float getTotalDistanceMeters() {
        return 0.0F;
    }
    
    public final int getStepCount() {
        return 0;
    }
    
    /**
     * Start tracking location and calculate steps/distance.
     * Returns a Flow that emits continuous location updates.
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<android.location.Location> startTracking() {
        return null;
    }
    
    public final void resetStats() {
    }
}