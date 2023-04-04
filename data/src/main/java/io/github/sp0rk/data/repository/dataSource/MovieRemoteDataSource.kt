package io.github.sp0rk.data.repository.dataSource

import androidx.paging.PagingData
import io.github.sp0rk.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRemoteDataSource {
     fun getPopularMovies(): Flow<PagingData<Movie>>
}
