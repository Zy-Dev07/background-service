plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {

    setCompileSdkVersion(Version.compiledSdk)

    defaultConfig {
        commonDefaultConfig()

        // from original source: Use only English resources by libraries such as AppCompat and discard
        // resources of other languages
        resConfigs("en")
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    commonBuildTypes()
    kotlinOptions.commonOptions()
}