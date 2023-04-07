package io.github.sp0rk.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.sp0rk.domain.model.Entry

@Database(
    entities = [Entry::class],
    version = 1,
    exportSchema = false
)
abstract class SporkDb : RoomDatabase() {
    abstract fun entryDao(): EntryDao
}
