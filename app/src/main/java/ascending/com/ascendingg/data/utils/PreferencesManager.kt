package ascending.com.ascendingg.data.utils

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val prefs: SharedPreferences = context.getSharedPreferences(
        Constants.PREFS_NAME, Context.MODE_PRIVATE
    )

    fun saveApiKey(key: String) {
        prefs.edit().putString(Constants.KEY_API_KEY, key).apply()
    }

    fun getApiKey(): String? = prefs.getString(Constants.KEY_API_KEY, null)

    fun saveUserId(id: Long) {
        prefs.edit().putLong(Constants.KEY_USER_ID, id).apply()
    }

    fun getUserId(): Long = prefs.getLong(Constants.KEY_USER_ID, Constants.DEFAULT_USER_ID)
}