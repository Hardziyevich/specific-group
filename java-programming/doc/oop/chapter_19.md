# Difference Between the Overloading and Overriding of Methods

Intention: In this chapter, you will get familiar with the differences between method overloading and method overriding.

# Method Overloading & Method Overriding

Method overloading and overriding are two completely different concepts.

![alt text](../../etc/oop/img.png "Img")

Let’s compare the differences below:

![alt text](../../etc/oop/img.png "Img")

# Method Overloading Example

Let’s implement the calculator class in java:

![alt text](../../etc/oop/img.png "Img")

```java

```

Here we have 3 different versions of the add() function. The add() function is overloaded here.

# Method Overriding Example

Let’s implement the shape class in java:

![alt text](../../etc/oop/img.png "Img")

```java

```

We have a base class, Shape, and two derived classes Rectangle and Circle. Here, the getArea() method of the Shape 
class is overridden in the Rectangle and the Circle class.

We’ve learned the differences between method overloading and method overriding. In the next lesson, we’ll take 
a look at dynamic polymorphism.

<hr>

Next: [Dynamic Polymorphism](chapter_20.md "Dynamic Polymorphism") - Dynamic Polymorphism.

Previous: [Method Overriding](chapter_18.md "Method Overriding") - Method Overriding.