// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    dependencies {
        classpath ("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id ("androidx.navigation.safeargs") version "2.5.0" apply false
    id("com.google.protobuf") version "0.9.4" apply false
}
