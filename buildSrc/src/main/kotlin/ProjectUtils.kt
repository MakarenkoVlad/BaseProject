import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType

typealias AnyCommonExtension = CommonExtension<*, *, *, *>

fun Project.applyCommonExtension(configure: AnyCommonExtension.() -> Unit) {
    (extensions.getByName("android") as AnyCommonExtension).configure()
}

fun Project.applyApplicationExtension(configure: ApplicationExtension.() -> Unit) {
    (extensions.getByName("android") as ApplicationExtension).configure()
}

fun Project.setupKsp() {
    pluginManager.apply("com.google.devtools.ksp")

    applyCommonExtension {
        sourceSets {
            getByName(name) {
                kotlin.srcDir("build/generated/ksp/$name/kotlin")
            }
        }
    }
}