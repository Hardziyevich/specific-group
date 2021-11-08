# Difference between Static and Dynamic Polymorphism

Intention: In this chapter, you will learn about the differences between static and dynamic polymorphism.

# Types of Polymorphism

There are two types of polymorphism:

- Static polymorphism is also known as compile time polymorphism.
- Dynamic polymorphism is also known as runtime polymorphism.

![alt text](../../etc/oop/img.png "Img")

# Static Polymorphism & Dynamic Polymorphism

![alt text](../../etc/oop/img.png "Img")

# Example of Static Polymorphism

```java

```

Here, we have two definitions of the same method add() in Calculator class. Which add() method would be called is 
determined by the parameter list at the compile time. That is the reason this is also known as compile time polymorphism.

# Example of Dynamic Polymorphism

```java

```

Here, we have three classes Shape, Circle, and Rectangle. Shape is a parent class while Circle and Rectangle are 
the child classes. The child classes are overriding the method getArea() of the parent class. We have child classes 
objects assigned to the parent class reference. So to determine which method would be called, the type of the object 
would be determined at runtime. That is the reason it is also known as runtime polymorphism.

Now, we have understood the concept of Polymorphism. The next chapter deals with abstraction.

<hr>

Next: [What is Abstraction?](chapter_22.md "What is Abstraction?") - What is Abstraction?

Previous: [Dynamic Polymorphism](chapter_20.md "Dynamic Polymorphism") - Dynamic Polymorphism.