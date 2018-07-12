import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

description = "TODO"
// lists / colletions example
// extension methods instead of jvmstatic

group = "com.andrewreitz.kotlin"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.50"

    repositories {
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
    
}

apply {
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))

    compile("io.reactivex.rxjava2:rxjava:2.1.16")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

