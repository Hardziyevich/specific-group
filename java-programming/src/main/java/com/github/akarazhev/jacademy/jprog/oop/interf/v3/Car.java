package com.github.akarazhev.jacademy.jprog.oop.interf.v3;

public class Car implements Vehicle {

    public static void main(String[] args) {
        Car car = new Car();
        Vehicle.cleanVehicle(); //This will compile.
    }
}
