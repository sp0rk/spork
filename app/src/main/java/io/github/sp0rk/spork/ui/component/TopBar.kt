package io.github.sp0rk.spork.ui.component

import android.content.Context
import androidx.biometric.BiometricManager.Authenticators
import androidx.biometric.BiometricPrompt
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHostController
import io.github.sp0rk.spork.presentation.navigation.Screen
import io.github.sp0rk.spork.ui.theme.Typography

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TopBar(
//    navController: NavHostController
//) {
//    TopAppBar(
//        navigationIcon = {
//            if (navController.currentDestination?.route != Screen.Entries.route) {
//                IconButton(onClick = {
//                    navController.navigateUp()
//                }) {
//                    Icon(
//                        imageVector = Icons.Default.ArrowBack,
//                        contentDescription = "Back",
//                        tint = MaterialTheme.colorScheme.primary
//                    )
//                }
//            }
//        },
//        title = {
//            Text(
//                text = navController.currentDestination!!.displayName,
//                style = Typography.titleLarge
//            )
//        },
//        actions = {
//            if (navController.currentDestination?.route != Screen.Settings.route) {
//                IconButton(onClick = {
//                    navController.navigate(Screen.Settings.route)
//                }) {
//                    Icon(
//                        imageVector = Icons.Default.Settings,
//                        contentDescription = "Settings",
//                        tint = MaterialTheme.colorScheme.primary
//                    )
//                }
//            }
//        }
//    )
//}

fun showBiometrics(context: Context) {
    val executor = ContextCompat.getMainExecutor(context)
    val biometricPrompt = BiometricPrompt(context as FragmentActivity, executor,
        object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationError(
                errorCode: Int,
                errString: CharSequence
            ) {
                super.onAuthenticationError(errorCode, errString)
                println("Jurec error $errorCode $errString")
            }

            override fun onAuthenticationSucceeded(
                result: BiometricPrompt.AuthenticationResult
            ) {
                super.onAuthenticationSucceeded(result)
                println("Jurec success $result")
            }

            override fun onAuthenticationFailed() {
                super.onAuthenticationFailed()
                println("Jurec failed")
            }
        })
    val promptInfo = BiometricPrompt.PromptInfo.Builder()
        .setTitle("Biometric login for my app")
        .setSubtitle("Log in using your biometric credential")
        .setAllowedAuthenticators(Authenticators.DEVICE_CREDENTIAL or Authenticators.BIOMETRIC_STRONG)
        .build()

    biometricPrompt.authenticate(promptInfo)
//        println("Jurec checking")
//        val biometricManager = BiometricManager.from(context)
//        when (biometricManager.canAuthenticate(BiometricManager.Authenticators.BIOMETRIC_STRONG or BiometricManager.Authenticators.DEVICE_CREDENTIAL)) {
//            BiometricManager.BIOMETRIC_SUCCESS ->
//                println("Jurec App can authenticate using biometrics.")
//            BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE ->
//                println("Jurec No biometric features available on this device.")
//            BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE ->
//                println("Jurec Biometric features are currently unavailable.")
//            BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED -> {
//                // Prompts the user to create credentials that your app accepts.
//                println("Jurec none enrolled")
//                val enrollIntent = Intent(Settings.ACTION_BIOMETRIC_ENROLL).apply {
//                    putExtra(
//                        Settings.EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED,
//                        BiometricManager.Authenticators.BIOMETRIC_STRONG or BiometricManager.Authenticators.DEVICE_CREDENTIAL
//                    )
//                }
//                ActivityCompat.startActivityForResult(context as Activity, enrollIntent, 1, null)
//            }
//        }
//        println("Jurec checked")
}
