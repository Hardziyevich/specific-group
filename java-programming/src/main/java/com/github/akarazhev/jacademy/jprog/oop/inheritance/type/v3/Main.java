package com.github.akarazhev.jacademy.jprog.oop.inheritance.type.v3;

class Vehicle {          //Base Vehicle class
    private int topSpeed;

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
        System.out.println("The top speed of " + getClass().getSimpleName() + " is set to: " + topSpeed);
    }
}

class Car extends Vehicle { // Derived from Vehicle Base for Prius
    //implementation of Car class
}

class Truck extends Vehicle {// Derived from Prius can be base to any further class
    //implementation of Truck class
}

class Main {

    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.setTopSpeed(220);

        Truck volvo = new Truck();
        volvo.setTopSpeed(120);
    }
}
