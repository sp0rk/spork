package io.github.sp0rk.spork.presentation.screen.home


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import io.github.sp0rk.spork.R
import io.github.sp0rk.spork.ui.component.isScrollingUp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel = hiltViewModel()) {

    val entries = viewModel.queryEntries().collectAsState(emptyList())

    val listState = rememberLazyListState()

    Scaffold(
        topBar = {
            HomeTopBar()
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text(stringResource(id = R.string.details)) },
                icon = { Icon(Icons.Filled.Add, stringResource(id = R.string.details)) },
                expanded = listState.isScrollingUp(),
                onClick = {

                }
            )
        }) { contentPadding ->
        Box(modifier = Modifier
            .padding(contentPadding)
            .fillMaxWidth()) {
            EntryListContent(entries = entries.value, navController = navController, listState = listState)
        }
    }
}

