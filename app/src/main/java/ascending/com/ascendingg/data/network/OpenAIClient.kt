package ascending.com.ascendingg.data.network

import com.openai.api.OpenAIApi
import com.openai.api.OpenAIClient as BaseClient
import com.openai.api.request.ChatCompletionRequest
import com.openai.api.response.ChatCompletionResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class OpenAIClient(apiKey: String) {
    private val client = BaseClient(apiKey)
    private val api = OpenAIApi(client)

    /** Simple, one‑off chat request – throws RuntimeException on network error */
    suspend fun chat(message: String): String = withContext(Dispatchers.IO) {
        val request = ChatCompletionRequest(
            model = "gpt-3.5-turbo",
            messages = listOf(
                com.openai.api.models.Message(role = "user", content = message)
            )
        )
        try {
            val resp: ChatCompletionResponse = api.chatCompletion(request)
            resp.choices.firstOrNull()?.message?.content
                ?: "No response from AI"
        } catch (e: Exception) {
            // In production you’d translate this into a proper Result type
            throw RuntimeException("OpenAI request failed: ${e.message}", e)
        }
    }
}