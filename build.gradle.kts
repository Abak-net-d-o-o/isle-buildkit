buildscript {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("ca.islandora:isle-gradle-docker-plugin:0.0.4")
    }
}

apply(plugin = "IsleDocker")
