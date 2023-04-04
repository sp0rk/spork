package io.github.sp0rk.domain.useCase

import io.github.sp0rk.domain.repository.MovieRepository

class GetPopularMoviesUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke() = movieRepository.getPopularMovies()
}
