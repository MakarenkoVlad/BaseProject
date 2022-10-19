import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

fun Project.setupCommon(namespace: String) {
    pluginManager.apply("org.jetbrains.kotlin.android")
    pluginManager.apply("com.google.devtools.ksp")
    applyCommonExtension {
        this.namespace = namespace
        compileSdk = Config.COMPILE_SDK

        defaultConfig {
            minSdk = Config.MIN_SDK

            testInstrumentationRunner = Config.TEST_INSTRUMENTATION_RUNNER
            vectorDrawables {
                useSupportLibrary = true
            }
        }

        compileOptions {
            sourceCompatibility = Config.CompileOptions.SOURCE_COMPATIBILITY
            targetCompatibility = Config.CompileOptions.TARGET_COMPATIBILITY
        }

        packagingOptions {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }

        kotlinOptions {
            jvmTarget = Config.JVM_TARGET
        }

        sourceSets.getByName("main") {
            kotlin.srcDir("build/generated/ksp/$name/kotlin")
        }
    }
}

fun Project.setupCompose() {
    applyCommonExtension {
        buildFeatures {
            compose = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = Versions.KOTLIN_COMPILER_EXTENSION_VERSION
        }
    }
}

fun AnyCommonExtension.kotlinOptions(block: KotlinJvmOptions.() -> Unit) {
    (this as ExtensionAware).extensions.configure("kotlinOptions", block)
}

