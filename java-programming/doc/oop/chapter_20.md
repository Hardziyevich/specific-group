# Dynamic Polymorphism

Intention: In this chapter, you will learn about the concepts of dynamic polymorphism.
 
# What is Dynamic Polymorphism?

Dynamic polymorphism is the mechanism by which methods can be defined with the same name, return type, 
and parameters in the base class and derived classes.

The call to an overridden method is decided at the runtime.

# Dynamic Polymorphism Example

Let’s consider the example of the Shape class:

![alt text](../../etc/oop/img.png "Img")

```java

```

A reference variable of the base class can be referred to the derived classes objects:

```java

```

Here, the reference variables obj1 and obj2 are of the Shape class, but they are pointing to the Circle and 
Rectangle respectively.

![alt text](../../etc/oop/img.png "Img")

# Explanation

- obj1.getArea() will execute getArea() method of the subclass Circle class.
- obj2.getArea() will execute getArea() method of the subclass Rectangle class.
- obj1 is a reference to the Circle class, it calls the method of Circle class, as it points to a Circle object.
- obj2 is a reference to the Rectangle class, it calls the method of Rectangle class, as it points to a Rectangle object.

This is decided during runtime and is, therefore, called dynamic or runtime polymorphism.

Now that we are familiar with the concept of Dynamic Polymorphism let’s understand the difference between dynamic and 
static polymorphism in the next lesson.

<hr>

Next: [Difference between Static and Dynamic Polymorphism](chapter_21.md
"Difference between Static and Dynamic Polymorphism") -
Difference between Static and Dynamic Polymorphism.

Previous: [Difference Between the Overloading and Overriding of Methods](chapter_19.md
"Difference Between the Overloading and Overriding of Methods") -
Difference Between the Overloading and Overriding of Methods.