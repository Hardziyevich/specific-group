# Classes

- Classes should be small: Avoid monster classes or god classes that do multiple tasks. Big classes mean frequent changes and volatility.
- Single Responsibility Principle: Apply SRP to classes. Each class should be responsible for only one task.
- Cohesion: Classes should be highly cohesive. Cohesion will make your classes small.
- Organize imports: Organize import of dependencies to classes. Good practice is importing in following order: system dependencies, 
  dependencies from other plugins, dependencies from same plugin, dependencies from same package.
- Organize for change/ Isolate from change: classes should be organized so that volatile classes should be split from classes 
  that should stay stable.
- Base Class should not depend on its derivatives.

Examples for Class are not provided due to its sizes. These points are a good beginning to Clean Code. 
But don’t forget that Design Patterns, Design Principles and different OOD (Object Oriented Design) Patterns are 
from Clean Code point of view also inevitable.