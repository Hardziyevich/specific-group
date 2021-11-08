# Java Programming: Recursion

## Challenge: Sort an Array

In this task, you must sort an array using recursion.

### Problem Statement

Write a method `sortArray` that takes an integer array and returns the sorted array.

The following illustration explains this concept:

![alt text](../../etc/recursion/sort-array.png "Sorted array")

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task17` in the `Solution` class; 
2. Write a meaningful message with a commit and push the code;
3. Show the result to a mentor.

## Quiz

1. The task is to print the array using recursion.

```java
public static void printArray(int array[], int startIndex, int len) {
    System.out.print(arr[startIndex] + " ");

    // Recursively calling printArray to print next element in the array
    printArray(array, startIndex + 1, len);
}
```

What should the base case of the following code be?

A) 
```java
if (startIndex >= len)
    return;
```

B)
```java
if (startIndex <= len)
    return;
```

C) 
```java
if (startIndex >= len / 2)
    return;
```

2. The task is to return the sum of array of elements

```java
public static int arraySum(int[] array, int n) {
    // base case
    if (n <= 0)
        return 0;
    else
        // recursive case
}
```

What should the recursive case of the above-mentioned code be?

A) return (arraySum(array, n - 1) + array[n - 1]);

B) return (arraySum(array, n - 1) + array[n]);

C) return arraySum(array, n - 1);

## Answers

Answer questions to a mentor in English.

## Theory chapters

1. [What is Recursion?](../../../java-programming/doc/recursion/chapter_1.md "What is Recursion?") - What is Recursion?
2. [Recursion and Memory Visualization](../../../java-programming/doc/recursion/chapter_2.md "Recursion and Memory Visualization") -
   Recursion and Memory Visualization;
3. [Direct vs. Indirect Recursion](../../../java-programming/doc/recursion/chapter_3.md "Direct vs. Indirect Recursion") -
   Direct vs. Indirect Recursion;
4. [When to use Recursion](../../../java-programming/doc/recursion/chapter_4.md "When to use Recursion") - When to use Recursion;
5. [What to Expect](../../../java-programming/doc/recursion/chapter_5.md "What to Expect") - What to Expect;
6. [Understanding a Recursive Problem](../../../java-programming/doc/recursion/chapter_6.md "Understanding a Recursive Problem") -
   Understanding a Recursive Problem;
7. [Advantages and Disadvantages](../../../java-programming/doc/recursion/chapter_7.md "Advantages and Disadvantages") -
   Advantages and Disadvantages;
8. [Introduction](../../../java-programming/doc/recursion/chapter_8.md "Introduction") - Introduction;
9. [Recursion vs. Iteration](../../../java-programming/doc/recursion/chapter_9.md "Recursion vs. Iteration") - Recursion vs. Iteration;
10. [Changing Iterative Code to Recursive](../../../java-programming/doc/recursion/chapter_10.md "Changing Iterative Code to Recursive") -
    Changing Iterative Code to Recursive;
11. [Sum of Integers from 1 to n](../../../java-programming/doc/recursion/chapter_11.md "Sum of Integers from 1 to n") -
    Sum of Integers from 1 to n;
13. [Computing Fibonacci Sequence](../../../java-programming/doc/recursion/chapter_12.md "Computing Fibonacci Sequence") -
    Computing Fibonacci Sequence;
14. [Reversing a String](../../../java-programming/doc/recursion/chapter_13.md "Reversing a String") - Reversing a String;
15. [Removing Duplicates in a String](../../../java-programming/doc/recursion/chapter_14.md "Removing Duplicates in a String") -
    Removing Duplicates in a String;
16. [Find the First Occurrence of a Number in an Array](../../../java-programming/doc/recursion/chapter_15.md
    "Find the First Occurrence of a Number in an Array") -
    Find the First Occurrence of a Number in an Array;
17. [Invert the Position of Elements in an Array](../../../java-programming/doc/recursion/chapter_16.md "Invert the Position of Elements in an Array") -
    Invert the Position of Elements in an Array.