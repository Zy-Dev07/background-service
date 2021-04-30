import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

fun BaseExtension.commonBuildTypes() {
    buildTypes {
        named("debug") {
            isMinifyEnabled = false
        }

        named ("release") {
            isMinifyEnabled = true
        }
    }
}

fun DefaultConfig.commonDefaultConfig() {
    minSdkVersion(Version.minSdk)
    targetSdkVersion(Version.targetSdk)
    versionCode = 1
    versionName = "1.0"
    multiDexEnabled = true
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

fun KotlinJvmOptions.commonOptions() {
    jvmTarget = "1.8"
}