import com.chh.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configureAndroidCompose()
        }
    }
}
