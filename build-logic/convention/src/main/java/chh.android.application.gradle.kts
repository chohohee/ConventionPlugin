import com.chh.convention.configureHiltAndroid
import com.chh.convention.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()