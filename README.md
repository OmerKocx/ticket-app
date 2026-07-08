# Event Ticket Platform API

A robust RESTful API built on Spring Boot for managing and validating event tickets, integrating OAuth2 authentication via Keycloak, PostgreSQL for data persistence, and QR code generation for ticket validation.

## Tech Stack

- **Java 21**
- **Spring Boot 3.5.x** (Web, Data JPA, Security, Validation)
- **OAuth2 Resource Server** (Keycloak integration)
- **PostgreSQL** (Database)
- **Adminer** (Database administration tool)
- **ZXing** (QR Code generation)
- **MapStruct** & **Lombok**
- **Springdoc OpenAPI / Swagger UI**

---

## Environment Configuration

Configuration is managed via the environment variables defined in the `.env` file in the root directory:

```properties
# Database Settings
DB_HOST=localhost
DB_PORT=5432
DB_NAME=postgres
DB_USERNAME=postgres
DB_PASSWORD=devpassword
DB_SCHEMA=ticket

# Tool Settings
ADMINER_PORT=8888

# Keycloak Settings
KEYCLOAK_PORT=9090
KEYCLOAK_ADMIN=admin
KEYCLOAK_ADMIN_PASSWORD=admin
KEYCLOAK_ISSUER_URI=http://localhost:9090/realms/event-ticket-platform
```

---

## Getting Started

### 1. Prerequisites

Ensure you have the following installed:
- Docker and Docker Compose
- Java 21 JDK (if running the app locally outside Docker)

### 2. Run Infrastructure

Spin up the PostgreSQL database, Adminer, and Keycloak containers:

```bash
docker compose up -d
```

- **Adminer** is accessible at: [http://localhost:8888](http://localhost:8888)
- **Keycloak** is accessible at: [http://localhost:9090](http://localhost:9090)

### 3. Run the Spring Boot Application

Build and run the application locally:

```bash
# Windows
mvnw.cmd spring-boot:run

# Linux / macOS
./mvnw spring-boot:run
```

---

## API Documentation

Once the application is running, the interactive Swagger UI and OpenAPI documentation can be accessed at:

- **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **API Docs (JSON)**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)
