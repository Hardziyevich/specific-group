# Constructors

Intention: In this chapter, the world of constructors is explored and you'll learn why they are necessary for a class.

## What is a Constructor?

As the name suggests, the constructor is used to <i>construct</i> the object of a class. It is a special method that 
outlines the steps that are performed when an instance of a class is created in the program.

> A constructor’s <b>name</b> must be exactly the <b>same</b> as the name of its class.

The constructor is a special method because it <b>does not have a return type</b>. We do not even need to write `void` 
as the return type. It is a good practice to declare/define it as the first member method.

So, let’s study the different types of constructors and use them to create class objects.

## Default Constructor

The default constructor is the most basic form of a constructor. Think of it this way:

> In a default constructor, we define the default values for the data members of the class. 
> Hence, the constructor creates an object in which the data members are initialized to their default values.

This will make sense when we look at the code below. Here, we have a <b>Date</b> class, with its default constructor, 
and we’ll create an object out of it in our `main()`:

```java
package com.github.akarazhev.jacademy.jprog.oop.constructors;

class Date {
    private final int day;
    private final int month;
    private final int year;
    // Default constructor
    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // A simple print function
    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public final class Demo {

    public static void main(final String[] args) {
        // Call the Date constructor to create its object;
        Date date = new Date(); // Object created with default values!
        date.printDate();
    }
}
```

Notice that when we created a `Date` object, we don’t treat the constructor as a method and write this:

```java
date.Date()
```

We create the object just like we create an `integer` or `string` object. It’s that easy!

The default constructor does not need to be explicitly defined. Even if we don’t create it, the JVM will call 
a default constructor and set data members to `null` or `0`.

> If you don’t define any constructor, the Java compiler will insert a default constructor for you. 
> Thus, once the class is compiled it will always at least have a no-argument constructor.

## Parameterized Constructor

The default constructor isn’t all that impressive. Sure, we could use `set` methods to set the values for `day`, 
`month` and `year` ourselves, but this step can be avoided using a <b>parameterized constructor</b>.

> In a parameterized constructor, we pass arguments to the constructor and set them as the values of our data members.

We are basically overloading the default constructor to accommodate our preferred values for the data members.

Let’s try it out:

```java
package com.github.akarazhev.jacademy.jprog.oop.constructors;

class Date {
    private final int day;
    private final int month;
    private final int year;

    // Default constructor
    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // Parameterized constructor
    public Date(int d, int m, int y) {
        // The arguments are used as values
        day = d;
        month = m;
        year = y;
    }

    // A simple print function
    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public final class Demo {

    public static void main(final String[] args) {
        // Call the Date constructor to create its object;
        Date date = new Date(); // Object created with default values!
        date.printDate();
        // Call the Date constructor to create its object;
        date = new Date(1, 8, 2018); // Object created with specified values! // Object created with default values!
        date.printDate();
    }
}
```

This is much more convenient than the default constructor!

In the next chapter, we will learn a bit more about constructors.

<hr>

Next: [A Bit More about Constructors](chapter_7.md "A Bit More about Constructors") - A Bit More about Constructors.

Previous: [Methods](chapter_5.md "Methods") - Methods.