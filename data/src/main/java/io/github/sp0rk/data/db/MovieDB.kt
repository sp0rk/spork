package io.github.sp0rk.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.sp0rk.domain.model.Movie
import io.github.sp0rk.domain.model.MovieRemoteKeys

@Database(
    entities = [Movie::class, MovieRemoteKeys::class],
    version = 1,
    exportSchema = false
)
abstract class MovieDB : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun movieRemoteKeysDao(): MovieRemoteKeysDao
}
