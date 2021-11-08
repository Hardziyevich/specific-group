# Types of Inheritance

Intention: In the chapter lessons, you covered the basics of inheritance. In this lesson, you will learn about 
the various types of inheritance in Java.

Based upon superclasses and subclasses, there are the following five types of inheritance in general:

1. Single
2. Multi-level
3. Hierarchical
4. Multiple
5. Hybrid

# Single Inheritance

In single inheritance, there is only a single class extending from another class. We can take the example of 
the Vehicle class (Super class) and the Car class (Sub class). Let’s implement these classes below:

![alt text](../../etc/oop/img.png "Img")

```java

```

# Multi-level Inheritance

When a class is derived from such a class which itself is derived from another class, this type of inheritance is 
called Multilevel Inheritance. Classes can be extended to any further levels as per the requirement of the model.

![alt text](../../etc/oop/img.png "Img")

Let’s implement the three classes illustrated above:

A Car IS A Vehicle
A Prius IS A Car

```java

```

# Hierarchical Inheritance

When more than one classes inherit from the same class, it is referred to as hierarchical inheritance. 
In hierarchical inheritance, more than one classes extend, as per the requirement of the design, from the same base class. 
The common attributes of these child classes are implemented inside the base class.

Example:
A Car IS A Vehicle
A Truck IS A Vehicle

![alt text](../../etc/oop/img.png "Img")

```java

```

# Multiple Inheritance

When a class is derived from more than one base class, i.e. when a class has more than one immediate parent classes, 
this type of inheritance is called Multiple Inheritance.

Example:

A Hyundai Elantra IS A Car.
A Hyundai Elantra IS A Sedan also.

![alt text](../../etc/oop/img.png "Img")

# Hybrid Inheritance

A type of inheritance which is a combination of Multiple and Multi-level inheritance is called hybrid inheritance.

- A combustion engine is an engine
- An electric motors engine is an engine
- A Hybrid engine combines both combustion engine and electric motors.

![alt text](../../etc/oop/img.png "Img")

Note: In Java, Multiple and Hybrid inheritance are applicable using interfaces only.

This lesson was about the different types of Inheritance. In the next lesson, we will discuss the advantages of inheritance.

<hr>

Next: [Advantages of Inheritance](chapter_15.md "Advantages of Inheritance") - Advantages of Inheritance.

Previous: [Super Keyword](chapter_13.md "Super Keyword") - Super Keyword.