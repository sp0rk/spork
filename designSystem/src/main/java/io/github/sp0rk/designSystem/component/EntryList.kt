package io.github.sp0rk.designSystem.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

@Composable
fun EntryList(messages: List<Entry>) {
    LazyColumn {
        messages.map { item { EntryCard(it) } }
    }
}
