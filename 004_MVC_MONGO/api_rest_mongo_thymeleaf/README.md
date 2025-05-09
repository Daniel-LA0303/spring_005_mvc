# MVC CRUD MONGODB

## Description

This project covers the MVC pattern in a Spring Boot application with a conection to MONGODB. It includes the following key topics:

- 
- @Value, @GetMapping, @PostMapping, @RestController, @RequestMapping, @Autowired
- Model to show tempaltes thymeleaf
- Collections to MONGODB
- Config DB in properties
- Add styles with bootstrap
- Unit and integration tests
## Quick Start

### Prerequisites

- Java 17+ (recommended for Spring Boot 3+)
- Spring Boot version: 3.0.2
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
   - Default URL: `http://localhost:8080/todos`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
   - spring-boot-starter-data-mongodb