plugins {
    id("chh.android.application")
    id("chh.hilt.android")
}

android {
    namespace = "com.chh.convention"

    defaultConfig {
        applicationId = "com.chh.convention"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.feature.main)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
