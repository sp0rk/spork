package io.github.sp0rk.spork

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHostController
import dagger.hilt.android.AndroidEntryPoint
import io.github.sp0rk.spork.presentation.navigation.SporkApp
import io.github.sp0rk.spork.ui.theme.SporkTheme

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SporkTheme(darkTheme = false) {
                SporkApp()
            }
        }
    }
}

