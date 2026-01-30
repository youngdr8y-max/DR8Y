plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "org.example"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.example.dr8y"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
}
