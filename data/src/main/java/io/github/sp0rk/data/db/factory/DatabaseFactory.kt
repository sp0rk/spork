package io.github.sp0rk.data.db.factory

import android.app.Application
import androidx.room.Room
import io.github.sp0rk.data.db.SporkDb
import net.sqlcipher.database.SupportFactory

class DatabaseFactory(
    private val passphraseStore: PassphraseStore,
    private val passphraseGenerator: PassphraseGenerator,
) {
    fun provideDatabase(app: Application): SporkDb =
        Room.databaseBuilder(app, SporkDb::class.java, DB_NAME)
            .openHelperFactory(provideSecureOpenHelperFactory())
            .fallbackToDestructiveMigration()
            .build()

    private fun provideSecureOpenHelperFactory() = SupportFactory(providePassphrase())

    private fun providePassphrase() = passphraseStore.getPassphrase() ?: createNewPassPhrase()

    private fun createNewPassPhrase() = passphraseGenerator.generatePassphrase()
        .also(passphraseStore::savePassphrase)
}

private const val DB_NAME = "spork_db"
