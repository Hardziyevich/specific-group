package com.github.akarazhev.jacademy.practice.jprog.task10;

// Base Class
class Vehicle {
    // Private Data Members
    private final String speed;
    private final String model;

    public Vehicle() { // Default Constructor
        speed = "100";
        model = "Tesla";
    }

    // Getter Function
    public String getSpeed() {
        return speed;
    }

    // Getter Function
    public String getModel() {
        return model;
    }
}

// Derived Class
public class Car extends Vehicle {
    public String name; //  Name of a Car

    public Car() { // Default Constructor
        name = "";
    }

    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
        this.name = name;
    }

    // This function calls the Base class functions and append the result with input
    public String getDetails() {
        //
        return name + ", " + super.getModel() + ", " + super.getSpeed();
    }

    public static void main(final String[] args) {
        final Car car = new Car();
        //
        car.name = "Roadster";
        System.out.println(car.getDetails());
    }
}
