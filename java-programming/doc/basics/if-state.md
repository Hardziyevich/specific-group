# if-statements

Intention: Learn the syntax for if-statements in Java.

The keyword `if` can be used to run a block of code only if some condition has the boolean value `true`. 
The syntax is like that of C or Javascript: the conditional expression must be wrapped in parentheses, 
and the statements to be executed should be in curly braces. If you are familiar with those languages, 
you may wish to skip this section.

Here are a few examples:

```java
package com.github.akarazhev.jacademy.jprog.basics;

public final class IfExamples {

    public static void main(final String[] args) {
        if (true) {
            System.out.println("This code gets executed.");
        }

        if (false) {
            System.out.println("This code does not.");
        }

        if (5 > 3) {
            System.out.println("This code gets executed, too.");
        }

        if (3 > 5) {
            System.out.println("This code does not.");
        }
    }
}
```

```java
package com.github.akarazhev.jacademy.jprog.basics;

public final class Temperature {

    public static void main(final String[] args) {
        int temperature = -5;
        if (temperature < 0) {
            System.out.println("It's very, very cold!");
        }

        temperature = 10;
        if (temperature >= 0) {
            System.out.println("It's not so cold!");
        }
    }
}
```

## `else` and `else if` statements

Java also has `else` and `else if` statements; they work as you expect from other languages. 
(Python uses `elif`, but like C and Javascript, Java uses the syntax `else if`.)

<hr>

Next: [Loops](loops.md "Loops") - while, for, foreach loops.

Previous: [Conditional and logical operators](cond-log-op.md "Conditional and logical operators") -
Conditional and logical operators.