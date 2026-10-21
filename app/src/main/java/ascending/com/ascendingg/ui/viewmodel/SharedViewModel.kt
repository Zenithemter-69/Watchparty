package ascending.com.ascendingg.ui.viewmodel

import ascending.com.ascendingg.data.model.Habit
import ascending.com.ascendingg.data.repository.HabitRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.lifecycle.asFlow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val habitRepository: HabitRepository
) : ViewModel() {

    // Expose habits as Flow for UI observation
    val habits: Flow<List<Habit>> = habitRepository.habits.asFlow()
        .shareIn(viewModelScope, SharingStarted.WhileSubscribed(5000), replay = 1)

    fun incrementHabitStreak(habitId: Long) {
        viewModelScope.launch {
            habitRepository.incrementStreak(habitId, System.currentTimeMillis())
        }
    }
}