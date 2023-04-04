package io.github.sp0rk.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.sp0rk.domain.model.MovieRemoteKeys

@Dao
interface MovieRemoteKeysDao {

    @Query("SELECT * FROM movie_remote_keys WHERE id = :movieId")
    suspend fun getMovieRemoteKeys(movieId: Int): MovieRemoteKeys?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllMovieRemoteKeys(movieRemoteKeys : List<MovieRemoteKeys>)

    @Query("DELETE FROM movie_remote_keys")
    suspend fun deleteAllMovieRemoteKeys()
}
