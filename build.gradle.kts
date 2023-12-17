plugins {
    // Top-level plugins, applied to the project root.
    alias(libs.plugins.doctor)
    alias(libs.plugins.jetbrains.intellij.ext)
    alias(libs.plugins.kover)
    alias(libs.plugins.spotless)
    alias(libs.plugins.versions.check)
    alias(libs.plugins.versions.catalog.update)
}

doctor {
    disallowMultipleDaemons = true
    enableTestCaching = true
    failOnEmptyDirectories = true
    disallowCleanTaskDependencies = true
    warnIfKotlinCompileDaemonFallback = true
    warnWhenNotUsingParallelGC = false
    downloadSpeedWarningThreshold = .6f

    javaHome {
        ensureJavaHomeMatches = true
        ensureJavaHomeIsSet = true
        failOnError = false
    }
}
