package com.github.akarazhev.jacademy.jprog.oop.sup.v2;

class Vehicle {          //Base class vehicle

    public void display() {   //display method inside SuperClass
        System.out.println("I am from the Vehicle Class");
    }
}

class Car extends Vehicle { // sub class Car extending from Vehicle

    public void display() { //display method inside SubClass
        System.out.println("I am from the Car Class");
    }

    public void printOut() {
        System.out.println("The display() call with super:");
        super.display();  //calling the display() of Vehicle(SuperClass)
        System.out.println("The display() call without super:");
        display();        //calling the display() of the Car(SubClass)
    }
}

public class Main {

    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.printOut();
    }
}
