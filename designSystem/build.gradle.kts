val compose = "1.3.1"

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    val sdk = 33

    namespace = "io.github.sp0rk.designSystem"
    compileSdk = sdk

    defaultConfig {
        minSdk = 29
        targetSdk = sdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = compose
    }
}

dependencies {
    val coreKtx = "1.9.0"
    val lifecycleRuntimeKtx = "2.5.1"
    val activityCompose = "1.6.1"
    implementation("androidx.core:core-ktx:$coreKtx")
    implementation("androidx.compose.ui:ui:$compose")
    implementation("androidx.compose.material:material:$compose")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeKtx")
    implementation("androidx.activity:activity-compose:$activityCompose")

    val junit = "4.13.2"
    testImplementation("junit:junit:$junit")

    val extJunit = "1.1.4"
    val espressoCore = "3.5.0"
    androidTestImplementation("androidx.test.ext:junit:$extJunit")
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoCore")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$compose")

    debugImplementation("androidx.compose.ui:ui-tooling:$compose")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$compose")

}
