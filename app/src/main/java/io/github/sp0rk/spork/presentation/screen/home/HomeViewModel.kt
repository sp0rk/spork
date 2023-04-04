package io.github.sp0rk.spork.presentation.screen.home

import androidx.lifecycle.ViewModel
import io.github.sp0rk.domain.useCase.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    movieUseCases: MovieUseCases,
) : ViewModel() {
    val getAllPopularMovies = movieUseCases.getPopularMoviesUseCase()

}
