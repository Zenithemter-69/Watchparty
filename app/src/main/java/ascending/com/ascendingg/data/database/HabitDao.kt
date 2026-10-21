package ascending.com.ascendingg.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
    @Query("SELECT * FROM habits WHERE isActive = 1 ORDER BY id")
    fun getAllHabits(): Flow<List<HabitEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(vararg habits: HabitEntity): LongArray

    @Update
    fun update(habit: HabitEntity): Int

    @Query("UPDATE habits SET completionStreak = completionStreak + 1, lastCompleted = :timestamp WHERE id = :id")
    fun incrementStreak(id: Long, timestamp: Long): Int

    @Query("DELETE FROM habits")
    fun deleteAll(): Int
}