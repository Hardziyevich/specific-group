package com.github.akarazhev.jacademy.jprog.oop.interf.v1;

public class Car implements Vehicle {

//    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.cleanVehicle();
    }
}

