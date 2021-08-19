package com.github.akarazhev.jacademy.jprog.oop.methods.calc;

class Calculator {

    public double product(double x, double y) {
        return x * y;
    }

    // Overloading the function to handle three arguments
    public double product(double x, double y, double z) {
        return x * y * z;
    }

    // Overloading the function to handle int
    public int product(int x, int y) {
        return x * y;
    }
}

public final class Demo {

    public static void main(final String[] args) {
        final Calculator cal = new Calculator();

        double x = 10;
        double y = 20;
        double z = 5;

        int a = 12;
        int b = 4;

        System.out.println(cal.product(x, y));
        System.out.println(cal.product(x, y, z));
        System.out.println(cal.product(a, b));
    }
}
