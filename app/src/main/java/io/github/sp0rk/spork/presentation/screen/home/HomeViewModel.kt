package io.github.sp0rk.spork.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.sp0rk.domain.useCase.EntryUsecase
import io.github.sp0rk.domain.useCase.MovieUseCases
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class HomeViewModel @Inject constructor(
    movieUseCases: MovieUseCases,
    private val entryUsecase: EntryUsecase,
) : ViewModel() {
    init {
        viewModelScope.launch {
            entryUsecase.addEntry("Tytuł ${Random.nextInt(0,1000)}", "Wartość ${Random.nextLong()}")
        }
    }
    val getAllPopularMovies = movieUseCases.getPopularMoviesUseCase()
    fun queryEntries() = entryUsecase.queryAllEntries()
}
