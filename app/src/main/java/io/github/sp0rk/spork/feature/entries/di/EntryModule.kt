package io.github.sp0rk.spork.feature.entries.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.EntryDao
import io.github.sp0rk.data.feature.entries.EntryRepositoryImpl
import io.github.sp0rk.domain.repository.EntryRepository
import io.github.sp0rk.domain.usecase.EntryUsecase

@Module
@InstallIn(SingletonComponent::class)
object EntryModule {
    @Provides
    fun provideEntryUseCase(entryRepository: EntryRepository) = EntryUsecase(
        entryRepository
    )

    @Provides
    fun provideEntriesRepository(
        entryDao: EntryDao,
    ): EntryRepository =
        EntryRepositoryImpl(entryDao = entryDao)
}
