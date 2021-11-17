package com.github.akarazhev.jacademy.jprog.features.datetime.v2;

import java.time.LocalDate;
import java.time.Month;

class DateTimeDemo {

    public static void main(String[] args) {
        // of(int year, int month, int dayOfMonth)
        LocalDate date = LocalDate.of(2019, 05, 03);
        System.out.println(date);

        // of(int year, Month month, int dayOfMonth)
        date = LocalDate.of(2019, Month.AUGUST, 03);
        System.out.println(date);
    }
}
