package com.github.akarazhev.jacademy.jprog.features.datetime.v16;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class DateTimeDemo {

    public static void main(String[] args) {
        // Adding 4 days to given date and time.
        LocalDateTime date = LocalDateTime.parse("2020-05-12T08:30:00").plusDays(4);
        System.out.println(date);

        // Adding 4 months to given date and time.
        date = LocalDateTime.parse("2020-05-12T08:30:00").plus(4, ChronoUnit.MONTHS);
        System.out.println(date);

        // Subtracting 4 months from given date and time.
        date = LocalDateTime.parse("2020-05-12T08:30:00").minusMonths(4);
        System.out.println(date);
    }
}
