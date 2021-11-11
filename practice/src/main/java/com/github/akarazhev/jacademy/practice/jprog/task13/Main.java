package com.github.akarazhev.jacademy.practice.jprog.task13;

class Vehicle {
    // Complete this implementation
    private final int id;
    private final String model;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}

class Driver {
    // Complete this implementation
    private final String driverName;
    private Vehicle vehicle;

    public Driver(String driverName) {
        this.driverName = driverName;
    }

    public Driver(String driverName, Vehicle vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}

public class Main {

    public static void main(final String[] args) {
        // Write your code here
        Vehicle vehicle = new Vehicle(4453, "Volvo s60");
        Driver driver = new Driver("John");
        driver.setVehicle(vehicle);
        System.out.println(driver);
    }
}
