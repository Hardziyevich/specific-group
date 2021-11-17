package com.github.akarazhev.jacademy.jprog.recursion;

public class RemoveDuplicatesClass {

    private static String remDuplicates(String text) {
        if (text.length() == 1) {
            return text;
        }

        if (text.substring(0, 1).equals(text.substring(1, 2))) {
            return remDuplicates(text.substring(1));
        } else {
            return text.substring(0, 1) + remDuplicates(text.substring(1));
        }
    }

    public static void main(String[] args) {
        String input1 = "Helloo";
        String input2 = "Thiss iiss aa teesstt";

        System.out.println("Original string: " + input1);

        String output = remDuplicates(input1);

        System.out.println("String after: " + output);
    }
}