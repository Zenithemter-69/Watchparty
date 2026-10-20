package ascending.com.ascendingg.data.repository

import ascending.com.ascendingg.data.database.AppDatabase
import ascending.com.ascendingg.data.database.HabitEntity
import ascending.com.ascendingg.data.model.Habit
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HabitRepository @Inject constructor(
    private val database: AppDatabase
) {
    private val habitDao = database.habitDao()

    // Fetch all habits as LiveData (observed by ViewModel/HomeFragment)
    val habits: LiveData<List<Habit>> = habitDao.getAllHabits()
        .map { list ->
            list.map { h ->
                Habit(
                    id = h.id,
                    name = h.name,
                    category = h.category,
                    timeOfDay = h.timeOfDay,
                    isActive = h.isActive,
                    targetFrequency = h.targetFrequency,
                    completionStreak = h.completionStreak,
                    lastCompleted = h.lastCompleted
                )
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )

    // Insert a new habit (e.g., from UI creation flow)
    suspend fun addHabit(habit: HabitEntity) = habitDao.insertAll(arrayOf(habit))

    // Update an existing habit (e.g., when completion state changes)
    suspend fun updateHabit(habit: HabitEntity) = habitDao.update(habit)

    // Increment the completion streak and set lastCompleted timestamp
    suspend fun incrementStreak(id: Long, timestamp: Long) =
        habitDao.incrementStreak(id, timestamp)

    suspend fun deleteAll() = habitDao.deleteAll()
}