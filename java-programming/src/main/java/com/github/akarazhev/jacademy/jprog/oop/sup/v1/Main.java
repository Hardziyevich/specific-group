package com.github.akarazhev.jacademy.jprog.oop.sup.v1;

class Vehicle { //Base class vehicle
    int fuelCap = 90; //fuelCap field inside SuperClass
}


class Car extends Vehicle { // sub class Car extending from Vehicle
    int fuelCap = 50; //fuelCap field inside SubClass

    public void display() {
        //accessing the field of parent class using super*/
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCap);
        //without using super the field of current class shadows the field of parant class*/
        System.out.println("Fuel Capacity from the Car class: " + fuelCap);
    }
}

public class Main {

    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.display();
    }
}
