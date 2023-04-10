package io.github.sp0rk.spork.feature.entries.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import io.github.sp0rk.designsystem.component.isScrollingUp
import io.github.sp0rk.spork.R
import io.github.sp0rk.spork.feature.entries.EntryListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntriesScreen(navController: NavHostController, viewModel: EntriesViewModel = hiltViewModel()) {

    val entries = viewModel.queryEntries().collectAsState(emptyList())

    val listState = rememberLazyListState()
    val context = LocalContext.current
    var showCustomDialog by remember {
        mutableStateOf(false)
    }

    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text(stringResource(id = R.string.details)) },
                icon = { Icon(Icons.Filled.Add, stringResource(id = R.string.details)) },
                expanded = listState.isScrollingUp(),
                onClick = {
                    showCustomDialog = true
                }
            )
        }) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxWidth()
        ) {
            EntryListContent(
                entries = entries.value,
                navController = navController,
                listState = listState
            )
        }
    }

    if (showCustomDialog) {

    }
}

