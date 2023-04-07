package io.github.sp0rk.spork.di

import io.github.sp0rk.domain.repository.MovieRepository
import io.github.sp0rk.domain.useCase.GetMoviesFromDBUseCase
import io.github.sp0rk.domain.useCase.GetPopularMoviesUseCase
import io.github.sp0rk.domain.useCase.MovieUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.domain.repository.EntryRepository
import io.github.sp0rk.domain.useCase.EntryUsecase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMovieUseCases(movieRepository: MovieRepository) = MovieUseCases(
        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieRepository = movieRepository),
        getMoviesFromDBUseCase = GetMoviesFromDBUseCase(movieRepository = movieRepository)
    )

    @Provides
    fun provideEntryUseCase(entryRepository: EntryRepository) = EntryUsecase(
        entryRepository
    )
}
