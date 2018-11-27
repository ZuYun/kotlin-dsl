import build.*

plugins {
    `public-kotlin-dsl-module`
}

base {
    archivesBaseName = "gradle-kotlin-dsl-provider-plugins"
}

dependencies {
    compileOnly("org.gradle:gradle-plugins") {
        exclude(module = "sisu-inject-plexus")
    }

    compile(project(":provider"))
}
