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