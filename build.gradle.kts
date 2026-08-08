plugins {
    java
}

group = "com.example.plugin"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io") // Откуда брать код Майнкрафта
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT") // Версия 1.21.4
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(21) // Для 1.21.4 нужна именно Java 21
}

tasks.jar {
    archiveFileName.set("MyFirstPlugin.jar") // Имя готового файла
}
