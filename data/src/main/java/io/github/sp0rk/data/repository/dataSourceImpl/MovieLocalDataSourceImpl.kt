package io.github.sp0rk.data.repository.dataSourceImpl

import io.github.sp0rk.data.db.MovieDao
import io.github.sp0rk.data.repository.dataSource.MovieLocalDataSource
import io.github.sp0rk.domain.model.Movie
import kotlinx.coroutines.flow.Flow


class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override fun getMoviesFromDB(movieId: Int): Flow<Movie> = movieDao.getMovie(movieId)
}
