package io.github.sp0rk.data.db.factory

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

class PassphraseStore(
    applicationContext: Context
) {
    private val sharedPreferences: SharedPreferences = EncryptedSharedPreferences.create(
        PREFS_FILE_NAME,
        MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC),
        applicationContext,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    fun savePassphrase(passphrase: ByteArray) = sharedPreferences
        .edit()
        .putString(KEY_PASSPHRASE, passphrase.toString(CHARSET))
        .apply()

    fun getPassphrase() = sharedPreferences
        .getString(KEY_PASSPHRASE, null)
        ?.toByteArray(CHARSET)
}

private const val PREFS_FILE_NAME = "SporkPassphraseStore"
private const val KEY_PASSPHRASE = "passphrase"
private val CHARSET = Charsets.ISO_8859_1
