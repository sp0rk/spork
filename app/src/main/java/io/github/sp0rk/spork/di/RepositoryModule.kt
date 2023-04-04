package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

//    @Provides
//    fun provideMoviesRepository(
//        movieRemoteDataSource: MovieRemoteDataSource,
//        movieLocalDataSource: MovieLocalDataSource
//    ): MovieRepository =
//        MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource = movieLocalDataSource)
}
