package com.chh.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureHiltAndroid() {
    with(plugins) {
        apply("dagger.hilt.android.plugin")
        apply("com.google.devtools.ksp")
    }

    dependencies {
        implementation(libs.findLibrary("hilt.android"))
        ksp(libs.findLibrary("hilt.compiler"))
    }
}