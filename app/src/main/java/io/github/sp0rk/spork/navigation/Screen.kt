package io.github.sp0rk.spork.navigation

import androidx.annotation.StringRes
import io.github.sp0rk.spork.R

enum class Screen(@StringRes val title: Int, vararg val actions: Action) {
    Entries(title = R.string.entries, Action.Settings),
    Settings(title = R.string.settings),
    ;
}


