package io.github.sp0rk.spork.di

import io.github.sp0rk.data.repository.MovieRepositoryImpl
import io.github.sp0rk.data.repository.dataSource.MovieLocalDataSource
import io.github.sp0rk.data.repository.dataSource.MovieRemoteDataSource
import io.github.sp0rk.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMoviesRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository =
        MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource = movieLocalDataSource)
}
