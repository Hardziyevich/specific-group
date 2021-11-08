# Polymorphism in OOP

Intention: In this chapter, we will be implementing polymorphism using the OOP concepts.

So far, we have learned that we can add new data and methods to a class through inheritance. 
But what if we want our derived class to inherit a method from the base class and have a different implementation for it? 
That is when polymorphism, a fundamental concept in the OOP paradigm, comes into play.

# Example

Here we consider the example of a Shape class, which is the base class while many shapes like Rectangle and Circle 
extending from the base class are derived classes. These classes contain the getArea() method which calculates 
the area for the respective shape.

![alt text](../../etc/oop/img.png "Img")

# Implementation

We will be implementing the Base class and the Derived classes respectively.

# Shape Class

The Shape class has only one public method called getArea().

Let’s look at the implementation of the Shape class:

```java

```

# Rectangle Class

Now, consider the Rectangle class which is extended from the Shape class. It has two data members, i.e., width and 
height and it returns the Area of the rectangle by using the getArea() method.

Let’s look at the implementation of the Rectangle class:

```java

```

# Circle Class

Now, consider the Circle class which is extended from the Shape class. It has only one data member, i.e., 
radius and it returns the Area of the circle by using the getArea() method.

Let’s look at the implementation of the Circle class:

```java

```

# Complete Program

Now, by merging all the classes and calling the getArea() method, see what happens:

```java

```

Program Execution

In the main function, we have declared a Shape class array of size 2 and declared the Circle and the Rectangle class 
objects at index 0 and 1 respectively. Now the getArea() method returns the area of the respective shape. 
This is Polymorphism.

In the next lesson, we’ll be learning about the process of method overriding.

<hr>

Next: [Method Overriding](chapter_18.md "Method Overriding") - Method Overriding.

Previous: [What is Polymorphism?](chapter_16.md "What is Polymorphism?") - What is Polymorphism?