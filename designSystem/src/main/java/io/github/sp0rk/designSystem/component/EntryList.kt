package io.github.sp0rk.designSystem.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import io.github.sp0rk.domain.model.Entry
import io.github.sp0rk.domain.model.EntryListPreviewParamProvider
import io.github.sp0rk.domain.model.EntryPreviewParamProvider

@Composable
fun EntryList(entries: List<Entry>) {
    LazyColumn {
        entries.map { item { EntryCard(it) } }
    }
}

@Preview(
    name = "Entry List",
    showBackground = true
)
@Composable
fun EntryListPreview(@PreviewParameter(EntryListPreviewParamProvider::class) entries: List<Entry>) {
    EntryList(entries = entries)
}

@Preview(
    name = "Entry List 2",
    showBackground = true
)
@Composable
fun EntryListPreview2() {
    EntryList(entries = EntryPreviewParamProvider().values.toList())
}
