package com.github.akarazhev.jacademy.practice.jprog.task9;

// Rectangle Class
final class Rectangle {
    // Write Fields Here
    private int length;
    private int width;

    public Rectangle() {
        // Write your code here
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        // Write your code here
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        // Write your code here
        return length * width;
    }
}

public final class Demo {

    public static void main(final String[] args) {
        Rectangle obj = new Rectangle(2,2);
        System.out.println(obj.getArea());
    }
}
