# Spring Boot REST API Roadmap

Target stack: Java 21, Spring Boot 4.x, Maven, Spring Web, Spring Data JPA, H2 for early practice, and PostgreSQL when the API is ready for a persistent external database.

## Learning sequence

- [ ] **Day 1 – Project structure and dependency injection:** Spring Boot application, component scanning, beans, `@Service`, constructor injection.
- [ ] **Day 2 – REST controllers:** `@RestController`, `@RequestMapping`, HTTP methods, response bodies.
- [ ] **Day 3 – Request data:** `@RequestBody`, `@PathVariable`, and `@RequestParam`.
- [ ] **Day 4 – CRUD:** create, read, update, and delete tasks.
- [ ] **Day 5 – Layered structure:** controller, service, repository, and DTO responsibilities.
- [ ] **Day 6 – Persistence:** entities, Spring Data JPA, H2, and database configuration.
- [ ] **Day 7 – Validation:** request validation and useful error messages.
- [ ] **Day 8 – Exception handling:** `@ControllerAdvice`, `@ExceptionHandler`, and HTTP status codes.
- [ ] **Day 9 – Testing:** JUnit, Spring Boot tests, and MockMvc.
- [ ] **Day 10 – Frontend integration:** CORS and calling the API from React.

Adjust the sequence as needed; do not rush past a topic you cannot explain or implement.

## Completion standard

A topic is complete when you can:

1. Explain the concept in your own words.
2. Implement a small example without copying a finished solution.
3. Test expected behavior and at least one failure case.
4. Explain where the code belongs in the application architecture.

## Official references

- [Spring Guides](https://spring.io/guides)
- [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/reference/)
- [Spring Framework Reference Documentation](https://docs.spring.io/spring-framework/reference/)
- [Spring Initializr](https://start.spring.io/)
