import build.less.plugin.settings.buildless

// ...
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("build.less") version "1.0.0-beta1"
}

// ...


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "sample-android-gradle"
include(":app")

buildless {
    // settings go here
}