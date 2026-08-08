plugins {
    java
}

group = "com.login19ruman1.enderportal"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(21)
}

tasks.build {
    dependsOn(tasks.jar)
}

tasks.jar {
    archiveFileName.set("Enderportal.jar")
    from(sourceSets.main.get().output)
}
