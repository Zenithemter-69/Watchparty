package ascending.com.ascendingg.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lascending/com/ascendingg/di/AppModule;", "", "()V", "provideAIRepository", "Lascending/com/ascendingg/data/repository/AIRepository;", "application", "Landroid/content/Context;", "provideDatabase", "Lascending/com/ascendingg/data/database/AppDatabase;", "provideHabitRepository", "Lascending/com/ascendingg/data/repository/HabitRepository;", "database", "provideLocationTracker", "Lascending/com/ascendingg/data/tracking/LocationTracker;", "provideWorkoutRepository", "Lascending/com/ascendingg/data/repository/WorkoutRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final ascending.com.ascendingg.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final ascending.com.ascendingg.data.database.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final ascending.com.ascendingg.data.repository.HabitRepository provideHabitRepository(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final ascending.com.ascendingg.data.repository.WorkoutRepository provideWorkoutRepository(@org.jetbrains.annotations.NotNull
    ascending.com.ascendingg.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final ascending.com.ascendingg.data.repository.AIRepository provideAIRepository(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final ascending.com.ascendingg.data.tracking.LocationTracker provideLocationTracker(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context application) {
        return null;
    }
}