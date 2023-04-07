package io.github.sp0rk.spork.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.*

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideEntryDatabase(app: Application): SporkDb =
        Room.databaseBuilder(app, SporkDb::class.java, "spork_db")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideEntryDao(sporkDb: SporkDb): EntryDao = sporkDb.entryDao()

    @Provides
    fun provideDatabase(app: Application): MovieDB =
        Room.databaseBuilder(app, MovieDB::class.java, "movie_db").fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideMovieDao(movieDB: MovieDB): MovieDao = movieDB.movieDao()

    @Provides
    fun provideMovieRemoteKeysDao(movieDB: MovieDB): MovieRemoteKeysDao =
        movieDB.movieRemoteKeysDao()
}
