package com.github.akarazhev.jacademy.jprog.features.datetime.v1;

import java.time.LocalDate;

class DateTimeDemo {

    public static void main(String[] args) {
        // now() method will return the current date.
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}
