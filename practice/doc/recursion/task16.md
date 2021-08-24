# Java Programming: Recursion

## Challenge: Print all Permutations of a String

In this lesson, you will find the greatest common divisor (GCD) using recursion.

### What is GCD?

The GCD of two integers is the largest integer that can fully divide both numbers, without a remainder.

#### How to find GCD?

<b>What is the greatest common divisor of 54 and 36?</b>

The number 36 can be expressed as a product of two integers in several different ways:

36 * 1 = 18 * 2 = 12 * 3 = 9 * 4

Thus the divisors for 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36

The number 54 can be expressed as a product of two integers in several different ways:

54 * 1 = 27 * 2 = 18 * 3 = 9 * 6

Thus the divisors for 54 are 1, 2, 3, 6, 9, 18, 27

Common divisors are 1, 2, 3, 6, 9 and 18.

The greatest common divisor or GCD for 36 and 54 is 18.

### Problem Statement

Write a recursive method that computes the GCD of two integers.

Instructions:
1. The method should take two integers as input. Their GCD is to be computed, as input.
2. The method should return the GCD of the two integers as output.
3. The method should be recursive.

### Sample Input

`24, 18`

### Sample Output

`6`

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task16` in the `Solution` class; 
2. Write a meaningful message with a commit and push the code;
3. Show the result to a mentor.

## Quiz

1. What is the output of the following code?

```java
public static int pow(int b, int p) {
    if (p == 0) {
        return 1;
    } else {
        return (b * pow(b, p - 1)); 
    }
}

public static void main(final String[] args) {
    System.out.print(pow(2,5));
}
```

A) 2.

B) 16.

C) 32.

D) 1.

2. What is the output of the following code?

```java
public static int foo(int n) {
    if (n == 12) {
        return n;
    } else {
        return foo(n + 1);
    }
}

public static void main(final String[] args) {
    System.out.print(foo(3));
}
```

A) 75.

B) 12.

C) 3.

3. What is the output of the following code?

```java
public static void recursiveFunc(int n) {
    if (n == 0) {
        System.out.print("False");
        return;
    }
        
    if (n == 1) {
        System.out.print("True");
        return;
    }
        
    if (n % 2 == 0) {
        recursiveFunc(n / 2);
    } else {
        System.out.print("False");
        return;
    }
}

public static void main(final String[] args) {
    recursiveFunc(64);
}
```

A) True.

B) False.

## Answers

Answer questions to a mentor in English.