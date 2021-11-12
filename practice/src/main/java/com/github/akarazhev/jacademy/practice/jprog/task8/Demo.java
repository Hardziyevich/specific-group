package com.github.akarazhev.jacademy.practice.jprog.task8;

final class Calculator {
    // write class fields here
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        // write definition here
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        // write definition here
        return num1 + num2;
    }

    double subtract() {
        // write definition here
        return num2 - num1;
    }

    double multiply() {
        // write definition here
        return num2 * num1;
    }

    double divide() {
        // write definition here
        return num2 / num1;
    }
}

public final class Demo {

    public static void main(final String[] args) {
        final Calculator obj = new Calculator(10, 94);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
