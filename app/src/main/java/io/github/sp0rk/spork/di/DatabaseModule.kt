package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
//
//    @Provides
//    fun provideDatabase(app: Application): MovieDB =
//        Room.databaseBuilder(app, MovieDB::class.java, "movie_db").fallbackToDestructiveMigration()
//            .build()
//
//    @Provides
//    fun provideMovieDao(movieDB: MovieDB) : MovieDao= movieDB.movieDao()
//
//    @Provides
//    fun provideMovieRemoteKeysDao(movieDB: MovieDB) : MovieRemoteKeysDao = movieDB.movieRemoteKeysDao()
}
