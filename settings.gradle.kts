// ...
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
}

// ...


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        pkgst()
        google()
        mavenCentral()
    }
}

rootProject.name = "sample-android-gradle"
include(":app")

buildless {
    // settings go here (this block is optional)
}
