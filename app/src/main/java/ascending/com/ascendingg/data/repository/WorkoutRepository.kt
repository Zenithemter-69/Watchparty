package ascending.com.ascendingg.data.repository

import ascending.com.ascendingg.data.database.AppDatabase
import ascending.com.ascendingg.data.database.WorkoutEntity
import ascending.com.ascendingg.data.model.Workout
import ascending.com.ascendingg.data.utils.Constants
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WorkoutRepository @Inject constructor(
    private val database: AppDatabase
) {
    private val workoutDao = database.workoutDao()

    val workouts: LiveData<List<Workout>> = workoutDao.getUserWorkouts(Constants.DEFAULT_USER_ID)
        .map { entities ->
            entities.map { te ->
                Workout(
                    id = te.id,
                    userId = te.userId,
                    type = te.type,
                    duration = te.duration,
                    exercises = te.exercises,
                    notes = te.notes,
                    timestamp = te.timestamp
                )
            }
        }.asLiveData()

    suspend fun addWorkout(workout: WorkoutEntity) = workoutDao.insertAll(arrayOf(workout))
}