# Repository Pattern

A Repository provides an abstraction over data access. In Spring Data JPA, an interface can extend `JpaRepository` to inherit common persistence operations.

Keep persistence queries and database access in this layer rather than placing them in the controller.

Related: [[service-layer-pattern]].
