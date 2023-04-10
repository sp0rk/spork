package io.github.sp0rk.spork.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.sp0rk.spork.feature.entries.ui.EntriesScreen
import io.github.sp0rk.spork.feature.settings.ui.SettingsScreen

@Composable
fun Navigation(
    innerPadding: PaddingValues,
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Entries.name,
        modifier = modifier.padding(innerPadding)
    ) {
        composable(route = Screen.Entries.name) {
            EntriesScreen(navController)
        }
        composable(route = Screen.Settings.name) {
            SettingsScreen(navController)
        }
    }
}
