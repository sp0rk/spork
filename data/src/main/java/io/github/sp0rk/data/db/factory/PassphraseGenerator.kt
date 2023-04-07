package io.github.sp0rk.data.db.factory

import java.security.SecureRandom

class PassphraseGenerator {
    fun generatePassphrase() =
        ByteArray(PASSPHRASE_SIZE).also {
            SecureRandom().nextBytes(it)
        }
}

private const val PASSPHRASE_SIZE = 64
