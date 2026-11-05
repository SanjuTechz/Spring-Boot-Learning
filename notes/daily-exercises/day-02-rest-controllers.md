---
type: learning-exercise
day: 2
topic: REST Controllers and HTTP Methods
technology: Spring Boot
language: Java
status: not-started
---

# Day 2 – REST Controllers and HTTP Methods

## Learning objective
Understand how Spring maps HTTP requests to controller methods.

## Core concepts to study
- `@RestController`
- `@RequestMapping`
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@PatchMapping`, and `@DeleteMapping`
- JSON response bodies
- Basic HTTP status codes

## Challenge
Extend the My Daylist API with endpoints for listing tasks and retrieving a single task. Decide which HTTP method and URL should represent each operation.

## Acceptance criteria
- [ ] Endpoints use appropriate HTTP methods.
- [ ] Route paths are consistent under `/api/tasks`.
- [ ] Responses are valid JSON.
- [ ] Unknown task IDs are handled deliberately (record the current behavior).

## Notes and implementation
Use [[../concepts/rest-architecture|REST API Architecture]] and the [[../../templates/exercise-template|exercise template]].
