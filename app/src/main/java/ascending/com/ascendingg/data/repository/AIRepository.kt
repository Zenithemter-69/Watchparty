package ascending.com.ascendingg.data.repository

import android.content.Context
import ascending.com.ascendingg.data.network.OpenAIClient
import ascending.com.ascendingg.data.utils.PreferencesManager

class AIRepository(private val context: Context) {
    private val prefs = PreferencesManager(context)

    /** Real vs mock logic – if a key is present we hit OpenAI, otherwise mock replies */
    suspend fun getAIResponse(message: String): String {
        val key = prefs.getApiKey()
        return if (!key.isNullOrBlank()) {
            OpenAIClient(key).chat(message)
        } else {
            // ----- keep the original mock behaviour -----
            val lowerMsg = message.lowercase()
            when {
                lowerMsg.contains("habit") || lowerMsg.contains("routine") ->
                    "Based on your Elite Looksmaxxing Guide (Age 17):\n\n• MEWING 24/7: #1 priority\n• MOUTH TAPING: Critical for sleep\n• CHIN TUCKS: 3x/day (5 sets × 10 reps)\n• CHEWING: 30-45 min daily\n\nYour habit completion: 75%\n\nTip: Track with weekly photos (same time, lighting, angle)."

                lowerMsg.contains("workout") || lowerMsg.contains("exercise") ->
                    "Your bodyweight routine (3x/week):\n\n• PUSH-UPS: 4 sets × max\n• SQUATS: 4 sets × 20\n• PULL-UPS/ROWS: 4 sets × max\n• PLANK: 3 sets × 60s\n\nFOCUS ON FORM: Slow tempo > speed. Rest 60s between sets.\n\nWARNING: Stop if jaw pain/clicking occurs."

                lowerMsg.contains("study") || lowerMsg.contains("learn") ->
                    "Study protocol:\n\n• FOCUS SESSIONS: 50 min work / 10 min break\n• ACTIVE RECALL: Test yourself\n• SPIRAL REVIEW: Review same-day material\n• SUBJECT ROTATION: Alternate subjects\n\nToday's target: Complete 2/3 study sessions.\n\nTip: Use Buteyko breathing during breaks."

                lowerMsg.contains("progress") || lowerMsg.contains("result") ->
                    "Progress analysis:\n\n• HABIT CONSISTENCY: Track weekly average (aim for 8+/10)\n• PHYSICAL CHANGES: Jawline visible at 2‑3 months\n• SLEEP QUALITY: Improves with mouth taping\n• BONE REMODELING: Requires 6+ months\n\nREMEMBER: 90% quit in 2 weeks. 9% inconsistent for 3 months. 1% consistent for 6+ months transform.\n\nWhich group are you in?"

                else ->
                    "I'm your ASCEND AI Coach. Ask me about:\n\n• Your daily routine from the Elite Guide\n• Exercise form and progression\n• Study optimization\n• Habit troubleshooting\n• Progress analysis\n\nTry: 'Explain today's workout' or 'Why am I not seeing results?'"
            }
        }
    }
}