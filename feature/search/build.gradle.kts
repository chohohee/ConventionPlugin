plugins {
    id("chh.android.library")
    id("chh.android.compose")
}

android {
    namespace = "com.chh.convention.feature.search"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
}
