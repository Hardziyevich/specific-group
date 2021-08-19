package com.github.akarazhev.jacademy.jprog.oop.methods;

final class Car {
    private int speed; // member field speed

    // Setter method to set the speed of the car
    public void setSpeed(final int x) {
        speed = x;
    }

    // Getter method to get the speed of the car
    public int getSpeed() {
        return speed;
    }

    // Public method to print speed
    public void printSpeed(final int speed) {
        System.out.println("Speed: " + speed);
    }
}

public final class Demo {

    public static void main(final String[] args) {
        final Car car = new Car();
        car.printSpeed(100); // calling public method
        car.setSpeed(100); // calling the setter method
        System.out.println(car.getSpeed()); // calling the getter method
    }
}
