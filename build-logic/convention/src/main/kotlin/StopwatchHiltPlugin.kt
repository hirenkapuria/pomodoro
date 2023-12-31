import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class StopwatchHiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("kotlin-kapt")
                apply("dagger.hilt.android.plugin")
            }
            dependencies {
                add("implementation", libs.hilt.android)
                add("kapt", libs.hilt.compiler)
            }
        }
    }
}
