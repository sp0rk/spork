package io.github.sp0rk.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

fun colors(darkTheme: Boolean) = if (darkTheme) {
    darkColorScheme()
} else {
    lightColorScheme()
}
