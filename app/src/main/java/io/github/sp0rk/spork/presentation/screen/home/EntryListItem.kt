package io.github.sp0rk.spork.presentation.screen.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.github.sp0rk.domain.model.Entry
import io.github.sp0rk.spork.ui.component.ObfuscatedText
import io.github.sp0rk.spork.ui.theme.Typography

@Composable
fun EntryItem(entry: Entry, navController: NavHostController) {
    var obfuscated by remember {
        mutableStateOf(true)
    }
    ElevatedCard(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
    ) {
        ConstraintLayout(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
        ) {
            val (name, value, edit, reveal, copy, divider) = createRefs()
            Text(
                text = entry.name,
                style = Typography.titleMedium,
                modifier = Modifier.constrainAs(name) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start, margin = 8.dp)
                })

            ObfuscatedText(
                obfuscated = obfuscated,
                text = entry.value,
                style = Typography.bodyMedium,
                modifier = Modifier.constrainAs(value) {
                    top.linkTo(name.bottom, margin = 4.dp)
                    start.linkTo(name.start)
                })

            Divider(modifier = Modifier.constrainAs(divider) {
                top.linkTo(value.bottom, margin = 32.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

            Button(
                onClick = { obfuscated = !obfuscated },
                content = {
                    Text(
                        text = if (obfuscated) {
                            "Reveal"
                        } else {
                            "Hide"
                        }
                    )
                },
                modifier = Modifier.constrainAs(reveal) {
                    top.linkTo(divider.bottom, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                })

            TextButton(
                onClick = {},
                content = { Text(text = "Copy") },
                modifier = Modifier.constrainAs(copy) {
                    top.linkTo(divider.bottom, margin = 8.dp)
                    end.linkTo(reveal.start, margin = 8.dp)
                })

            TextButton(
                onClick = {},
                content = { Text(text = "Edit") },
                modifier = Modifier.constrainAs(edit) {
                    top.linkTo(divider.bottom, margin = 8.dp)
                    end.linkTo(copy.start, margin = 8.dp)
                })
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    EntryItem(
        Entry(name = "Overview", value = "https://http.cat/404", security = 0),
        rememberNavController()
    )
}
