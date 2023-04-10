package io.github.sp0rk.spork.feature.entries.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.sp0rk.domain.usecase.EntryUsecase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EntriesViewModel @Inject constructor(
    private val entryUsecase: EntryUsecase,
) : ViewModel() {

    fun queryEntries() = entryUsecase.queryAllEntries()
    fun addEntry(title: String, body: String) = viewModelScope.launch {
        entryUsecase.addEntry(title, body)
    }
}
