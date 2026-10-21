package ascending.com.ascendingg.ui.viewmodel

import androidx.lifecycle.ViewModel
import ascending.com.ascendingg.data.repository.HabitRepository
import ascending.com.ascendingg.data.repository.WorkoutRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.lifecycle.asFlow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.distinctUntilChanged
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class InsightsViewModel @Inject constructor(
    private val habitRepository: HabitRepository,
    private val workoutRepository: WorkoutRepository
) : ViewModel() {

    // Habit completion data for the last 7 days
    val habitCompletionData: Flow<List<BarEntryData>> = habitRepository.habits
        .asFlow()
        .map { habits: List<ascending.com.ascendingg.data.model.Habit> ->
            // Generate 7 days of habit completion percentages
            val sdf = SimpleDateFormat("EEE", Locale.getDefault())
            val today = Date()
            (0..6).map { dayOffset: Int ->
                val date = Date(today.time - (6 - dayOffset) * 24 * 60 * 60 * 1000L)
                val dayName = sdf.format(date)
                val completed = habits.count { it.lastCompleted > 0 }
                val percentage = if (habits.isNotEmpty()) {
                    ((completed.toFloat() / habits.size) * 100).toFloat()
                } else 0f
                BarEntryData(dayOffset.toFloat(), percentage, dayName)
            }
        }
        .distinctUntilChanged()

    // Study hours data for the last 7 days (from workouts/study tracking)
    val studyHoursData: Flow<List<LineEntryData>> = workoutRepository.workouts
        .asFlow()
        .map { workouts: List<ascending.com.ascendingg.data.model.Workout> ->
            val sdf = SimpleDateFormat("EEE", Locale.getDefault())
            val today = Date()
            (0..6).map { dayOffset: Int ->
                val date = Date(today.time - (6 - dayOffset) * 24 * 60 * 60 * 1000L)
                val dayName = sdf.format(date)
                // Filter workouts for this day and calculate total duration
                val dayWorkouts = workouts.filter { w ->
                    val workoutDate = Date(w.timestamp)
                    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(workoutDate) ==
                        SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date)
                }
                val totalMinutes = dayWorkouts.sumOf { it.duration }
                val hours = totalMinutes / 60f
                LineEntryData(dayOffset.toFloat(), hours, dayName)
            }
        }
        .distinctUntilChanged()

    // Combined data for UI
    data class InsightData(
        val habitData: List<BarEntryData>,
        val studyData: List<LineEntryData>,
        val dateRangeStart: String,
        val dateRangeEnd: String,
        val photoCount: Int
    )

    data class BarEntryData(
        val x: Float,
        val y: Float,
        val label: String
    )

    data class LineEntryData(
        val x: Float,
        val y: Float,
        val label: String
    )
}