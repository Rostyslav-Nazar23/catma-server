plugins {
    kotlin("jvm") version "2.0.21"
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlin.serialization)
}

group = "com.rnazarenko.catma.server"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    maven { url = uri("https://packages.confluent.io/maven/") }
}

dependencies {

    // exposed libs
    implementation(libs.bundles.exposed)

    // ktor server task scheduling
    implementation(libs.bundles.ktor.task.scheduling)

    // ktor server
    implementation(libs.bundles.ktor.server)
    testImplementation(libs.ktor.server.test.host)

    // serialization
    implementation(libs.ktor.serilization)

    // h2 database
    implementation(libs.h2.database)

    // koin
    implementation(libs.bundles.koin)

    // qos logback
    implementation(libs.qos.logback)

    // kotlin test unit
    testImplementation(libs.kotlin.test.unit)

}
