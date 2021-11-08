# Static Methods in interfaces

Intention: This chapter explains static methods in interfaces and why they were introduced in Java 8.

# What are static methods in interfaces?

The static methods in interfaces are similar to default methods but the only difference is that you can’t override them. 
Now, why do we need static methods in interfaces if we already have default methods?

Suppose you want to provide some implementation in your interface and you don’t want this implementation to be overridden 
in the implementing class, then you can declare the method as static.

In the below example, we will defined a Vehicle interface with a static method called cleanVehicle().

```java

```

Let us declare a class Car, which implements this Vehicle interface.

```java

```

```java

```

In the above interface, we get a compilation error in the Car class because a static method cannot be overridden. 
Also, since a static method is hidden, we can’t call it from the object of the implementing class. 
The below code will also not compile.

```java

```

```java

```

The below class will compile because we are calling the static method that is defined in the interface from the 
interface reference.

```java

```

```java

```

In the next lesson, we will explore functional interfaces.

<hr>

Next: [Functional Interfaces in Java](chapter_27.md "Functional Interfaces in Java") -
Functional Interfaces in Java.

Previous: [Default Methods in interfaces](chapter_25.md "Default Methods in interfaces") -
Default Methods in interfaces.