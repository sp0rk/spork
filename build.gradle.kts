buildscript {
    repositories {
        google()
    }
}
plugins {
    id("com.android.application") version "7.3.1" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}
task("clean", type = Delete::class) {
    setDelete(rootProject.buildDir)
}
