package io.github.sp0rk.spork.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.sp0rk.data.db.*
import io.github.sp0rk.data.db.factory.DatabaseFactory
import io.github.sp0rk.data.db.factory.PassphraseGenerator
import io.github.sp0rk.data.db.factory.PassphraseStore

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun providePassphraseStore(app: Application): PassphraseStore = PassphraseStore(app)

    @Provides
    fun providePassphraseGenerator(): PassphraseGenerator = PassphraseGenerator()

    @Provides
    fun provideDatabase(
        app: Application,
        databaseFactory: DatabaseFactory,
    ): SporkDb = databaseFactory.provideDatabase(app)

    @Provides
    fun provideDatabaseFactory(
        passphraseStore: PassphraseStore,
        passphraseGenerator: PassphraseGenerator,
    ): DatabaseFactory = DatabaseFactory(passphraseStore, passphraseGenerator)

    @Provides
    fun provideEntryDao(sporkDb: SporkDb): EntryDao = sporkDb.entryDao()
}
