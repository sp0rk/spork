package io.github.sp0rk.data.repository.dataSource
import androidx.paging.PagingSource
import io.github.sp0rk.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieLocalDataSource {
    fun getMoviesFromDB(movieId : Int): Flow<Movie>
}
