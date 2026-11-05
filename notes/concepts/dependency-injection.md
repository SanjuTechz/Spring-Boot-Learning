# Dependency Injection

Dependency Injection (DI) is a technique where an object receives the dependencies it needs from an external assembler/container instead of constructing those dependencies itself.

## Constructor injection example

```java
@Service
public class TaskService {
    // business operations
}

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
```

## Why constructor injection?

- Required dependencies are explicit.
- A dependency can be stored in a `final` field.
- The class is easier to instantiate in unit tests.
- The class does not need to locate its own dependencies.

Related: [[spring-beans]], [[service-layer-pattern]].
