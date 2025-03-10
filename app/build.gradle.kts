plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.fyp_casio"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.fyp_casio"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.appdistribution.gradle)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.compose.material:material-icons-extended:1.4.3")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")

// GSON converter for JSON parsing
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

// OkHttp for enhanced network logging (optional but recommended)
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.3")

}