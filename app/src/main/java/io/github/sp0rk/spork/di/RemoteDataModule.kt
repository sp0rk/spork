package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
//    @Provides
//    fun provideMoviesRemoteDataSource(movieApi: MovieApi, movieDB: MovieDB) : MovieRemoteDataSource =
//        MovieRemoteDataSourceImpl(movieApi, movieDB = movieDB)
}
