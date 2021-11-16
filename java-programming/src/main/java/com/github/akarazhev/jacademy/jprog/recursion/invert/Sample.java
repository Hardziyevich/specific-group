package com.github.akarazhev.jacademy.jprog.recursion.invert;

public class Sample {

    private static void invert(int[] arr) {
        int s = arr.length / 2;
        int tmp = arr.length - 1;
        int tmp2 = 0;
        for (int i = 0; i < s; i++) {
            tmp2 = arr[i];
            arr[i] = arr[tmp];
            arr[tmp] = tmp2;
            tmp = tmp - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        int[] a = {5, 4, 3, 2, 1, 0};
        System.out.print("{ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("} ");

        System.out.println(" ");

        invert(a);

        System.out.print("{ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("} ");
    }
}
