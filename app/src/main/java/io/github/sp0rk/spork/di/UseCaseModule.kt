package io.github.sp0rk.spork.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

//    @Provides
//    fun provideMovieUseCases(movieRepository: MovieRepository) = MovieUseCases(
//        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieRepository = movieRepository),
//        getMoviesFromDBUseCase = GetMoviesFromDBUseCase(movieRepository = movieRepository)
//    )
}
