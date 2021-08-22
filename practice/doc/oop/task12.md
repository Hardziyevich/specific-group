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