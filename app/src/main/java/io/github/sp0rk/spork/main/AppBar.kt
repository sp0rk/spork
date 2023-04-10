@file:OptIn(ExperimentalMaterial3Api::class)

package io.github.sp0rk.spork.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import io.github.sp0rk.spork.R
import io.github.sp0rk.spork.navigation.Screen

@Composable
fun AppBar(
    navController: NavHostController,
    currentScreen: Screen,
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navController::navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back)
                    )
                }
            }
        },
        modifier = modifier,
        title = { Text(stringResource(currentScreen.title)) },
        actions = {
            currentScreen.actions.forEach { action ->
                action.compose(navController)
            }
        }
    )
}
