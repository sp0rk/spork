package io.github.sp0rk.spork.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.*
import io.github.sp0rk.data.db.security.PassphraseGenerator
import io.github.sp0rk.data.db.security.PassphraseStore

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun providePassphraseStore(app: Application): PassphraseStore = PassphraseStore(app)

    @Provides
    fun providePassphraseGenerator(): PassphraseGenerator = PassphraseGenerator()

    @Provides
    fun provideDatabase(
        app: Application,
        databaseFactory: DatabaseFactory,
    ): SporkDb = databaseFactory.provideDatabase(app)

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
