pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Stellar"
include(":app")
include(":core:ui")
include(":core:util")
include(":data:mongo")
include(":feature:auth")
include(":feature:home")
include(":feature:write")
