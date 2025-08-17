# stockTracking
Stock Tracking API

This project is a simple RESTful API developed for stock management. Users can add, update, delete products, and track stock movements.

Features

-Add, update, delete products
-Record stock in/out transactions
-List all products and stock movements
-DTO ↔ Entity mapping (ModelMapper)
-Layered architecture:
  *Controller → API endpoints
  *Service → Business logic
  *Repository → Database operations

Technologies

-Java 17+
-Spring Boot (Web, Data JPA)
-H2 Database (for development)
-Lombok
-ModelMapper
-Maven

Project Structure
src/main/java/com/example/stockTracking
│── controller   # API endpoints
│── service      # Business logic
│── repository   # JPA repository
│── model        # Entity classes
│── dto          # Data Transfer Objects (DTOs)

Configurations(application.properties)
  spring.application.name=stockTracking
  spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
  spring.jpa.properties.hibernate.default_schema=student
  spring.datasource.username=postgres
  spring.datasource.password=1
  spring.jpa.hibernate.ddl-auto=update
  
  
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.format_sql=true

