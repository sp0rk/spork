package io.github.sp0rk.domain.useCase

import io.github.sp0rk.domain.repository.MovieRepository


class GetMoviesFromDBUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke(movieID: Int) = movieRepository.getMoviesFromDB(movieID)
}
