# Formatting

We are not going to discuss formatting guidelines, since almost in all IDEs there are third party plugins for formatting (e.g., Prettier in VS Code).

> Object and Data Structures

> Objects hide their data behind abstractions and expose functions that operate on that data. 
Data structure expose their data and have no meaningful functions.

> The quintessential form of a data structure is a class with public variables and no functions. 
> This is sometimes called a data transfer object, or DTO.

Well, from Clean Coding aspect your Data Structure should have only private properties with public getters and setters and no business logic. 
On the other hand Objects should have only business logic with connection to data structures over abstractions.

- But instead of having private properties and public getters setters, the better way is to have it in form of interfaces that 
  neither exposes properties nor method implementations.
- Use DTOs for logging, transferring raw data.

```java
public class ObjectsAndDataStructures {
    // 1. Use abstract objects over data structures
    // Instead of using this kind of Data Structure:
    private class UserA {
        private String name;
        private String role;
        // public getters, setters

    }
    // Use this kind of abstract Objects with implementation that is unknown to user of this data
    private interface User {
        String getName();
        String getRole();
        void setName(String name);
        void setRole(String role);
    }

    // 2. User DTOs for raw data transformation
    private class ErrorDTO{
        public String Message;
        public Error Error;
        public Exception Exception;
    }
}
```