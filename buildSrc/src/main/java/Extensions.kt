import org.gradle.api.artifacts.dsl.DependencyHandler

private fun DependencyHandler.implementation(dependencyNotation: Any) =
    add("implementation", dependencyNotation)

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

    testImplementation("junit:junit:${Version.junit}")

    androidTestImplementation("androidx.test.ext:junit:${Version.extJunit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Version.espressoCore}")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Version.compose}")

    debugImplementation("androidx.compose.ui:ui-tooling:${Version.compose}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Version.compose}")
}
