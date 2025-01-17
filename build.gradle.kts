plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    val openSearchSdkVersion = "2.14.0"
    implementation("org.opensearch.client:opensearch-java:${openSearchSdkVersion}")
    implementation("org.opensearch.client:opensearch-rest-client:${openSearchSdkVersion}")

    val elasticSdkVersion = "8.14.3"
    implementation("co.elastic.clients:elasticsearch-java:${elasticSdkVersion}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
