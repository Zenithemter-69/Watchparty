package ascending.com.ascendingg.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ascending.com.ascendingg.R
import ascending.com.ascendingg.databinding.FragmentHomeBinding
import ascending.com.ascendingg.ui.adapter.HabitAdapter
import ascending.com.ascendingg.ui.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: HomeViewModel by viewModels()
    private lateinit var habitAdapter: HabitAdapter
    private lateinit var locationTracker: ascending.com.ascendingg.data.tracking.LocationTracker

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        locationTracker = ascending.com.ascendingg.data.tracking.LocationTracker(requireContext())
        setupRecyclerView()
        bindViewModel()
        setGreeting()
        startStepTracking()
    }

    private fun setupRecyclerView() {
        habitAdapter = HabitAdapter { habitId ->
            viewModel.incrementStreak(habitId)
        }
        binding.habitsRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = habitAdapter
        }
    }

    private fun bindViewModel() {
        lifecycleScope.launch {
            viewModel.todaysHabits.collect { habits ->
                habitAdapter.submitList(habits)
                updateProgress(habits)
            }
        }
    }

    private fun startStepTracking() {
        // Start location tracking for step counting
        lifecycleScope.launch {
            locationTracker.startTracking().collect()
        }

        // Update step count display periodically
        lifecycleScope.launch {
            locationTracker.currentLocationFlow.collect {
                updateStepDisplay()
            }
        }
    }

    private fun updateStepDisplay() {
        val steps = locationTracker.stepCount
        val distanceKm = locationTracker.totalDistanceMeters / 1000f
        binding.tvStepCount.text = "$steps steps"
        binding.tvDistance.text = String.format("%.2f km", distanceKm)
    }

    private fun updateProgress(habits: List<ascending.com.ascendingg.data.model.Habit>) {
        val completed = habits.count { it.lastCompleted > 0 }
        val percentage = if (habits.isNotEmpty()) {
            ((completed * 100) / habits.size).toFloat()
        } else 0f

        binding.progressRing.progress = percentage.toInt()
        binding.tvProgressText.text = "${percentage.toInt()}%"
        binding.tvProgressLabel.text = "Habit Completion"
    }

    private fun setGreeting() {
        val sdf = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.getDefault())
        binding.tvDate.text = sdf.format(Date())
        binding.tvName.text = "Alex" // Replace with actual username
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}