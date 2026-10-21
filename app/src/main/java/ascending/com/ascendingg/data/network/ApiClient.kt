package ascending.com.ascendingg.data.network

import android.content.Context
import ascending.com.ascendingg.data.repository.AIRepository

object ApiClient {
    suspend fun getAiResponse(context: Context, message: String): String {
        val repo = AIRepository(context)
        return repo.getAIResponse(message)
    }
}