package ascending.com.ascendingg.ui.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ascending.com.ascendingg.R
import ascending.com.ascendingg.databinding.FragmentProfileBinding
import ascending.com.ascendingg.ui.viewmodel.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
        observePreferences()
    }

    private fun setupClickListeners() {
        binding.btnSaveApiKey.setOnClickListener {
            val key = binding.etApiKey.text.toString().trim()
            if (key.startsWith("sk-") && key.length > 20) {
                viewModel.saveApiKey(key)
                binding.etApiKey.setText("")
                Toast.makeText(
                    requireContext(),
                    "API key saved successfully!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    requireContext(),
                    "Invalid OpenAI API key format",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        binding.btnExportData.setOnClickListener {
            viewModel.exportUserData()
        }

        binding.btnClearHabits.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Clear All Habits?")
                .setMessage("This will delete all habit records and reset your progress. This action cannot be undone.")
                .setPositiveButton("Clear All") { _, _ ->
                    viewModel.clearAllHabits()
                    Toast.makeText(
                        requireContext(),
                        "All habits cleared",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setNegativeButton("Cancel", null)
                .show()
        }

        binding.btnClearHistory.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Clear History?")
                .setMessage("This will delete all chat history and progress records. This action cannot be undone.")
                .setPositiveButton("Clear All") { _, _ ->
                    viewModel.clearAllData()
                    Toast.makeText(
                        requireContext(),
                        "All data cleared",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setNegativeButton("Cancel", null)
                .show()
        }

        binding.switchNotifications.setOnCheckedChangeListener { _, isChecked ->
            viewModel.setNotificationsEnabled(isChecked)
        }
    }

    private fun observePreferences() {
        viewModel.notificationsEnabled.observe(viewLifecycleOwner) { enabled ->
            binding.switchNotifications.isChecked = enabled
        }

        viewModel.hasApiKey.observe(viewLifecycleOwner) { hasKey ->
            binding.etApiKey.visibility = if (hasKey) View.GONE else View.VISIBLE
            binding.tvApiKeyStatus.text = if (hasKey) "API Key Configured ✓" else "No API Key Set"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}