package ascending.com.ascendingg.data.tracking;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u00020\b\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0013\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lascending/com/ascendingg/data/tracking/LocationTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DISTANCE_PER_STEP", "", "_currentLocation", "error/NonExistentClass", "Lerror/NonExistentClass;", "_stepCount", "", "_totalDistanceMeters", "currentLocation", "getCurrentLocation", "()Lerror/NonExistentClass;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "permissions", "stepCount", "getStepCount", "()I", "totalDistanceMeters", "getTotalDistanceMeters", "()F", "hasLocationPermission", "", "resetStats", "", "startTracking", "app_debug"})
public final class LocationTracker {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass permissions = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass _currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass currentLocation = null;
    private float _totalDistanceMeters = 0.0F;
    private int _stepCount = 0;
    private final float DISTANCE_PER_STEP = 0.75F;
    
    public LocationTracker(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final boolean hasLocationPermission() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getCurrentLocation() {
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
     * Returns a Flow that emits the current location (one-shot).
     */
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass startTracking() {
        return null;
    }
    
    public final void resetStats() {
    }
}