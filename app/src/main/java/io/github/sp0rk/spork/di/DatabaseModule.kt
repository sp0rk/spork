package io.github.sp0rk.spork.di

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import io.github.sp0rk.data.db.MovieDB
import io.github.sp0rk.data.db.MovieDao
import io.github.sp0rk.data.db.MovieRemoteKeysDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(app: Application): MovieDB =
        Room.databaseBuilder(app, MovieDB::class.java, "movie_db").fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideMovieDao(movieDB: MovieDB) : MovieDao= movieDB.movieDao()

    @Provides
    fun provideMovieRemoteKeysDao(movieDB: MovieDB) : MovieRemoteKeysDao = movieDB.movieRemoteKeysDao()
}
