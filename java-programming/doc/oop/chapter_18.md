# Method Overriding

Intention: In this chapter, you'll be learning about what method overriding is and how to achieve it in Java.

# A Brief Introduction

Method overriding is the process of redefining a parent class’s method in a subclass.

In other words, if a subclass provides the specific implementation of a method that has been declared by one of 
its parent classes, it is known as method overriding.

In the previous example, the Rectangle and Circle classes were overriding the getArea() method from the Shape class.

Overriding is done so that a child class can give its own implementation to a method which is already provided by the parent class.

In this case:

- The method in the parent class is called overridden method.
- The methods in the child classes are called overriding methods.

We have already seen the implementation of the getArea() method in the previous lesson, which depicts the concept 
of overriding. The highlighted portions show where method overriding is happening.

Let’s have a look!

![alt text](../../etc/oop/img.png "Img")

```java

```

# Advantages of the Method Overriding

Method overriding is very useful in OOP. Some of its advantages are stated below:

- The derived classes can give their own specific implementations to inherited methods without modifying the parent class methods.
- For any method, a child class can use the implementation in the parent class or make its own implementation.

# Key Features of the Method Overriding

Here are some key features of the Method Overriding:
- Method Overriding needs inheritance and there should be at least one derived class.
- Derived class/es must have the same declaration, i.e., access modifier, name, same parameters and same return type of 
- the method as of the base class.
- The method in the derived class/es must have different implementation from each other.
- The method in the base class must need to be overridden in the derived class.
- Base class/method must not be declared as the Final class.

Now that we are familiar with the concept of method overriding let’s understand the difference between method overloading 
and method overriding in the next lesson.

<hr>

Next: [Difference Between the Overloading and Overriding of Methods](chapter_19.md
"Difference Between the Overloading and Overriding of Methods") -
Difference Between the Overloading and Overriding of Methods.

Previous: [Polymorphism in OOP](chapter_17.md "Polymorphism in OOP") - Polymorphism in OOP.