plugins {
    id("chh.android.library")
    id("chh.android.compose")
}

android {
    namespace = "com.chh.convention.feature.home"
}

dependencies {
    implementation(projects.core.designsystem)
    implementation(projects.core.navigation)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
}
