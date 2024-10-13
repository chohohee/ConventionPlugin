plugins {
    id("chh.android.feature")
    id("chh.hilt.android")
}

android {
    namespace = "com.chh.convention.feature.main"
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.search)
}
