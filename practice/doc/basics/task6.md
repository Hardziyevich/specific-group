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