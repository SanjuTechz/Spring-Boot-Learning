# My Daylist API

The main project for applying the Spring Boot lessons incrementally.

## Initial project configuration

Generate the application at [Spring Initializr](https://start.spring.io/) with:

- Project: Maven
- Language: Java
- Java: 21
- Spring Boot: a current stable Spring Boot 4.x release compatible with Java 21
- Dependencies to begin: Spring Web

Add dependencies only when a lesson needs them. Likely later additions include Spring Data JPA, Validation, H2 Database, and PostgreSQL Driver.

## Intended package structure

```text
com.example.mydaylist
├── MyDaylistApplication.java
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
└── exception/
```

## Initial API direction

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/tasks` | List tasks |
| GET | `/api/tasks/{id}` | Get one task |
| POST | `/api/tasks` | Create a task |
| PUT | `/api/tasks/{id}` | Replace/update a task |
| PATCH | `/api/tasks/{id}/complete` | Mark a task complete |
| DELETE | `/api/tasks/{id}` | Delete a task |

## Development rules

- Keep controllers focused on HTTP input/output.
- Put business operations in services.
- Put persistence access in repositories.
- Use DTOs for API request/response contracts when appropriate.
- Add validation and tests as the project grows.
- Never commit secrets or local database credentials.
