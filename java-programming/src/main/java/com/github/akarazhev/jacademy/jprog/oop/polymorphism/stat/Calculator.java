package com.github.akarazhev.jacademy.jprog.oop.polymorphism.stat;

public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("10 + 20 = " + obj.add(10, 20));
        System.out.println("10 + 20 + 30 = " + obj.add(10, 20, 30));
    }
}
