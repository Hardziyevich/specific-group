# Java Programming: basics

It’s good practice to translate code from one language to another. Here is some Python code that computes the integer 
factors of a number. Write Java code to compute the factors in the second tab; while you are at it, 
put the code inside a nice `public static void` method `printFactors` that takes an integer parameter and prints the integer 
factors on the screen. You should be fine even if you do not know Python.

```python
number = 42

possible_factor = 1
while possible_factor <= number:
  if number % possible_factor == 0:
    print( str(possible_factor) + " is a factor of " + str(number) + "." )

  possible_factor = possible_factor + 1

print( "And that's all the factors of " + str(number) + "." )
```

It would be even nicer to have a method that returns a list of factors, rather than printing the numbers out on the screen. 
One way to return the list of numbers would be to create an array; unfortunately, since we don’t know how many factors 
there will be ahead of time, we’d either have to create an array that was too large, or first count the factors. 
Use please `LinkedList` for this improvement.

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task7` in the `PrintFactors` class;
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
10. [if-statements](../../../java-programming/doc/basics/chapter_10.md "if-statements") - if-statements;
11. [Loops](../../../java-programming/doc/basics/chapter_11.md "Loops") - while, for, foreach loops.