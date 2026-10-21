package ascending.com.ascendingg.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001b\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lascending/com/ascendingg/data/database/WorkoutDao;", "", "getUserWorkouts", "Lkotlinx/coroutines/flow/Flow;", "", "Lascending/com/ascendingg/data/database/WorkoutEntity;", "userId", "", "insertAll", "", "workouts", "", "([Lascending/com/ascendingg/data/database/WorkoutEntity;)[J", "app_debug"})
@androidx.room.Dao
public abstract interface WorkoutDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.NotNull
    public abstract long[] insertAll(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.WorkoutEntity[] workouts);
    
    @androidx.room.Query(value = "SELECT * FROM workouts WHERE userId = :userId ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ascending.com.ascendingg.data.database.WorkoutEntity>> getUserWorkouts(long userId);
}