# Default Methods in interfaces

Intention: This chapter discusses what default methods in interfaces are and why they were introduced in Java 8.

# What are default methods?

Before Java 8, we could only declare abstract methods in an interface. However, Java 8 introduced the concept of 
default methods. Default methods are methods that can have a body. The most important use of default methods in 
interfaces is to provide additional functionality to a given type without breaking down the implementing classes.

Before Java 8, if a new method was introduced in an interface then all the implementing classes used to break. 
We would need to provide the implementation of that method in all the implementing classes.

However, sometimes methods have only single implementation and there is no need to provide their implementation 
in each class. In that case, we can declare that method as a default in the interface and provide its implementation 
in the interface itself.

# Syntax of default methods

Let’s understand the syntax of default methods through an example. Here, we have an interface with one abstract and 
one default method:

```java

```

Now we will create a class which implements the vehicle interface.

```java

```

```java

```

As shown above, our class needs to implement only the abstract method. When we call the default method, 
the code defined in the interface is executed.

# How to resolve issues raised due to the default method

Although default methods are very good additions to Java and make developing a lot easier, they have one caveat that 
needs to be considered while coding.

To see this caveat, Let’s look at an example. Here, we have two interfaces with a default method of the same name, 
i.e., printSomething().

InterfaceA:

```java

```

InterfaceB:

```java

```

Now we will define a Main class that will implement both these interfaces. Before we proceed further I would like you 
to think about below questions:

1. Do we need to implement the printSomething() method in the Main class? Will the class compile if we don’t?
2. If some class calls the printSomething() method from the object of Main class then which implementation will be called? 
Will it call the method defined in interfaceA or interfaceB?

Before I answer these questions let us create the Main class that will implement both the interfaces.

```java

```

```java

```

```java

```

The above class will not compile because of the Diamond problem in Java. To resolve the compilation issue, we will have 
to implement the printSomething() method as shown below:

```java

```

```java

```

```java

```

That’s all we have for default methods. In the next lesson, you will learn about static methods in interfaces.

<hr>

Next: [Static Methods in interfaces](chapter_26.md "Static Methods in interfaces") -
Static Methods in interfaces.

Previous: [Interfaces](chapter_24.md "Interfaces") - Interfaces.