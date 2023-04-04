buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}")
    }
}
plugins {
    id("com.android.application") version Version.android apply false
    id("com.android.library") version Version.android apply false
    id("org.jetbrains.kotlin.android") version Version.kotlin apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
task("clean", type = Delete::class) {
    setDelete(rootProject.buildDir)
}
