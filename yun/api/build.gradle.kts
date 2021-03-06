dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    api(project(":domain"))
    api(project(":service:service-order"))
//    api(project(":test-support"))

    runtimeOnly("com.h2database:h2")
}