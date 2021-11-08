# Super Keyword

Intention: In this chapter, you'll get to know about the uses of the super keyword in Java.

# What is the super Keyword?

As you already know that this keyword in Java is used to refer to the instance of the current class.

In a similar fashion, the super keyword in Java is used to refer to the SuperClass members from inside 
the immediate Subclass. The use of super comes into play when we implement inheritance.

# Use Cases of the super Keyword

The super keyword is used in three major contexts:

## Accessing Parent Class Fields

Consider the fields named as fuelCap defined inside a Vehicle class to keep track of the fuel capacity of a vehicle. 
Another class named as Car extends from this Vehicle class. We declare a field inside the Car class with the same name i.e. 
fuelCap but different value. Now if we want to refer to the fuelCap field of the SuperClass inside the Subclass, 
we will then have to use the super keyword.

Let’s understand this using a bit of code.

```java

```

## Calling a Parent Class Method

Just like the fields, super is also used with the methods. Whenever a SuperClass and the immediate SubClass have any 
methods with the same name we use super to access the methods from the SuperClass inside the SubClass. 
Let’s go through an example:

```java

```

## Using with Constructors

Another very important use of the keyword super is to call the constructor of the SuperClass from inside of 
the constructor of the SubClass.

Important Note: When you create an Object of a SubClass type at the same time, an Object of SuperClass type is created 
by calling implicitly the constructor of SuperClass.

The syntax of the constructor call is as follows:

```java

```

The above two lines are the generalized syntax for the SuperClass constructor call.

Note: The call to the SuperClass constructor using super() is usually the first line of code inside the constructor of 
the SubClass. If we do not call super() in the SubClass constructor, the default no-argument constructor of SuperClass 
is called automatically. The super(parameters) call has to be used if we want to call a parameterized constructor 
of the SuperClass.

Let’s look at an example of a constructor calling using super().

Note: The below code will give an error as there is no call to the SuperClass constructor from inside of 
the SubClass constructor.

```java

```

Now let’s uncomment the above highlighted line in the code widget and try running the code again. It will execute this time.

```java

```

This time the execution is successful.

Note: In a constructor we can include a call to super() or this() but not both. Also, these calls can only be used inside 
the constructors.

So this was pretty much about the super keyword. In the next lesson, we will discuss the different types of inheritance.

<hr>

Next: [Types of Inheritance](chapter_14.md "Types of Inheritance") - Types of Inheritance.

Previous: [The Syntax and Terminologies](chapter_12.md "The Syntax and Terminologies") - The Syntax and Terminologies.