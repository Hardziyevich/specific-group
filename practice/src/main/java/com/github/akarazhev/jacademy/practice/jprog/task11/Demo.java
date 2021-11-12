package com.github.akarazhev.jacademy.practice.jprog.task11;

// Base Class
class Shape {
    // Private Data Members
    private final String name;

    public Shape() { // Default Constructor
        name = "Shape";
    }

    // Getter Function
    public String getName() {
        return name;
    }
}

// Derived Class
class XShape extends Shape {
    private final String name;

    public XShape(final String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        // write your code here
        return super.getName() + ", " + this.name;
    }
}

public final class Demo {

    public static void main(final String[] args) {
        final Shape circle = new XShape("Circle");
        System.out.println(circle.getName());
    }
}
