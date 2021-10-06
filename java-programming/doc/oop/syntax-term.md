# The Syntax and Terminologies

Intention: In this chapter, you will learn how to use inheritance syntactically and the terminologies related to it.

## The Terminologies

As we know that a new class is created <i>based</i> on an <i>existing</i> class in Inheritance, 
hence we use the terminology below for the new class and the existing class:

- <b>SuperClass (Mother Class or Base Class)</b>: This class allows the <i>re-use</i> of its `non-private` members in 
  another class.
- <b>SubClass (Child Class or Derived Class)</b>: This class is the one that <i>inherits</i> from the superclass.

> A <i>child</i> class has <b>all non-private</b> characteristics of the <i>mother</i> class.

## What does a Child have?

An object of the child class can use:

- All `non-private` members defined in the <b>child</b> class.
- All `non-private` members defined in the <b>mother</b> class.

> Some classes cannot be inherited. Such classes are defined with the keyword, `final`. 
> An example of such a class is the built-in `Integer class` - this class cannot have derived classes.

## The `extends` Keyword

In Java, we have to use the keyword `extends` to implement inheritance:

```java
SubClass extends SuperClass{
    //contents of SubClass
}
```

Let’s take an example of a `Vehicle class` as a <i>base class</i> and implement a `Car class` that will extend from 
this `Vehicle class`. As a <i>Car <b>IS A</b>, Vehicle</i> the implementation of inheritance relation between these 
classes will stand valid.

```java
package com.github.akarazhev.jacademy.jprog.oop.inheritance;

// Base Class Vehicle
class Vehicle {
    // Private Fields
    private final String make;
    private final String color;
    private final int year;
    private final String model;

    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}

// Derived Class Car
class Car extends Vehicle {
    // Private field
    private final String bodyStyle;

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }
}

class Main {

    public static void main(String[] args) {
        Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
        elantraSedan.carDetails(); //calling method to print details
    }
}
```

In the code above, ignore the line `super(make, color, year, model)` for now, you will get to know about it in the next lesson.

> <b>Note</b>: In Java, a class can extend from only one other class at a time and a class cannot extend itself.

<hr>

Next: [Super Keyword](super-keyword.md "Super Keyword") - Super Keyword.

Previous: [What is Inheritance?](inheritance.md "What is Inheritance?") - What is Inheritance?