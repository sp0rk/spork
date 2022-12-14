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
        vectorDrawables {
            useSupportLibrary = true
        }
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
        kotlinCompilerExtensionVersion = Version.compose
    }
}

dependencies {
    androidModuleCommonDependencies()
}
