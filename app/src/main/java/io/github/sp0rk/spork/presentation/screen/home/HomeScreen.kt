package io.github.sp0rk.spork.presentation.screen.home


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import io.github.sp0rk.spork.ui.theme.AppContentColor
import io.github.sp0rk.spork.ui.theme.AppThemeColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel = hiltViewModel()) {

    val systemUiController = rememberSystemUiController()
    val systemBarColor = MaterialTheme.colors.AppThemeColor
    val entries = viewModel.queryEntries().collectAsState(emptyList())

    SideEffect {
        systemUiController.setStatusBarColor(
            color = systemBarColor
        )
    }

    Scaffold(
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        contentColor = MaterialTheme.colors.AppContentColor,
        topBar = {
            HomeTopBar()
        },
        content = {
            EntryListContent(entries = entries.value, navController = navController)
        }
    )
}

