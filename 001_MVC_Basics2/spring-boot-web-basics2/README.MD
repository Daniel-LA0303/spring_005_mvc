# MVC Basics

## Description

This project covers the MVC pattern in a Spring Boot application. It includes the following key topics:

- @PathVariable
- @Value, @GetMapping, @PostMapping, @RestController, @RequestMapping
- Model to show tempaltes thymeleaf
- DTOs
- redirect: usage
- @RequestBody
- @Configuration
- @PropertySource / @PropertySources
- Read text.properties
- Read json
- Add simple styles
- Unit and integration tests

## Quick Start

### Prerequisites

- Java 11+ (recommended for Spring Boot 3+)
- Spring Boot version: 2.1.3
- Maven (optional, since `mvnw` is included)
- IDE: IntelliJ, Eclipse, or VS Code

### Run the Application

1. Execute the application:
   - **Windows**:
     ```bash
     mvnw.cmd clean spring-boot:run
     ```
   - **Linux/macOS**:
     ```bash
     ./mvnw clean spring-boot:run
     ```
   - **Using global Maven installation**:
     ```bash
     mvn clean spring-boot:run
     ```

   - **Run with a specific profile**:
     ```bash
     mvnw spring-boot:run -Dspring-boot.run.profiles=dev
     ```

2. Access the application:
   - Default URL: `http://localhost:8080`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
