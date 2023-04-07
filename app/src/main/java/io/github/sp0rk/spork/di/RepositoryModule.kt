package io.github.sp0rk.spork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.EntryDao
import io.github.sp0rk.data.repository.EntryRepositoryImpl
import io.github.sp0rk.data.repository.MovieRepositoryImpl
import io.github.sp0rk.data.repository.dataSource.MovieLocalDataSource
import io.github.sp0rk.data.repository.dataSource.MovieRemoteDataSource
import io.github.sp0rk.domain.repository.EntryRepository
import io.github.sp0rk.domain.repository.MovieRepository


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMoviesRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository =
        MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource = movieLocalDataSource)

    @Provides
    fun provideEntriesRepository(
        entryDao: EntryDao,
    ): EntryRepository =
        EntryRepositoryImpl(entryDao = entryDao)
}
