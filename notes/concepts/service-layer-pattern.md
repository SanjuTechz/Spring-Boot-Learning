# Service Layer Pattern

The Service Layer is an architectural pattern that defines an application boundary for business operations. A controller handles HTTP concerns; the service coordinates business rules and use cases; a repository handles persistence concerns.

## Typical request flow

`HTTP request → Controller → Service → Repository → Database`

## Important distinction

`@Service` is a Spring stereotype annotation. The Service Layer is the architectural pattern. The annotation makes a class eligible for registration as a Spring bean through component scanning; it does not implement the entire pattern by itself.

Related: [[dependency-injection]], [[rest-architecture]].
