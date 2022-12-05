buildscript {
    repositories {
        google()
    }
}
plugins {
    val android = "7.3.1"
    val kotlin = "1.7.10"
    id("com.android.application") version android apply false
    id("com.android.library") version android apply false
    id("org.jetbrains.kotlin.android") version kotlin apply false
}
task("clean", type = Delete::class) {
    setDelete(rootProject.buildDir)
}
