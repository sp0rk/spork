package io.github.sp0rk.spork.presentation.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.github.sp0rk.domain.model.Entry
import io.github.sp0rk.spork.ui.theme.ItemBackgroundColor

@Composable
fun EntryListContent(
    entries: List<Entry>,
    navController: NavHostController,
    listState: LazyListState
) {
    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
    ) {

        items(entries) { entry ->
            EntryListItem(entry = entry, navController = navController)
        }
    }
}

@Composable
fun EntryListItem(entry: Entry, navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp)
            .wrapContentHeight()
            .fillMaxWidth(),
        elevation = 4.dp,
        backgroundColor = MaterialTheme.colors.ItemBackgroundColor
    ) {
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Max)
                .fillMaxWidth()
                .clickable {
//                    navController.navigate(route = Screen.MovieDetails.passMovieId(movie.movieId.toString()))
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                Modifier
                    .height(IntrinsicSize.Max)
            ) {
                Text(text = entry.name, style = MaterialTheme.typography.body1)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = entry.value, style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    EntryListItem(
        Entry(name = "Overview", value = "https://http.cat/404", security = 0),
        rememberNavController()
    )
}
