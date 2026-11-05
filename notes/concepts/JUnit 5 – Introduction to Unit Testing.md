---
title: JUnit 5 – Introduction to Unit Testing
tags:
  - java
  - junit
  - testing
  - spring-boot
  - maven
status: learning
---

---
## Related Concepts

- [[Maven]]
    
- [[Unit Testing]]
    
- [[Spring Boot Testing]]
    

---

## 1. What is JUnit?

JUnit is a testing framework for Java applications. It allows developers to write automated tests to verify that individual parts of their code work correctly.

### Why use unit testing?

- Find bugs early.
    
- Verify expected behaviour.
    
- Prevent regressions when modifying code.
    
- Reduce manual testing.
    
- Improve code reliability.
    

## 2. What is JUnit Jupiter?

JUnit 5 consists of three main components:

|Component|Responsibility|
|---|---|
|JUnit Platform|Launches testing frameworks and test engines.|
|JUnit Jupiter|Provides the API and programming model for writing tests.|
|JUnit Vintage|Supports older JUnit 3 and JUnit 4 tests.|

JUnit Jupiter provides annotations such as `@Test` and assertions such as `assertEquals()`.

## 3. Maven Dependency

Add this dependency inside the `<dependencies>` element in `pom.xml`:

```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.12.2</version>
    <scope>test</scope>
</dependency>
```

**Important:** The correct group ID is `org.junit.jupiter`, not `org.junit.jupyter`.

### Understanding the dependency

|Element|Purpose|
|---|---|
|`groupId`|Identifies the dependency group.|
|`artifactId`|Identifies the library.|
|`version`|Specifies the library version.|
|`scope`|Defines when the dependency is available.|

The `test` scope makes the dependency available during test compilation and execution, but not normal production compilation.

**Note:** If your Spring Boot project already uses `spring-boot-starter-test`, you generally do not need to add JUnit Jupiter separately.

## 4. Maven Test Directory Structure

Maven separates application code and test code.

```
src/
├── main/
│   └── java/
│       └── Application.java
└── test/
    └── java/
        └── CalculatorTest.java
```

- `src/main/java`: Production application code.
    
- `src/test/java`: Test code.
    

This separation keeps test classes separate from production application code.

## 5. First JUnit Test

### Example production class

```
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}
```

### Example test class

```
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }
}
```

### Understanding the code

|Code|Purpose|
|---|---|
|`@Test`|Marks a method as a test.|
|`assertEquals(30, result)`|Checks whether the actual result equals the expected value of 30.|
|`CalculatorTest`|Contains test methods.|
|`shouldAddTwoNumbers()`|Describes the expected behaviour.|

### How does the test work?

1. Create a `Calculator` object.
    
2. Call the `add()` method with 10 and 20.
    
3. Store the returned result.
    
4. Compare the actual result with the expected result (30).
    
5. If they match, the test passes; otherwise, it fails.
    

## 6. Important Maven Commands

|Command|Purpose|
|---|---|
|`mvn clean`|Deletes previously generated build files.|
|`mvn test`|Compiles and executes tests.|
|`mvn clean test`|Cleans the project and executes tests.|
|`mvn package`|Packages the application after running the required earlier lifecycle phases, including tests.|

### Understanding test results

Example successful output:

```
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
```

**Important distinction:** `BUILD SUCCESS` does not necessarily mean tests were executed. Always check the test summary.

For example:

```
[INFO] No tests to run.
```

This means Maven did not discover any tests to execute.

## 7. Common JUnit Assertions

Assertions are methods used to compare actual results with expected results.

|Assertion|Purpose|
|---|---|
|`assertEquals()`|Checks equality.|
|`assertNotEquals()`|Checks inequality.|
|`assertTrue()`|Checks whether a condition is true.|
|`assertFalse()`|Checks whether a condition is false.|
|`assertNull()`|Checks whether a value is null.|
|`assertNotNull()`|Checks whether a value is not null.|
|`assertThrows()`|Checks whether code throws an expected exception.|

These assertions will be explored in future exercises.

## 8. Problems Encountered and Solutions

### Problem 1: Malformed POM

**Error:**

```
Unrecognised tag: 'groupId'
```

**Cause:** Dependency elements were placed directly inside `<dependencies>`.

**Solution:** Wrap each dependency inside a `<dependency>` element.

### Problem 2: Incorrect JUnit Group ID

**Incorrect:**

```
<groupId>org.junit.jupyter</groupId>
```

**Correct:**

```
<groupId>org.junit.jupiter</groupId>
```

**Cause:** Typographical error in the dependency group ID.

### Problem 3: No Tests to Run

**Output:**

```
[INFO] No tests to run.
```

**Cause:** Maven successfully built the project but did not discover any test classes.

**Solution:**

- Create test classes under `src/test/java`.
    
- Use the `@Test` annotation.
    
- Ensure the JUnit dependency is configured.
    
- Check that the test class follows Maven's test discovery conventions.
    

## 9. What I Learned

- Unit testing verifies individual pieces of application logic.
    
- JUnit is a testing framework for Java.
    
- JUnit Jupiter is the programming model used to write JUnit 5 tests.
    
- Maven manages test dependencies and executes tests.
    
- `@Test` identifies test methods.
    
- Assertions compare actual results with expected results.
    
- Maven separates production code and test code.
    
- A successful Maven build does not guarantee that tests were executed.
    

## 10. Next Learning Objectives

- Learn `assertTrue()` and `assertFalse()`.
    
- Learn `assertNull()` and `assertNotNull()`.
    
- Learn `assertThrows()`.
    
- Write tests for a Java service class.
    
- Explore Spring Boot service testing.
    
- Learn `@SpringBootTest` and `@WebMvcTest`.
    
- Understand unit testing vs integration testing.
    

---

## Learning Milestone

**Status:** First JUnit test successfully executed.

Successfully configured JUnit Jupiter in Maven and executed my first passing Java unit test using IntelliJ IDEA.

**Next practical project:** Write unit tests for the My Daylist task-management service.