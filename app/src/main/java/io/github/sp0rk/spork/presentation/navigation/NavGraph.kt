package io.github.sp0rk.spork.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.sp0rk.spork.presentation.screen.home.HomeScreen
import io.github.sp0rk.spork.presentation.screen.settings.SettingsScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Entries.route
    ) {
        composable(route = Screen.Entries.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}
