package io.github.sp0rk.domain.usecase

import io.github.sp0rk.domain.repository.EntryRepository
import javax.inject.Inject

class EntryUsecase @Inject constructor(private val entryRepository: EntryRepository) {
    fun queryAllEntries() = entryRepository.getEntries()
    suspend fun addEntry(name: String, value: String) = entryRepository.addEntry(name, value)
}
