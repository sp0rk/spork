package io.github.sp0rk.spork.di

import io.github.sp0rk.data.api.MovieApi
import io.github.sp0rk.data.db.MovieDB
import io.github.sp0rk.data.repository.dataSource.MovieRemoteDataSource
import io.github.sp0rk.data.repository.dataSourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
    @Provides
    fun provideMoviesRemoteDataSource(movieApi: MovieApi, movieDB: MovieDB) : MovieRemoteDataSource =
        MovieRemoteDataSourceImpl(movieApi, movieDB = movieDB)
}
