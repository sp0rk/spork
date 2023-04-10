package io.github.sp0rk.data.feature.entries.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.*
import io.github.sp0rk.data.feature.entries.EntryRepositoryImpl
import io.github.sp0rk.domain.repository.EntryRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class EntriesModule {

    @Binds
    abstract fun bindEntryRepository(implementation: EntryRepositoryImpl): EntryRepository

}
