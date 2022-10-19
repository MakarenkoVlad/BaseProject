import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle-api:7.3.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:1.7.20")
}