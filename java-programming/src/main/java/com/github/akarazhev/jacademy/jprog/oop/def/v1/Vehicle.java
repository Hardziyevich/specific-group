package com.github.akarazhev.jacademy.jprog.oop.def.v1;

public interface Vehicle {

    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}
