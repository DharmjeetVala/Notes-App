plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.notes_application"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notes_application"
        minSdk = 26
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Room (For Database)
    implementation ("androidx.room:room-runtime:2.2.5")
    annotationProcessor ("androidx.room:room-compiler:2.2.5")

    //recyclerview
    implementation ("androidx.recyclerview:recyclerview:1.1.0")

    //diff screen size
    implementation  ("com.intuit.sdp:sdp-android:1.0.6")
    implementation  ("com.intuit.ssp:ssp-android:1.0.6")

    //material design
    implementation ("com.google.android.material:material:1.1.0")

    //rounded image view
    implementation ("com.makeramen:roundedimageview:2.3.0")
}