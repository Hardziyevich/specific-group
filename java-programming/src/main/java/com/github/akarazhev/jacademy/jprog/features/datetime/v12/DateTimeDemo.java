package com.github.akarazhev.jacademy.jprog.features.datetime.v12;

import java.time.LocalTime;

class DateTimeDemo {

    public static void main(String[] args) {
        boolean isBefore = LocalTime.parse("06:23")
                .isBefore(LocalTime.parse("07:50"));
        System.out.println(isBefore);

        boolean isAfter = LocalTime.parse("06:23")
                .isAfter(LocalTime.parse("07:50"));
        System.out.println(isAfter);
    }
}
