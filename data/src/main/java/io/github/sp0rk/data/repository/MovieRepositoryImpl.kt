package io.github.sp0rk.data.repository

import io.github.sp0rk.data.repository.dataSource.MovieLocalDataSource
import io.github.sp0rk.data.repository.dataSource.MovieRemoteDataSource
import io.github.sp0rk.domain.model.Movie
import io.github.sp0rk.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
) :
    MovieRepository {
    override fun getPopularMovies() =
        movieRemoteDataSource.getPopularMovies()

    override fun getMoviesFromDB(movieId: Int): Flow<Movie> =
        movieLocalDataSource.getMoviesFromDB(movieId)
}
