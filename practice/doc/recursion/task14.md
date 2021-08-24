# Java Programming: Recursion

## Challenge: Length of a Linked List

In this task, the user is required to convert the iterative code for finding the length of a Linked List into a recursive one.

### Problem Statement

Given a Linked List, you are required to find the length of the list using recursion.

The illustration below explains the concept.

![alt text](../../etc/recursion/linked-list.png "Linked List")

The <i>iterative code</i> has been provided for you in the code snippet given below.

```java
package com.github.akarazhev.jacademy.practice.jprog.task14.iterative;

import com.github.akarazhev.jacademy.practice.jprog.task14.LinkedList;
import com.github.akarazhev.jacademy.practice.jprog.task14.Node;

public class Solution {
    /* Returns count of nodes in linked list */
    public static int lengthOfList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("Count of nodes is = " + lengthOfList(llist.getHead()));
    }
}
```

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task14.recursion` in the `Solution` class; 
2. Modify the code of the lengthOfList method and then implement the same code recursively. 
   Make sure not to change the input parameters of this method;
3. Write a meaningful message with a commit and push the code;
4. Show the result to a mentor.

## Quiz

1. Recursion is similar to which of the following?

A) Switch case.

B) Loops.

C) If-else.

D) None of the above.

2. Which of the following statements is true?

A) Recursion uses less memory as compared to iteration.

B) Iteration is always better and simpler than recursion.

C) Recursion uses more memory compared to iteration.

D) Recursion is always better than iteration.

3. In recursion, the condition in which the function will stop calling itself is _______.

A) Worst case.

B) Best case. 

C) Base case.

D) Recursive case.

E) There exists no such condition.

4. The following problem(s) can be solved using recursion.

A) The Fibonacci series.

B) Factorial of a number.

C) Sum of numbers in a Linked List.

D) All of the above.

5. What will be the output for the code given below?

```java
private static void recursive_function(int num) {
    if (num == 0) {
        return;
    }
    
    System.out.print(num, " ");
    recursive_function(num - 1);
}

public static void main(final String[] args) {
    recursive_function(5);
}
```

A) 0.

B) 5.

C) 1 2 3 4 5.

D) 5 4 3 2 1.

E) 5 4 3 2 1 0.

6. What is the base case for the code given below?

```java
private static void recursive_function(int num) {
    if (num == 0) {
        return;
    }
    
    System.out.print(num, " ");
    recursive_function(num - 1);
}

public static void main(final String[] args) {
    recursive_function(5);
}
```

A) recursive_function(num-1);

B) if (num == 0)

C) recursive_function(10);

D) return;

7. How many times is the recursive method called when the code given below is executed?

```java
private static void recursive_function(int num) {
    if (num == 0) {
        return;
    }
    
    System.out.print(num, " ");
    recursive_function(num - 1);
}

public static void main(final String[] args) {
    recursive_function(5);
}
```

A) 5.

B) 4.

C) 6.

D) 7.

## Answers

Answer questions to a mentor in English.