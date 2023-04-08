object BuildPlugins {

}

object Dependencies {
    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"

    val androidX = object {
        val appCompat = "androidx.appcompat:appcompat:1.6.1"
        val core = "androidx.core:core-ktx:1.7.0"
        val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        val junit = "androidx.test.ext:junit:1.1.5"

        val compose = object {
            val bom = "androidx.compose:compose-bom:${Versions.compoBom}"
            val ui = "androidx.compose.ui:ui"
            val tollingPreview = "androidx.compose.ui:ui-tooling-preview"
            val icons =
                "androidx.compose.material:material-icons-extended"
            val composeNavigation =
                "androidx.navigation:navigation-compose:${Versions.composeNav}"
            val viewModel =
                "androidx.lifecycle:lifecycle-viewmodel-compose"
            val activity = "androidx.activity:activity-compose"
            val material3 =
                "androidx.compose.material3:material3"
            val uiTest = "androidx.compose.ui:ui-test"
            val junit4 = "androidx.compose.ui:ui-test-junit4"
            val manifest = "androidx.compose.ui:ui-test-manifest"
            val composeWindowsSize =
                "androidx.compose.material3:material3-window-size-class"
        }
    }

    const val junit = "junit:junit:4.13.2"
}
