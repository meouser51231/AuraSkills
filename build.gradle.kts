plugins {
    java
    idea
}

repositories {
    mavenCentral()
}

dependencies {

}

allprojects {
    group = "dev.aurelium.auraskills"
    version = project.property("projectVersion") as String
    description = "Advanced skills, stats, and abilties plugin"
}

java.sourceCompatibility = JavaVersion.VERSION_17

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}