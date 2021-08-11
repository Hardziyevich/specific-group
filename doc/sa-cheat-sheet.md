# Software Architecture Cheat Sheet for Daily Usage

Having clean software architecture and staying conform to pre-defined design principles from start of the project is one of 
the best ways to avoid possible technical debt in the future of that software system. 
Clean Software Design is a key point for an effective software product.
Let us have a look at some important principles, rules, guidelines that ensure a clean software design:

## Principles
- <i>Loose Coupling</i> — if classes use each other, they are coupled together. The less classes are coupled, the easier is to change them.
- <i>High Cohesion</i> — degree to which elements of a whole belong together. Components of the class should be highly cohesive.
- <i>Only Local Changes</i> — Changes, maintenance, extensions are only local. This leads to no harming whole environment.
- <i>Easy to Remove</i> — Software Components should be easily removeable.
- <i>Small Components</i> — software system should be only of small components ideally each doing only one task.

## Class Design
- <i>Single Responsibility Principle (SRP)</i> — class should do only one task.
- <i>Open Closed Principle (OCP)</i> — class should be extended not modified.
- <i>Liskov Substitution Principle (LSP)</i> — derived classes must be substitutable for their base classes.
- <i>Dependency Inversion Principle (DIP)</i> — depend on abstractions, not on concretions.
- <i>Interface Segregation Principle (ISP)</i> — interfaces should be fine-grained
- <i>Classes Should be Small</i>.
- <i>Do stuff or know others, but not both</i>.

## Cohesion Principles
- <i>Release Reuse Equivalency Principle (RREP)</i> — only together releaseable components should be bundled together.
- <i>Common Closure Principle (CCP)</i> — classes that change together should be bundled together.
- <i>Common Reuse Principle (CRP)</i> — classes that are used together should be bundled together.

## Coupling Principles
- <i>Acyclic Dependencies Principle (ADP)</i> — no dependency cycles.
- <i>Stable Dependencies Principle (SDP)</i> — depend on direction of stability.
- <i>Stable Abstractions Principle (SAP)</i> — the more abstract, the more stable.

## High-Level Design
- <i>Keep Configurable Data at High Levels</i> — constants or config datas should be kept in high level.
- <i>Don’t Be Arbitrary</i> — have a convention, principle, rule or guidelines and always follow them.
- <i>Prefer Polymorphism To If/Else or Switch/Case</i>.
- <i>Symmetry / Analogy</i> — Favour symmetric designs (e.g. Load — Save) and designs that follow analogies (e.g. same design as found in .NET framework).
- <i>Separate Multi-Threading Code</i> — isolate multi-thread from rest of the code.
- <i>Code at Wrong Level of Abstraction</i> — stay conform to existing abstraction layers.
- <i>Fields Not Defining State</i> — fields holding data that does not belong to the state of the instance but are to hold temporary data. 
  Use local variables or extract to a class abstracting the performed action.
- <i>Micro Layers</i> — avoid unnecessary design layers.

## Environment
- <i>Project Build Requires Only One Step</i>.
- <i>Executing Tests Requires Only One Step</i>.
- <i>Source Control System</i> — Always use a source control system.
- <i>Continuous Integration</i> — Assure integrity with Continuous Integration.
- <i>Overridden Safeties</i> — Do not override warnings, errors, exception handling

## Dependencies
- <i>Make Logical Dependencies Physical</i> — If one module depends upon another, that dependency should be physical not just logical. 
  Don’t make assumptions.
- <i>Singletons / Service Locator</i> — Make use of dependency injection.
- <i>Base Classes Depending On Their Derivatives</i> — Base classes should work with any derived class.
- <i>Feature Envy</i> — The methods of a class should be interested in the variables and functions of the class they belong to, 
  and not the variables and functions of other classes. Using accessors and mutators of some other object to manipulate its data, 
  is envying the scope of the other object (c).
- <i>Artificial Coupling</i> — Things that don’t depend upon each other should not be artificially coupled.
- <i>Hidden Temporal Coupling</i> — If the order of some method calls is important, then make sure that they cannot be called in the wrong order.
- <i>Transitive Navigation</i> — (Law of Demeter), writing shy code. A module should know only its direct dependencies.