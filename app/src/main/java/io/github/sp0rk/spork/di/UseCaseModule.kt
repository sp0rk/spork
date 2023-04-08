package io.github.sp0rk.spork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.domain.repository.EntryRepository
import io.github.sp0rk.domain.usecase.EntryUsecase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideEntryUseCase(entryRepository: EntryRepository) = EntryUsecase(
        entryRepository
    )
}
