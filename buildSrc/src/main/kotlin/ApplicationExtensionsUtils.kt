import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

fun Project.setupApplication(namespace: String) {
    pluginManager.apply("com.android.application")
    setupCommon(namespace)
    applyApplicationExtension {
        defaultConfig {
            applicationId = Config.APPLICATION_ID
            targetSdk = Config.TARGET_SDK
            versionCode = Config.VERSION_CODE
            versionName = Config.VERSION_NAME
        }

        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
    }
}