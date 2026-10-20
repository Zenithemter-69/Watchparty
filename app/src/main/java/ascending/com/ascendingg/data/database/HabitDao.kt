package ascending.com.ascendingg.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
    @Query("SELECT * FROM habits WHERE isActive = 1 ORDER BY id")
    fun getAllHabits(): Flow<List<HabitEntity>>

    @Insert
    suspend fun insertAll(vararg habits: HabitEntity): LongArray

    @Update
    suspend fun update(habit: HabitEntity): Int

    @Query("UPDATE habits SET completionStreak = completionStreak + 1, lastCompleted = :timestamp WHERE id = :id")
    suspend fun incrementStreak(id: Long, timestamp: Long): Int

    @Query("DELETE FROM habits")
    suspend fun deleteAll()
}