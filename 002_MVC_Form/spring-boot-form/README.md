# MVC Basics

## Description

This project covers the MVC pattern in a Spring Boot application. It includes the following key topics:

- Sesions with @SessionAttributes
- Forms
- Valid data in forms
- Styles with bootstrap
- Model to show tempaltes thymeleaf
- DTOs
- @ModelAttribute
- Unit and integration tests

## Quick Start

### Prerequisites

- Java 11+ (recommended for Spring Boot 3+)
- Spring Boot version: 2.2.5
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
