# MVC Clientes 

## Description

This project covers the MVC pattern in a Spring Boot application with a conection to MYSQL. It includes the following key topics:

- 
- @Value, @GetMapping, @PostMapping, @RestController, @RequestMapping, @Autowired
- Model to show tempaltes thymeleaf
- Model to mapping tables from MYSQL
- Config DB in properties
- Add styles with bootstrap
- Pagination
- Upload files
- Show files (img)
- Unit and integration tests

How to improve this project?
- Upload files
- Show files (img)

## Quick Start

### Prerequisites

- Java 11+ (recommended for Spring Boot 2+)
- Spring Boot version: 2.1.4
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
   - Default URL: `http://localhost:8080/listar`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
   - spring-boot-starter-data-jpa