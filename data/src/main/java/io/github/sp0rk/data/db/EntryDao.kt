package io.github.sp0rk.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.sp0rk.domain.model.Entry
import kotlinx.coroutines.flow.Flow

@Dao
interface EntryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEntries(entry: List<Entry>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEntry(entry: Entry)

    @Query("SELECT * FROM entries")
    fun getAllEntries(): Flow<List<Entry>>

    @Query("SELECT * FROM entries WHERE id = :entryId")
    fun getEntry(entryId: Int): Flow<Entry>

    @Query("DELETE FROM entries")
    suspend fun deleteAllEntry()
}
