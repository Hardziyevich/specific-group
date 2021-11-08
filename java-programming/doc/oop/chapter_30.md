# Aggregation

Intention: In this chapter, you'll get familiar with a new way of linking different classes.

Aggregation follows the has-A model. This creates a parent-child relationship between two classes, with one class owning 
the object of another.

So, what makes aggregation unique?

# Independent Lifetimes

In aggregation, the lifetime of the owned object does not depend on the lifetime of the owner.

The owner object could get deleted, but the owned object can continue to exist in the program. In aggregation, 
the parent only contains a reference to the child, which removes the child’s dependency.

![alt text](../../etc/oop/img.png "Img")

You can probably guess from the illustration above that we’ll need object references to implement aggregation.

# Example

Let’s take the example of people and their country of origin. Each person is associated with a country, 
but the country can exist without that person:

```java

```

As we can see, the country object lives on even after the user goes out of scope. This creates a loosely coupled 
relationship between the two classes.

In the next lesson, you will learn about another technique for relating objects in Java: composition.

<hr>

Next: [Composition](chapter_31.md "Composition") - Composition.

Previous: [Aggregation and Composition](chapter_29.md "Aggregation and Composition") - Aggregation and Composition.