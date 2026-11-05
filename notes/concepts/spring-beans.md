# Spring Beans

A Spring Bean is an object whose creation, configuration, and lifecycle are managed by the Spring IoC container (typically represented by the `ApplicationContext`).

## Common ways to register beans

- `@Component` and stereotype annotations such as `@Service`, `@Repository`, and `@Controller` when component scanning is enabled.
- `@Bean` on a method inside a configuration class.

## Questions to answer
- What manages a bean?
- What is component scanning?
- How is `@Service` related to `@Component`?

Related: [[dependency-injection]], [[service-layer-pattern]].
