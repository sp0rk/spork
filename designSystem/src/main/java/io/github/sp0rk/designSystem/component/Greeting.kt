package io.github.sp0rk.designSystem.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.sp0rk.designSystem.theme.SporkTheme

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SporkTheme {
        Greeting("Android")
    }
}
