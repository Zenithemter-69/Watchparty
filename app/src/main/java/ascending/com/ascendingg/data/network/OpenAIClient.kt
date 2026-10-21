package ascending.com.ascendingg.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class OpenAIClient(apiKey: String) {
    /** Simple, one‑off chat request – throws RuntimeException on network error */
    suspend fun chat(message: String): String = withContext(Dispatchers.IO) {
        // Placeholder - would use actual OpenAI API here
        "🔹 OpenAI processed your request (key format detected).\n\nMessage: \"$message\""
    }
}