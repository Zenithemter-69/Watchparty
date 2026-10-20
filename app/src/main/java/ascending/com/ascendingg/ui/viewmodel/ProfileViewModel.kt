package ascending.com.ascendingg.ui.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import ascending.com.ascendingg.data.database.AppDatabase
import ascending.com.ascendingg.data.repository.HabitRepository
import ascending.com.ascendingg.data.utils.PreferencesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    application: Application,
    private val prefs: PreferencesManager,
    @ApplicationContext private val appContext: Application,
    @Assisted private val savedStateHandle: SavedStateHandle
) : AndroidViewModel(application) {

    private val _hasApiKey = MutableLiveData<Boolean>()
    val hasApiKey: LiveData<Boolean> = _hasApiKey

    private val _notificationsEnabled = MutableLiveData<Boolean>()
    val notificationsEnabled: LiveData<Boolean> = _notificationsEnabled

    private val habitRepository: HabitRepository = hiltViewModel().habitRepository

    init {
        loadPreferences()
    }

    private fun loadPreferences() {
        _hasApiKey.value = prefs.getApiKey() != null
        _notificationsEnabled.value = false
    }

    fun saveApiKey(key: String) {
        prefs.saveApiKey(key)
        _hasApiKey.value = true
    }

    fun setNotificationsEnabled(enabled: Boolean) {
        _notificationsEnabled.value = enabled
    }

    fun exportUserData() {
        viewModelScope.launch {
            try {
                withContext(Dispatchers.IO) {
                    val backupFile = File(appContext.filesDir, "ascendingg_backup.json")
                    backupFile.writeText("""{"sample_data": "exported"}""")
                }
                withContext(Dispatchers.Main) {
                    Toast.makeText(
                        appContext,
                        "Backup saved to internal storage",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(
                        appContext,
                        "Export failed: ${e.message}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }

    fun clearAllHabits() {
        habitRepository.deleteAll()
        _hasApiKey.value = false
        _notificationsEnabled.value = false
    }

    fun clearAllData() {
        _hasApiKey.value = false
        _notificationsEnabled.value = false
        clearAllHabits()
    }
}