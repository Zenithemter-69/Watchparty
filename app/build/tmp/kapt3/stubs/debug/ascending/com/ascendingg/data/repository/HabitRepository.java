package ascending.com.ascendingg.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lascending/com/ascendingg/data/repository/HabitRepository;", "", "database", "Lascending/com/ascendingg/data/database/AppDatabase;", "(Lascending/com/ascendingg/data/database/AppDatabase;)V", "habitDao", "Lascending/com/ascendingg/data/database/HabitDao;", "habits", "Landroidx/lifecycle/LiveData;", "", "Lascending/com/ascendingg/data/model/Habit;", "getHabits", "()Landroidx/lifecycle/LiveData;", "addHabit", "", "habit", "Lascending/com/ascendingg/data/database/HabitEntity;", "(Lascending/com/ascendingg/data/database/HabitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementStreak", "id", "", "timestamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHabit", "app_debug"})
public final class HabitRepository {
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.database.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final ascending.com.ascendingg.data.database.HabitDao habitDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<ascending.com.ascendingg.data.model.Habit>> habits = null;
    
    @javax.inject.Inject
    public HabitRepository(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.AppDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<ascending.com.ascendingg.data.model.Habit>> getHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addHabit(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.HabitEntity habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super long[]> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.HabitEntity habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object incrementStreak(long id, long timestamp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
}