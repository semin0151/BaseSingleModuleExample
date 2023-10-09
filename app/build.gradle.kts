plugins {
    id(Plugin.application)
    id(Plugin.kotlin)
    id(Plugin.kapt)
    id(Plugin.protobuf) version (Plugin.Version.protobuf)
}

android {
    namespace = "com.semin.basesinglemoduleexample"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.semin.basesinglemoduleexample"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

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
    buildFeatures {
        buildConfig = true
        dataBinding = true
    }
}

dependencies {

    implementation(Dependency.AndroidX.KTX)
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Dependency.AndroidX.SPLASH_SCREEN)
    implementation(Dependency.Google.MATERIAL)

    // hilt
    implementation(Dependency.Google.HILT)
    kapt(Dependency.Google.HILT_COMPILER)

    // annotation
    implementation(Dependency.AndroidX.ANNOTATION)

    // coroutine
    implementation(Dependency.Kotlin.COROUTINE)

    // datastore
    implementation(Dependency.AndroidX.DATA_STORE)
    implementation(Dependency.AndroidX.DATA_STORE_CORE)
    implementation(Dependency.Google.PROTOBUF)

    // room
    implementation(Dependency.AndroidX.ROOM_RUNTIME)
    implementation(Dependency.AndroidX.ROOM_KTX)
    kapt(Dependency.AndroidX.ROOM_COMPILER)
    annotationProcessor(Dependency.AndroidX.ROOM_COMPILER)
    testImplementation(Dependency.AndroidX.ROOM_TEST)

    // retrofit
    implementation(Dependency.SquareUp.OKHTTP3)
    implementation(Dependency.SquareUp.OKHTTP3_INTERCEPTOR)
    implementation(Dependency.SquareUp.RETROFIT)
    implementation(Dependency.SquareUp.RETROFIT_CONVERTER_GSON)

    testImplementation(Dependency.Test.JUNIT)

    androidTestImplementation(Dependency.AndroidTest.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO)
}