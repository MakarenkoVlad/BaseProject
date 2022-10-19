object Deps {

    // Core
    val CoreKtx = "androidx.core:core-ktx:1.7.0".asDefaultDepLambda()

    // Test
    val JUnit = "junit:junit:4.13.2".asTestDepLambda()
    val AndroidJUnit = "androidx.test.ext:junit:1.1.3".asAndroidTestDepLambda()
    val EspressoCore = "androidx.test.espresso:espresso-core:3.4.0".asAndroidTestDepLambda()
    val ComposeTest = "androidx.compose.ui:ui-test-junit4:1.1.1".asAndroidTestDepLambda()

    // Compose
    val ActivityCompose = "androidx.activity:activity-compose:1.3.1".asDefaultDepLambda()
    val ComposeUi = "androidx.compose.ui:ui:1.1.1".asDefaultDepLambda()
    val ComposeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:1.1.1".asDefaultDepLambda()
    val ComposeMaterial3 = "androidx.compose.material3:material3:1.0.0-alpha02".asDefaultDepLambda()
    val ComposeDebugUiTooling = "androidx.compose.ui:ui-tooling:1.1.1".asDebugDepLambda()
    val ComposeDebugUiTestManifest = "androidx.compose.ui:ui-test-manifest:1.1.1".asDebugDepLambda()

    // Koin
    val Koin = "io.insert-koin:koin-core:3.2.2".asDefaultDepLambda() +
            "io.insert-koin:koin-annotations:1.0.3".asDefaultDepLambda() +
            "io.insert-koin:koin-ksp-compiler:1.0.3".asDefaultDepLambda()

    // Compose destinations
    val ComposeDestinations = "io.github.raamcosta.compose-destinations:core:1.7.22-beta".asDefaultDepLambda() +
            "io.github.raamcosta.compose-destinations:ksp:1.7.22-beta".asKspDepLambda()
}