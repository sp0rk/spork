@file:OptIn(ExperimentalMaterial3Api::class)

package io.github.sp0rk.spork.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.github.sp0rk.spork.presentation.screen.home.EntriesScreen
import io.github.sp0rk.spork.presentation.screen.settings.SettingsScreen

@Composable
fun SporkApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = Screen.valueOf(
        backStackEntry?.destination?.route ?: Screen.Entries.name
    )

    Scaffold(
        topBar = {
            AppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navController = navController
            )
        }
    ) { innerPadding ->
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
}
