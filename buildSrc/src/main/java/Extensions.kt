import org.gradle.api.artifacts.dsl.DependencyHandler

private fun DependencyHandler.implementation(dependencyNotation: Any) =
    add("implementation", dependencyNotation)

private fun DependencyHandler.kapt(dependencyNotation: Any) =
    add("kapt", dependencyNotation)

private fun DependencyHandler.testImplementation(dependencyNotation: Any) =
    add("testImplementation", dependencyNotation)

private fun DependencyHandler.androidTestImplementation(dependencyNotation: Any) =
    add("androidTestImplementation", dependencyNotation)

private fun DependencyHandler.debugImplementation(dependencyNotation: Any) =
    add("debugImplementation", dependencyNotation)

fun DependencyHandler.androidModuleCommonDependencies() {
    implementation("androidx.core:core-ktx:${Version.coreKtx}")
    implementation("androidx.compose.ui:ui:${Version.compose}")
    implementation("androidx.compose.material:material:${Version.compose}")
    implementation("androidx.compose.ui:ui-tooling-preview:${Version.compose}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycleRuntimeKtx}")
    implementation("androidx.activity:activity-compose:${Version.activityCompose}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.google.dagger:hilt-android:${Version.hilt}")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("io.coil-kt:coil-compose:1.4.0")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")
    kapt("com.google.dagger:hilt-android-compiler:2.44")


    testImplementation("junit:junit:${Version.junit}")

    androidTestImplementation("androidx.test.ext:junit:${Version.extJunit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Version.espressoCore}")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Version.compose}")

    debugImplementation("androidx.compose.ui:ui-tooling:${Version.compose}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Version.compose}")
}
