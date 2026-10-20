package ascending.com.ascendingg.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lascending/com/ascendingg/ui/viewmodel/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "habitRepository", "Lascending/com/ascendingg/data/repository/HabitRepository;", "(Lascending/com/ascendingg/data/repository/HabitRepository;)V", "habits", "error/NonExistentClass", "getHabits", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "incrementHabitStreak", "", "habitId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ascending.com.ascendingg.data.repository.HabitRepository habitRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass habits = null;
    
    @javax.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    ascending.com.ascendingg.data.repository.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getHabits() {
        return null;
    }
    
    public final void incrementHabitStreak(long habitId) {
    }
}