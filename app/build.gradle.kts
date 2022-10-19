setupApplication("vlad.makarenko.initialproject")
//setupKsp()

//android {
//
//}

dependencies {
    Deps.run {
        CoreKtx()
        ActivityCompose()
        ComposeUi()
        ComposeUiToolingPreview()
        ComposeMaterial3()
        JUnit()
        AndroidJUnit()
        EspressoCore()
        ComposeTest()
        ComposeDebugUiTooling()
        ComposeDebugUiTestManifest()

        Koin()

        ComposeDestinations()
    }
}