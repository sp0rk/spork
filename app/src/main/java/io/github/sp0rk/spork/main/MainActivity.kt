package io.github.sp0rk.spork.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHostController
import dagger.hilt.android.AndroidEntryPoint
import io.github.sp0rk.designsystem.theme.SporkTheme

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SporkTheme(darkTheme = false) {
                SporkUi()
            }
        }
    }
}

