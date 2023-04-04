package io.github.sp0rk.spork.di

import io.github.sp0rk.data.db.MovieDao
import io.github.sp0rk.data.repository.dataSource.MovieLocalDataSource
import io.github.sp0rk.data.repository.dataSourceImpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {
    @Provides
    fun provideLocalDataSource(movieDao: MovieDao): MovieLocalDataSource =
        MovieLocalDataSourceImpl(movieDao = movieDao)
}
