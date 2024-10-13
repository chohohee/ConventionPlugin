import com.chh.convention.implementation
import com.chh.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("chh.android.library")
                apply("chh.android.compose")
            }

            dependencies {
                implementation(project(":core:designsystem"))
                implementation(project(":core:navigation"))

                implementation(libs.findLibrary("androidx.navigation.compose"))
                implementation(libs.findLibrary("hilt.navigation.compose"))
            }
        }
    }
}
