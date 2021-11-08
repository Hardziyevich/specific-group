# Java Programming: Java Collections

## Challenge: Let's solve some ArrayList practice problems.

We are given an ArrayList that contains `Employee` objects. We need to print the following details:

### Problem Statements

#### Problem 1: Find employees aged over 50

All the employee names whose age is more than 50.

#### Problem 2: Find employees from the USA

Remove all the Employees from the List who reside in the USA.

#### Problem 3: Sort employees by country

Sort all the employees by country name.

## Task steps

1. Put your program here: `com.github.akarazhev.jacademy.practice.jprog.task19` in the `ArrayListExercise1..3` classes;
2. Write a meaningful message with a commit and push the code;
3. Show the result to a mentor.

## Quiz

1. We have a list with 3 elements, i.e. [5, 3, 1], and the following code is executed.

`nums.add(6);`

`nums.add(0, 4);`

`nums.remove(1);`

What will be the resulting List?

A) [5,3,1,6]

B) [4,3,1,6]

C) [4,3,6]

D) [4,5,3,6]

2. Which of the following commands will be used to fetch the first element from an ArrayList named `nums`?

A) `nums[0]`

B) `nums[1]`

C) `nums.get(0)`

D) `nums.get(1)`

3. Which of the following is the correct syntax to get the last element from an ArrayList named `nums`?

A) `nums.get(nums.length - 1)`

B) `nums.get(nums.length)`

C) `nums.get(nums.size() - 1)`

D) `nums.get(nums.size())`

4. Given the nums ArrayList with the values [1, 4, 3, 2], which of the following t statements removes the value 2 from the list?

Choose all that apply.

A) `nums.remove(3)`

B) `nums.remove(2)`

C) `nums.remove(new Integer(2))`

D) `nums.remove(4)`

5. Given an ArrayList with the following elements [3, 4, 7, 5, 9], what will be the output of the below statement?
```java
System.out.println(list.remove(0));
```
   
A) 4

B) 3

C) 0

D) null

6. Which of the following interfaces should we use if we need more than one type of sorting logic for our objects?

A) Comparable

B) Comparator

7. Which of the following methods is present in the Comparable interface?

A) `compare()`

B) `compareTo()`

8. In the `Collections.sort(List<T> o)` method, T should implement which interface?

Here `T` represents the type of object present in ArrayList.

A) Comparable

B) Comparator

## Answers

Answer questions to a mentor in English.

## Theory chapters

1. [Introduction to Collection](../../../java-programming/doc/collections/chapter_1.md "Introduction to Collection") - Introduction to Collection;
2. [ArrayList: Introduction](../../../java-programming/doc/collections/chapter_2.md "ArrayList: Introduction") - ArrayList: Introduction;
3. [ArrayList: Inserting and Retrieving Elements](../../../java-programming/doc/collections/chapter_3.md "ArrayList: Inserting and Retrieving Elements") -
   ArrayList: Inserting and Retrieving Elements;
4. [ArrayList: Few More Operations](../../../java-programming/doc/collections/chapter_4.md "ArrayList: Few More Operations") -
   ArrayList: Few More Operations;
5. [ArrayList: Iteration](../../../java-programming/doc/collections/chapter_5.md "ArrayList: Iteration") - ArrayList: Iteration;
6. [ArrayList: Iteration using ListIterator](../../../java-programming/doc/collections/chapter_6.md "ArrayList: Iteration using ListIterator") -
   ArrayList: Iteration using ListIterator;
7. [ArrayList Sorting](../../../java-programming/doc/collections/chapter_7.md "ArrayList Sorting") - ArrayList Sorting;
8. [Understanding Comparable Interface](../../../java-programming/doc/collections/chapter_8.md "Understanding Comparable Interface") -
   Understanding Comparable Interface;
9. [Understanding Comparator Interface](../../../java-programming/doc/collections/chapter_9.md "Understanding Comparator Interface") -
   Understanding Comparator Interface.