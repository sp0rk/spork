package io.github.sp0rk.domain.useCase


data class MovieUseCases(
    val getPopularMoviesUseCase: GetPopularMoviesUseCase,
    val getMoviesFromDBUseCase: GetMoviesFromDBUseCase,
)
