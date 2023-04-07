package io.github.sp0rk.domain.useCase

import io.github.sp0rk.domain.repository.EntryRepository

class EntryUsecase(private val entryRepository: EntryRepository) {
    fun queryAllEntries() = entryRepository.getEntries()
    suspend fun addEntry(name: String, value: String) = entryRepository.addEntry(name, value)
}
