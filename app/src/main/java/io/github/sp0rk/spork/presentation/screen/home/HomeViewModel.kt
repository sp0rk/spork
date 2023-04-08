package io.github.sp0rk.spork.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.sp0rk.domain.usecase.EntryUsecase
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val entryUsecase: EntryUsecase,
) : ViewModel() {
    init {
        viewModelScope.launch {
            entryUsecase.addEntry("Title ${Random.nextInt(0,1000)}", "Value ${Random.nextLong()}")
        }
    }
    fun queryEntries() = entryUsecase.queryAllEntries()
}
