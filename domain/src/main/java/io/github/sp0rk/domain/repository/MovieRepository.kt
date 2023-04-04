package io.github.sp0rk.domain.repository

import androidx.paging.PagingData
import io.github.sp0rk.domain.model.Movie
import kotlinx.coroutines.flow.Flow


interface MovieRepository {
    fun getPopularMovies(): Flow<PagingData<Movie>>
    fun getMoviesFromDB(movieId: Int): Flow<Movie>
}
