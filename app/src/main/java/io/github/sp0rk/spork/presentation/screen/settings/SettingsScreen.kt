package io.github.sp0rk.spork.presentation.screen.settings


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import io.github.sp0rk.spork.ui.component.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    navController: NavHostController,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopBar(navController)
        }) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxWidth()
        ) {
        }
    }
}

