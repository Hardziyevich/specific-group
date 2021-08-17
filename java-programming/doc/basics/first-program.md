# A First Java Program

Intention: Learn the basic structure of a Java program.

## Java Program

```java
public final class FirstProgram {

    public static void main(final String[] args) {
        // Print the word:
        System.out.println("Hello World!");
    }
}
```

First things to note:

1. Single-line comments begin with `//`;
2. The method `main` is <i>defined</i> using the keywords `public static void`. The method named `main` is special: 
   Java starts running the code at the first line of the method named `main`;
3. Method definitions are grouped into <i>classes</i>;
5. Most lines of code end in a semi-colon. Method and class definitions do not.

## Class and methods

The main unit of organization in a Java program is the <b>class</b>. The simplest Java program contains just one class. 
Among other things, a class is a collection of methods.

There are two types of methods: <b>static</b> methods and <b>non-static</b> methods. 
A static method plays a similar role to an ordinary function in other languages.

In any language, <i>factoring</i> is the process of reorganizing code into different files, classes, methods, libraries, 
or functions.