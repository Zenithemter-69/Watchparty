package ascending.com.ascendingg.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HabitEntity> __insertionAdapterOfHabitEntity;

  private final EntityDeletionOrUpdateAdapter<HabitEntity> __updateAdapterOfHabitEntity;

  private final SharedSQLiteStatement __preparedStmtOfIncrementStreak;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabitEntity = new EntityInsertionAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `habits` (`id`,`name`,`category`,`timeOfDay`,`isActive`,`targetFrequency`,`completionStreak`,`lastCompleted`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        if (value.getTimeOfDay() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimeOfDay());
        }
        final int _tmp = value.isActive() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getTargetFrequency());
        stmt.bindLong(7, value.getCompletionStreak());
        stmt.bindLong(8, value.getLastCompleted());
      }
    };
    this.__updateAdapterOfHabitEntity = new EntityDeletionOrUpdateAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `habits` SET `id` = ?,`name` = ?,`category` = ?,`timeOfDay` = ?,`isActive` = ?,`targetFrequency` = ?,`completionStreak` = ?,`lastCompleted` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        if (value.getTimeOfDay() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimeOfDay());
        }
        final int _tmp = value.isActive() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getTargetFrequency());
        stmt.bindLong(7, value.getCompletionStreak());
        stmt.bindLong(8, value.getLastCompleted());
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfIncrementStreak = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE habits SET completionStreak = completionStreak + 1, lastCompleted = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM habits";
        return _query;
      }
    };
  }

  @Override
  public long[] insertAll(final HabitEntity... habits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long[] _result = __insertionAdapterOfHabitEntity.insertAndReturnIdsArray(habits);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final HabitEntity habit) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfHabitEntity.handle(habit);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int incrementStreak(final long id, final long timestamp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementStreak.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, timestamp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfIncrementStreak.release(_stmt);
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Flow<List<HabitEntity>> getAllHabits() {
    final String _sql = "SELECT * FROM habits WHERE isActive = 1 ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"habits"}, new Callable<List<HabitEntity>>() {
      @Override
      public List<HabitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTimeOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "timeOfDay");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final int _cursorIndexOfTargetFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "targetFrequency");
          final int _cursorIndexOfCompletionStreak = CursorUtil.getColumnIndexOrThrow(_cursor, "completionStreak");
          final int _cursorIndexOfLastCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "lastCompleted");
          final List<HabitEntity> _result = new ArrayList<HabitEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HabitEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTimeOfDay;
            if (_cursor.isNull(_cursorIndexOfTimeOfDay)) {
              _tmpTimeOfDay = null;
            } else {
              _tmpTimeOfDay = _cursor.getString(_cursorIndexOfTimeOfDay);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            final int _tmpTargetFrequency;
            _tmpTargetFrequency = _cursor.getInt(_cursorIndexOfTargetFrequency);
            final int _tmpCompletionStreak;
            _tmpCompletionStreak = _cursor.getInt(_cursorIndexOfCompletionStreak);
            final long _tmpLastCompleted;
            _tmpLastCompleted = _cursor.getLong(_cursorIndexOfLastCompleted);
            _item = new HabitEntity(_tmpId,_tmpName,_tmpCategory,_tmpTimeOfDay,_tmpIsActive,_tmpTargetFrequency,_tmpCompletionStreak,_tmpLastCompleted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
