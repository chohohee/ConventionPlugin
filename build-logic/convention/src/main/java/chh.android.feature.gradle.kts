import com.chh.convention.configureHiltAndroid
import com.chh.convention.implementation
import com.chh.convention.libs
import org.gradle.kotlin.dsl.dependencies

plugins {
    id("chh.android.library")
    id("chh.android.compose")
}

configureHiltAndroid()

dependencies {
    implementation(project(":core:designsystem"))
    implementation(project(":core:navigation"))

    implementation(libs.findLibrary("androidx.navigation.compose"))
    implementation(libs.findLibrary("hilt.navigation.compose"))
}