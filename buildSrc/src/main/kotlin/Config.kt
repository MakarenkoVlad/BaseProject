import org.gradle.api.JavaVersion

object Config {
    const val APPLICATION_ID = "vlad.makarenko.initialproject"
    const val COMPILE_SDK = 32
    const val TARGET_SDK = 32
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val MIN_SDK = 23
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    object CompileOptions {
        val SOURCE_COMPATIBILITY = JavaVersion.VERSION_1_8
        val TARGET_COMPATIBILITY = JavaVersion.VERSION_1_8
    }

    const val JVM_TARGET = "1.8"
}