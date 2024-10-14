plugins {
    id("chh.android.feature")
}

android {
    namespace = "com.chh.convention.feature.main"
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.search)
}
