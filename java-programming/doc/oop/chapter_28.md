# Multiple Inheritance

Intention: In this chapter, you'll learn what multiple inheritance is and how it can be implemented in Java.

# What Is Multiple Inheritance?

When a class is derived from more than a single base class, i.e. when a class has more than one immediate parent classes, 
it is an instance of Multiple Inheritance. Example:

- A Hyundai Elantra IS A Car
- A Hyundai Elantra IS A Sedan as well

![alt text](../../etc/oop/img.png "Img")

# How to Implement

As mentioned earlier, in Java, a class can’t extend from more than one class. So the question arises, 
“how can we implement multiple inheritance?”

The answer to the above question is Interfaces. In Java, multiple inheritance can be implemented using interfaces.

A class can implement more than one interfaces and an interface can extend from more than one interfaces.

So in this way, we can achieve multiple inheritance in Java.

# An Example

Let’s implement the example of Elantra given at the start of the lesson. This example can be implemented using:

- A base class named Car
- An interface named IsSedan
- An Elantra class derived from Car and implementing IsSedan

The above illustration then becomes:

![alt text](../../etc/oop/img.png "Img")

Below is the implementation:

```java

```

Now that we’ve implemented multiple inheritance, let’s take a look at the differences between an interface and an 
abstract class.

# Interface vs Abstract Class

Interfaces and abstract classes are both used to achieve abstraction but with some of the key differences:

![alt text](../../etc/oop/img.png "Img")

<hr>

Next: [Aggregation and Composition](chapter_29.md "Aggregation and Composition") - Aggregation and Composition.

Previous: [Functional Interfaces in Java](chapter_27.md "Functional Interfaces in Java") -
Functional Interfaces in Java.