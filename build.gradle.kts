plugins {
    java
}

group = "com.login19ruman1.enderportal"
version = "1.0.0"

repositories {
    mavenCentral()
    // Основной и резервные репозитории для Paper API версии 1.21.4
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://papermc.io")
    maven("https://repo.stellardrift.ca/maven/snapshots/")
}

dependencies {
    // API для разработки плагинов под версию 1.21.4
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
    archiveFileName.set("Enderportal3.jar")
    from(sourceSets.main.get().output)
}
