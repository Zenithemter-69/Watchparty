package ascending.com.ascendingg.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lascending/com/ascendingg/data/repository/WorkoutRepository;", "", "database", "Lascending/com/ascendingg/data/database/AppDatabase;", "(Lascending/com/ascendingg/data/database/AppDatabase;)V", "workoutDao", "Lascending/com/ascendingg/data/database/WorkoutDao;", "workouts", "Landroidx/lifecycle/LiveData;", "", "Lascending/com/ascendingg/data/model/Workout;", "getWorkouts", "()Landroidx/lifecycle/LiveData;", "addWorkout", "", "workout", "Lascending/com/ascendingg/data/database/WorkoutEntity;", "(Lascending/com/ascendingg/data/database/WorkoutEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WorkoutRepository {
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.database.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.database.WorkoutDao workoutDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<ascending.com.ascendingg.data.model.Workout>> workouts = null;
    
    @javax.inject.Inject
    public WorkoutRepository(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.AppDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<ascending.com.ascendingg.data.model.Workout>> getWorkouts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addWorkout(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.WorkoutEntity workout, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super long[]> $completion) {
        return null;
    }
}