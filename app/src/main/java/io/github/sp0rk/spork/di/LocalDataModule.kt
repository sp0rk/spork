package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {
//    @Provides
//    fun provideLocalDataSource(movieDao: MovieDao): MovieLocalDataSource =
//        MovieLocalDataSourceImpl(movieDao = movieDao)
}
