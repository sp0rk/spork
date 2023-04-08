package io.github.sp0rk.spork.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
}
