# Java Programming: oop

## Challenge: Implement an Abstract Method in a Base Class

Can you implement an abstract method of a base class?

### Problem Statement

We have already implemented a `Book` class which has an abstract method `getDetails()`, a parameterized constructor, 
and three protected fields:
- name;
- author;
- price.

Write a `MyBook` class that inherits from the `Book` class and has a parameterized constructor taking these parameters:
- <b>String title</b>;
- <b>String author</b>;
- <b>String price</b>.

Implement the Book class `getDetails()` method in the `MyBook` class so that it returns the `MyBook` details.

### Input

Calls the constructor by passing name, author, and price.
Calls the `getDetails()` method to return the details of a book.

### Output

Returns the details of a book.

### Sample Input

```java
Book myBook = new MyBook("Harry Potter", "J.k. Rowling", "100");
```

### Sample Output

`
"Harry Potter, J.k. Rowling, 100"
`

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task12` in the `Demo` class;
2. Write a meaningful message with a commit and push the code;
3. Show the result to a mentor;
4. Answer some questions.

## Quiz

1. What is a default method?

A) A method that is marked with `@Default` annotation.

B) A method that cannot be overridden in sub-classes.

C) A method that has the implementation inside the interface.

D) None of the above.

2. Is it necessary to declare a functional interface with `@FunctionalInterface` annotation?

A) Yes.

B) No.

3. Is it possible to override a static method declared in an interface?

A) Yes. 

B) No.

4. What would happen if a class inherits two interfaces that, both have default methods with the same name? 
Select all that apply.

A) The compiler will show an error.

B) The code will compile properly.

C) We will need to override the method in our class.

## Questions

1. What is the `Abstraction`?
2. Propose a couple of examples. 

## Answers

Answer questions to a mentor in English.

## Theory chapters

1. [Introduction](../../../java-programming/doc/oop/chapter_1.md "Introduction to Classes") - Introduction to Classes;
2. [Declaration and Implementation](../../../java-programming/doc/oop/chapter_2.md "Declaration and Implementation") - Declaration and Implementation;
3. [Access Modifiers](../../../java-programming/doc/oop/chapter_3.md "Access Modifiers") - Access Modifiers;
4. [Fields](../../../java-programming/doc/oop/chapter_4.md "Fields") - Fields;
5. [Methods](../../../java-programming/doc/oop/chapter_5.md "Methods") - Methods;
6. [Constructors](../../../java-programming/doc/oop/chapter_6.md "Constructors") - Constructors;
7. [A Bit More about Constructors](../../../java-programming/doc/oop/chapter_7.md "A Bit More about Constructors") -
   A Bit More about Constructors;
8. [What is Data Hiding?](../../../java-programming/doc/oop/chapter_8.md "What is Data Hiding?") - What is Data Hiding?
9. [Encapsulation](../../../java-programming/doc/oop/chapter_9.md "Encapsulation") - Encapsulation;
10. [Understanding Encapsulation Using Examples](../../../java-programming/doc/oop/chapter_10.md "Understanding Encapsulation Using Examples") -
    Understanding Encapsulation Using Examples;
11. [What is Inheritance?](../../../java-programming/doc/oop/chapter_11.md "What is Inheritance?") - What is Inheritance?
12. [The Syntax and Terminologies](../../../java-programming/doc/oop/chapter_12.md "The Syntax and Terminologies") - The Syntax and Terminologies;
13. [Super Keyword](../../../java-programming/doc/oop/chapter_13.md "Super Keyword") - Super Keyword;
14. [Types of Inheritance](../../../java-programming/doc/oop/chapter_14.md "Types of Inheritance") - Types of Inheritance;
15. [Advantages of Inheritance](../../../java-programming/doc/oop/chapter_15.md "Advantages of Inheritance") - Advantages of Inheritance;
16. [What is Polymorphism?](../../../java-programming/doc/oop/chapter_16.md "What is Polymorphism?") - What is Polymorphism?
17. [Polymorphism in OOP](../../../java-programming/doc/oop/chapter_17.md "Polymorphism in OOP") - Polymorphism in OOP;
18. [Method Overriding](../../../java-programming/doc/oop/chapter_18.md "Method Overriding") - Method Overriding;
19. [Difference Between the Overloading and Overriding of Methods](../../../java-programming/doc/oop/chapter_19.md
    "Difference Between the Overloading and Overriding of Methods") -
    Difference Between the Overloading and Overriding of Methods;
20. [Dynamic Polymorphism](../../../java-programming/doc/oop/chapter_20.md "Dynamic Polymorphism") - Dynamic Polymorphism;
21. [Difference between Static and Dynamic Polymorphism](../../../java-programming/doc/oop/chapter_21.md
    "Difference between Static and Dynamic Polymorphism") -
    Difference between Static and Dynamic Polymorphism;
22. [What is Abstraction?](../../../java-programming/doc/oop/chapter_22.md "What is Abstraction?") - What is Abstraction?
23. [Abstract Classes and Methods](../../../java-programming/doc/oop/chapter_23.md "Abstract Classes and Methods") -
    Abstract Classes and Methods;
24. [Interfaces](../../../java-programming/doc/oop/chapter_24.md "Interfaces") - Interfaces;
25. [Default Methods in interfaces](../../../java-programming/doc/oop/chapter_25.md "Default Methods in interfaces") -
    Default Methods in interfaces;
26. [Static Methods in interfaces](../../../java-programming/doc/oop/chapter_26.md "Static Methods in interfaces") -
    Static Methods in interfaces;
27. [Functional Interfaces in Java](../../../java-programming/doc/oop/chapter_27.md "Functional Interfaces in Java") -
    Functional Interfaces in Java;
28. [Multiple Inheritance](../../../java-programming/doc/oop/chapter_28.md "Multiple Inheritance") - Multiple Inheritance.