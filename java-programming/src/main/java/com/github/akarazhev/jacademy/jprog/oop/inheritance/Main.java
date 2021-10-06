package com.github.akarazhev.jacademy.jprog.oop.inheritance;

// Base Class Vehicle
class Vehicle {
    // Private Fields
    private final String make;
    private final String color;
    private final int year;
    private final String model;

    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}

// Derived Class Car
class Car extends Vehicle {
    // Private field
    private final String bodyStyle;

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }
}

class Main {

    public static void main(String[] args) {
        Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
        elantraSedan.carDetails(); //calling method to print details
    }
}
