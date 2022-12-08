buildscript {
    repositories {
        google()
    }
}

plugins {
    id("com.android.application") version Version.androidPlugin apply false
    id("com.android.library") version Version.androidPlugin apply false
    id("org.jetbrains.kotlin.android") version Version.kotlinPlugin apply false
}
task("clean", type = Delete::class) {
    setDelete(rootProject.buildDir)
}
