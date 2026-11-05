---
type: learning-exercise
day: 3
topic: Request Bodies, Path Variables, and Query Parameters
technology: Spring Boot
language: Java
status: not-started
---

# Day 3 – Request Bodies, Path Variables, and Query Parameters

## Learning objective
Receive client-provided data through a REST endpoint.

## Core concepts to study
- `@RequestBody`
- `@PathVariable`
- `@RequestParam`
- Required and optional request parameters
- JSON request payloads

## Challenge
Add an endpoint that accepts a task title in a JSON request body, and an endpoint that retrieves a task by its ID in the URL path.

## Acceptance criteria
- [ ] The create endpoint accepts JSON.
- [ ] The task ID is read from a path variable.
- [ ] A query parameter can filter or search tasks.
- [ ] Test requests and responses using Bruno or Postman.

## Notes and implementation
Use the [[../../templates/exercise-template|exercise template]].
