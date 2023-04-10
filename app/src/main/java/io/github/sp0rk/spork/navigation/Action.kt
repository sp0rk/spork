package io.github.sp0rk.spork.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import io.github.sp0rk.spork.R

enum class Action(val compose: @Composable (NavController) -> Unit) {
    Settings(compose = { navController ->
        IconButton(onClick = { navController.navigate(Screen.Settings.name) }) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = stringResource(R.string.settings),
            )
        }
    }),
    ;
}
