---
type: learning-exercise
day: 1
topic: Spring Beans and Dependency Injection
technology: Spring Boot
language: Java
status: in-progress
---

# Day 1 – Spring Beans and Dependency Injection

## Learning objective
Understand the Spring application structure, what a Spring Bean is, and how constructor injection supplies a service to a controller.

## Core concepts
- A **Spring Bean** is an object managed by the Spring IoC container.
- `@Service` is a stereotype annotation that marks a service component for component scanning.
- Constructor injection makes required dependencies explicit.
- The Service Layer holds application/business operations; `@Service` is an annotation, not itself a design pattern.

Related notes: [[../concepts/spring-beans|Spring Beans]], [[../concepts/dependency-injection|Dependency Injection]], [[../concepts/service-layer-pattern|Service Layer Pattern]].

## Challenge
Create a `TaskService` that returns three example tasks. Create a `TaskController` with `GET /api/tasks/today` and inject `TaskService` through its constructor.

### Acceptance criteria
- [ ] `TaskService` is annotated with `@Service`.
- [ ] The controller uses constructor injection.
- [ ] The controller does not instantiate the service with `new`.
- [ ] `GET /api/tasks/today` returns three tasks as JSON.
- [ ] The application starts successfully.

## Implementation
Put the runnable code in `exercises/day-01/` or begin the main application in `projects/my-daylist-api/`.

## My explanation
Write what Spring manages, how the service reaches the controller, and why constructor injection is useful.

## Mistakes and debugging
- Problem:
- Cause:
- Fix:

## Verification
- [ ] Tested `GET http://localhost:8080/api/tasks/today`.
- [ ] Can explain `@Service` and `@RestController`.
- [ ] Can explain constructor injection without referring to notes.

## Git commit
`git commit -m "Day 1: add task service and controller"`
