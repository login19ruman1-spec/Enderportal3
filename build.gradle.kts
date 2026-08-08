plugins {
    java
}

group = "com.example.plugin"
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

// Принудительно заставляем Gradle собирать JAR при команде build
tasks.build {
    dependsOn(tasks.jar)
}

tasks.jar {
    archiveFileName.set("Enderportal3")
    // Важная строка: собираем плагин, даже если нет сложной структуры
    from(sourceSets.main.get().output) 
}

