package io.github.sp0rk.spork.presentation.screen.details

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.github.sp0rk.spork.ui.theme.AppContentColor
import io.github.sp0rk.spork.ui.theme.AppThemeColor


@Composable
fun MovieDetailsScreen(
    movieId: String,
    navController: NavController,
    viewModel: MovieDetailsViewModel = hiltViewModel(),
) {
    viewModel.getMovieDetails(movieID = movieId.toInt())
    val movieDetails by viewModel.selectedMovie.collectAsState()
    Scaffold(
        topBar={
               MovieDetailsTopBar(navController)
        },
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {
            movieDetails?.let { MovieDetailsContent(it) }
        })
}

