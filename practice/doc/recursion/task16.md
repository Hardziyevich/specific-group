# Java Programming: Recursion

## Challenge: Print all Permutations of a String

In this task, you must implement the code to find and print all permutations of a given string using recursion.

### Problem Statement

For this challenge, you will be given an array and its length, and you must print out all the permutations of the 
<b>array</b>.

A permutation is an arrangement of all or part of a set of objects. For example, the arrangement of words 'cat' and 
'act' represent two distinct permutations (or arrangements) of a similar three letter word.

The illustration below explains the concept.

![alt text](../../etc/recursion/strings.png "Removing all whitespaces from a string")

### Sample Input

`ba`

### Sample Output

`ab`

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task16` in the `Solution` class; 
2. Write a meaningful message with a commit and push the code;
3. Show the result to a mentor.

## Quiz

1. The task is to reverse the string provided.

```java
public static String reverseString(String myStr) {
    // Base case
    if (myStr.isEmpty()) {
        return myStr;
    } else {
        // Recursive case
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}
```

What should the base case of the above mentioned code be?

A) myStr == null

B) myStr.isEmpty()

C) myStr.length < 1

2. What is the output of the following code?

```java
public static int totalVowels(String text, int len, int index) {
    int count = 0;
    if (len == 0) {
        return 0;
    }
    
    char single = Character.toUpperCase(text.charAt(index));
    if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
        count++;
    }
    
    return count + totalVowels(text, len - 1, index + 1);
}

public static void main(String args[]) {
    String text = "thisisrecursion";
    int cnt = 0;
    cnt = recursiveFunc(text, text.length, 0);
    System.out.println(cnt);
}
```

A) 7

B) 10

C) 8

D) 6

## Answers

Answer questions to a mentor in English.