@file:Suppress("SpellCheckingInspection", "unused", "ClassName")

package dependencies

object libs {

    object kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    }

    object koin {
        private const val commonVersion = "2.2.0"

        const val runtime = "org.koin:koin-android:$commonVersion"
        const val scope = "org.koin:koin-androidx-scope:$commonVersion"
        const val viewModel = "org.koin:koin-androidx-viewmodel:$commonVersion"
        const val test = "org.koin:koin-test:$commonVersion"
    }

    object jetbrains {
        object coroutines {
            private const val commonVersion = "1.4.0-M1"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$commonVersion"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$commonVersion"
            const val play_services = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$commonVersion"
        }
    }

    object androidx {

        const val core = "androidx.core:core-ktx:1.3.2"
        const val app_compat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val cardview = "androidx.cardview:cardview:1.0.0"
        const val annotation = "androidx.annotation:annotation:1.1.0"
        const val activity = "androidx.activity:activity-ktx:1.2.0-rc01"
        const val browser = "androidx.browser:browser:1.2.0"

        object work {
            private const val commonVersion = "2.5.0"
            const val ktx = "androidx.work:work-runtime-ktx:$commonVersion"
            const val gcm = "androidx.work:work-gcm:$commonVersion"
            const val test = "androidx.work:work-testing:$commonVersion"
            const val multiprocess = "androidx.work:work-multiprocess:$commonVersion"
        }

        object navigation {
            private const val commonVersion = "2.3.3"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$commonVersion"
            const val ui = "androidx.navigation:navigation-ui-ktx:$commonVersion"
            const val plugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$commonVersion"
        }

        object test {
            const val junit = "androidx.test.ext:junit:1.1.2"
            const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        }

        object lifecycle {
            private const val commonVersion = "2.3.0-alpha06"

            const val common = "androidx.lifecycle:lifecycle-common-java8:$commonVersion"
            const val process = "androidx.lifecycle:lifecycle-process:$commonVersion"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$commonVersion"
            const val testing = "androidx.lifecycle:lifecycle-runtime-testing:$commonVersion"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$commonVersion"
            const val savedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$commonVersion"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$commonVersion"
        }

        object room {
            private const val commonVersion = "2.2.5"
            const val runtime = "androidx.room:room-runtime:$commonVersion"
            const val compiler = "androidx.room:room-compiler:$commonVersion"
        }
    }

    object squareup {

        object retrofit {
            private const val commonVersion = "2.9.0"
            const val runtime = "com.squareup.retrofit2:retrofit:$commonVersion"
            const val gson = "com.squareup.retrofit2:converter-gson:$commonVersion"
            const val moshi = "com.squareup.retrofit2:converter-moshi:$commonVersion"
        }

        object okhttp {
            private const val commonVersion = "4.9.1"
            const val runtime = "com.squareup.okhttp3:okhttp:$commonVersion"
            const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:$commonVersion"
            const val mockwebserver = "com.squareup.okhttp3:mockwebserver:$commonVersion"
        }
    }

    object github {
        object whataa {
            object pandora {
                const val runtime = "com.github.whataa:pandora:androidx_v2.1.0"
                const val no_op = "com.github.whataa:pandora-no-op:v2.0.3"
            }
        }
    }


    object google {
        object android {
            const val material = "com.google.android.material:material:1.3.0"
        }
    }

    object airbnb {
        private const val commonVersion ="4.3.1"
        const val epoxy = "com.airbnb.android:epoxy:$commonVersion"
        const val epoxy_processor = "com.airbnb.android:epoxy-processor:$commonVersion"
    }

    object junit {
        const val junit = "junit:junit:4.12"
    }

    object mockito {
        const val mockito = "org.mockito:mockito-core:1.10.19"
    }

    object desugar {
        const val jdk = "com.android.tools:desugar_jdk_libs:1.1.5"
    }
}