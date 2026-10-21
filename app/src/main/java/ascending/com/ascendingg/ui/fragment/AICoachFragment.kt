package ascending.com.ascendingg.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import ascending.com.ascendingg.R
import ascending.com.ascendingg.databinding.FragmentAicoachBinding
import ascending.com.ascendingg.ui.adapter.ChatAdapter
import ascending.com.ascendingg.ui.viewmodel.AICoachViewModel
import ascending.com.ascendingg.ui.viewmodel.ChatUiState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AICoachFragment : Fragment(R.layout.fragment_aicoach) {

    private var _binding: FragmentAicoachBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AICoachViewModel by viewModels()
    private lateinit var chatAdapter: ChatAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAicoachBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeViewModel()
        setupListeners()
    }

    private fun setupRecyclerView() {
        chatAdapter = ChatAdapter()
        binding.recyclerViewMessages.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = chatAdapter
        }
    }

    private fun observeViewModel() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    when (state) {
                        is ChatUiState.Idle -> {
                            binding.progressBar.visibility = View.GONE
                        }
                        is ChatUiState.Loading -> {
                            binding.progressBar.visibility = View.VISIBLE
                        }
                        is ChatUiState.Success -> {
                            binding.progressBar.visibility = View.GONE
                            chatAdapter.addAIMessage(state.response)
                            scrollToBottom()
                        }
                        is ChatUiState.Error -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(
                                requireContext(),
                                "Error: ${state.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        }
    }

    private fun setupListeners() {
        binding.btnSend.setOnClickListener {
            val message = binding.etMessage.text.toString().trim()
            if (message.isNotEmpty()) {
                binding.etMessage.text.clear()
                chatAdapter.addUserMessage(message)
                viewModel.sendMessage(message)
                scrollToBottom()
            }
        }
    }

    private fun scrollToBottom() {
        binding.recyclerViewMessages.smoothScrollToPosition(
            chatAdapter.itemCount - 1
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}