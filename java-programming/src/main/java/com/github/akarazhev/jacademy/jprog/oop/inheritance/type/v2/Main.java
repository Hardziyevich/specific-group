package com.github.akarazhev.jacademy.jprog.oop.inheritance.type.v2;

class Vehicle {          //Base Vehicle class
    private int topSpeed;

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
        System.out.println("The top speed is set to: " + topSpeed);
    }
}

class Car extends Vehicle { // Derived from Vehicle Base for Prius

    public void openTrunk() {
        System.out.println("The Car trunk is Open Now!");
    }
}

class Prius extends Car {// Derived from Prius & can be base to any further class

    public void turnOnHybrid() {
        System.out.println("The Hybrid mode is turned on!");
    }
}

public class Main {

    public static void main(String[] args) {
        Prius priusPrime = new Prius();
        priusPrime.setTopSpeed(220);
        priusPrime.openTrunk();
        priusPrime.turnOnHybrid();
    }
}
