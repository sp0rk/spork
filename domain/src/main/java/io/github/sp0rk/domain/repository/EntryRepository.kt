package io.github.sp0rk.domain.repository

import io.github.sp0rk.domain.model.Entry
import kotlinx.coroutines.flow.Flow

interface EntryRepository {
    fun getEntries(): Flow<List<Entry>>
    suspend fun addEntry(name: String, value: String)
}
