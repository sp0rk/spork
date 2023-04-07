package io.github.sp0rk.data.repository

import io.github.sp0rk.data.db.EntryDao
import io.github.sp0rk.domain.model.Entry
import io.github.sp0rk.domain.repository.EntryRepository

class EntryRepositoryImpl(
    private val entryDao: EntryDao,
) : EntryRepository {
    override fun getEntries() = entryDao.getAllEntries()
    override suspend fun addEntry(name: String, value: String) = entryDao.addEntry(
        Entry(
            name = name,
            value = value,
            security = 0
        )
    )
}
