plugins {
    id("chh.android.library")
    id("chh.android.compose")
    id("chh.hilt.android")
}

android {
    namespace = "com.chh.convention.feature.main"
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.search)
    implementation(projects.core.designsystem)
    implementation(projects.core.navigation)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
}
