plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id("kotlin-kapt")

}

android {
    namespace = "com.example.myappnoticias"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myappnoticias"
        minSdk = 27
        targetSdk = 31
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //implementation("androidx.room:room-common:2.5.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    //implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    //implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")//2.7.7 32.7.3


    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.google.ar.sceneform:filament-android:1.17.1")
    implementation ("com.google.firebase:firebase-database:20.3.1")
    implementation ("com.google.firebase:firebase-firestore:24.10.3")

    implementation ("com.github.bumptech.glide:glide:4.15.1")
    implementation ("androidx.cardview:cardview:1.0.0")

    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.android.gms:play-services-auth:21.0.0") //auth:21.0.0  'com.firebaseui:firebase-ui-auth:7.2.0'
    implementation (platform("com.google.firebase:firebase-bom:32.7.3"))

    val room_version = "2.5.1"
    implementation ("androidx.room:room-runtime:$room_version")
    kapt ("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    //val kapt="androidx.room:room-compiler:$room_version"
    //implementation(kapt)
    //val ksp="androidx.room:room-compiler:$room_version"
    //implementation(ksp)

}