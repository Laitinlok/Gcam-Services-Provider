plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "de.lukaspieper.gcam.services"
    compileSdk = 36

    defaultConfig {
        minSdk = 19
        targetSdk = 35
        versionCode = 301776834
        versionName = "1.6.1"
    }

    flavorDimensions.add("default")
    productFlavors {
        create("basic") {
            dimension = "default"
            applicationId = "de.lukaspieper.gcam.services"
        }
        create("photos") {
            dimension = "default"
            applicationId = "com.google.android.apps.photos"
        }
        create("photosonly") {
            dimension = "default"
            applicationId = "com.google.android.apps.photos"
        }
        // Spoofs the Google Search / Google Quick Search Box app package.
        // This enables GCam to access authorities and services that require
        // com.google.android.googlequicksearchbox to be installed.
        // Inspired by: https://github.com/SolidEva/Gapp-Package-Spoof
        create("gapp") {
            dimension = "default"
            applicationId = "com.google.android.googlequicksearchbox"
            versionCode = 100000010
            versionName = "1.6.1"
        }
    }

    // No benefit outside of Google Play, disabled for IzzyOnDroid
    // https://github.com/lukaspieper/Gcam-Services-Provider/issues/122#issuecomment-1930811074
    dependenciesInfo {
        includeInApk = false
        includeInBundle = false
    }
}
