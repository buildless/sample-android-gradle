@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        maven("https://gradle.pkg.st")
        maven("https://maven.pkg.st")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("build.less") version "1.0.0-rc2"
    id("com.gradle.enterprise") version("3.15.1")
    id("com.gradle.common-custom-user-data-gradle-plugin") version("1.12")
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.7.0")
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

buildscript {
    repositories {
        maven("https://gradle.pkg.st")
        maven("https://maven.pkg.st")
        google()
    }
    dependencies {
        classpath("com.google.guava:guava") {
            version {
                strictly("32.1.3-android")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS

    repositories {
        pkgst()
        google()
        mavenCentral()
    }
}

rootProject.name = "sample-android-gradle"

include(
    ":app"
)

buildless {
    // settings go here (this block is optional)
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("GROOVY_COMPILATION_AVOIDANCE")
