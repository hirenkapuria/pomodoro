import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class StopwatchAndroidLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.android.library")
                apply("kotlin-android")
            }
            extensions.configure(BaseExtension::class.java) {
                commonAndroid(project)
            }
        }
    }
}
