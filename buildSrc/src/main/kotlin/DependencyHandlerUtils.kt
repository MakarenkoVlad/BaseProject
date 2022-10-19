import org.gradle.api.artifacts.dsl.DependencyHandler

private typealias DependencyHandlerLambda = DependencyHandler.() -> Unit

fun String.asDefaultDepLambda(): DependencyHandlerLambda = {
    add("implementation", this@asDefaultDepLambda)
}

fun String.asTestDepLambda(): DependencyHandlerLambda = {
    add("testImplementation", this@asTestDepLambda)
}

fun String.asAndroidTestDepLambda(): DependencyHandlerLambda = {
    add("androidTestImplementation", this@asAndroidTestDepLambda)
}

fun String.asDebugDepLambda(): DependencyHandlerLambda = {
    add("debugImplementation", this@asDebugDepLambda)
}

fun String.asKspDepLambda(): DependencyHandlerLambda = {
    add("ksp", this@asKspDepLambda)
}

operator fun DependencyHandlerLambda.plus(lambda: DependencyHandlerLambda): DependencyHandlerLambda = {
    this@plus()
    lambda()
}