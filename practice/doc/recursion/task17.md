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