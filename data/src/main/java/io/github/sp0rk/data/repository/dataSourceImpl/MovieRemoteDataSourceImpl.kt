package io.github.sp0rk.data.repository.dataSourceImpl

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import io.github.sp0rk.data.api.MovieApi
import io.github.sp0rk.data.db.MovieDB
import io.github.sp0rk.data.paging.MovieRemoteMediator
import io.github.sp0rk.data.repository.dataSource.MovieRemoteDataSource
import io.github.sp0rk.domain.model.Movie
import kotlinx.coroutines.flow.Flow


class MovieRemoteDataSourceImpl(private val movieApi: MovieApi, private val movieDB: MovieDB) :
    MovieRemoteDataSource {
    private val movieDao = movieDB.movieDao()

    @OptIn(ExperimentalPagingApi::class)
    override  fun getPopularMovies() : Flow<PagingData<Movie>> {
        val pagingSourceFactory = { movieDao.getAllMovies() }
        return Pager(
            config = PagingConfig(pageSize = 20),
            remoteMediator = MovieRemoteMediator(
                movieApi,
                movieDB
            ),
            pagingSourceFactory = pagingSourceFactory,
        ).flow
    }
}
