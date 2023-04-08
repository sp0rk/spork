package io.github.sp0rk.spork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.EntryDao
import io.github.sp0rk.data.repository.EntryRepositoryImpl
import io.github.sp0rk.domain.repository.EntryRepository

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideEntriesRepository(
        entryDao: EntryDao,
    ): EntryRepository =
        EntryRepositoryImpl(entryDao = entryDao)
}
