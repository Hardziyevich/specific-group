package com.github.akarazhev.jacademy.practice.jprog.task4;

public final class CircleArea {

    public static double circleArea(final double r) {
        return r * r * Math.PI;
    }

    public static void main(final String[] args) {
        System.out.println("A circle of radius two has area " + circleArea(2));
    }
}
