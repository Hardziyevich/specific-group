# Java Programming: basics

The code below picks a random number that is either 0 or 1, and stores the result in the variable `n`. 
Add some if statements so that the program randomly prints out "Heads" or "Tails". Run the program several times 
to make sure that you eventually get both outcomes.

```java
package com.github.akarazhev.jacademy.practice.jprog.task6;

import java.util.Random;

public final class CoinFlip {

    public static void main(final String[] args) {
        // create a new random number generator object
        Random rand = new Random();

        // pick a random number between 0 and 1:
        int n = rand.nextInt(2);
        System.out.println("Picked random value " + n);

    }
}
```

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task6` in the `CoinFlip` class;
2. Write a meaningful message with a commit and push the code;
3. Add comments where they are needed;
4. Show the result to a mentor.

## Theory chapters

1. [Introduction](../../../java-programming/doc/basics/chapter_1.md "Introduction") - Introduction;
2. [First Java Program](../../../java-programming/doc/basics/chapter_2.md "First Java Program") - A First Java Program;
3. [Printing to the screen](../../../java-programming/doc/basics/chapter_3.md "Printing to the screen") - Printing to the screen;
4. [Variables; integer values with 'int'](../../../java-programming/doc/basics/chapter_4.md "Variables; integer values with 'int'") -
   Variables; integer values with 'int';
5. [Arithmetic expressions and operators](../../../java-programming/doc/basics/chapter_5.md "Arithmetic expressions and operators") -
   Arithmetic expressions and operators;
6. [Method parameters and return values](../../../java-programming/doc/basics/chapter_6.md "Method parameters and return values") -
   Method parameters and return values;
7. [Text values with String and char](../../../java-programming/doc/basics/chapter_7.md "Text values with String and char") -
   Text values with String and char;
8. [Arrays](../../../java-programming/doc/basics/chapter_8.md "Arrays") - Arrays;
9. [Conditional and logical operators](../../../java-programming/doc/basics/chapter_9.md "Conditional and logical operators") -
   Conditional and logical operators;
10. [if-statements](../../../java-programming/doc/basics/chapter_10.md "if-statements") - if-statements.
