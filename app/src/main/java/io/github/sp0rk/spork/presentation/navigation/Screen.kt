package io.github.sp0rk.spork.presentation.navigation

sealed class Screen(val route: String) {
    object Entries : Screen("entries")
    object Settings : Screen("settings")
}
