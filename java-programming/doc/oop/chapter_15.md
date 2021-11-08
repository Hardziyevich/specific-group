# Advantages of Inheritance

Intention: In this chapter, you'll get to know about the advantages of using Inheritance.

# Re-usability

Inheritance makes the code reusable. Consider that you are up for designing a banking system using classes. 
Your model might have these:

- A base BankAccount class
- A derived class named SavingsAccount
- A derived class named CheckingAccount

![alt text](../../etc/oop/img.png "Img")

On a later point, you realize that you have to diversify this banking application by adding another class 
for MoneyMarketAccount. So, rather than implementing this class from scratch you can extend from the existing BankAccount 
class as a starting point and reuse its attributes that are common with MoneyMarketAccount.

In the above example, we can examine that we can implement inheritance which will result in avoiding redundant coding 
and will also save the programmer’s time and effort.

# Avoiding Duplication of Code

Considering the above example, you don’t need to duplicate the code for the deposit() and withdraw() methods 
inside the child classes namely SavingsAccount and CheckingAccount. In this way, you can avoid the duplication of code.

![alt text](../../etc/oop/img.png "Img")

# Extensibility

Using inheritance, one can extend the base class logic as per the business logic of the derived class. 
This is an easy way to upgrade or enhance specific parts of a product without changing the core attributes. 
An existing class can act as a base class to derive a new class having upgraded features.

![alt text](../../etc/oop/img.png "Img")

# Data Hiding

The base class can decide to keep some data private so that it cannot be altered by the derived class. 
This concept i.e. encapsulation has already been discussed in the previous chapter.

![alt text](../../etc/oop/img.png "Img")

So these were some of the key advantages of Inheritance. In the next lesson, you will go through a quick quiz 
to test your understanding of the concepts related to Inheritance.

<hr>

Next: [What is Polymorphism?](chapter_16.md "What is Polymorphism?") - What is Polymorphism?

Previous: [Types of Inheritance](chapter_14.md "Types of Inheritance") - Types of Inheritance.