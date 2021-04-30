plugins {
    `kotlin-dsl`
}

apply (from="../repositories.gradle")

dependencies {
    implementation("com.android.tools.build:gradle:4.1.3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.31")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
}