package com.github.akarazhev.jacademy.jprog.features.datetime.v20;

import java.time.ZonedDateTime;

class DateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Date after adding Year is: " + zonedDateTime.plusYears(1));

        System.out.println("Date after adding Month is: " + zonedDateTime.plusMonths(1));

        System.out.println("Date after adding days is: " + zonedDateTime.plusDays(15));

        System.out.println("Date after adding hours is: " + zonedDateTime.plusHours(15));

        System.out.println("Date after adding minutes is: " + zonedDateTime.plusMinutes(1));

        System.out.println("Date after adding seconds is: " + zonedDateTime.plusSeconds(15));

        System.out.println("Date after adding nanoseconds is: " + zonedDateTime.plusNanos(15));

        System.out.println("Date after subtracting Year is: " + zonedDateTime.minusYears(1));

        System.out.println("Date after subtractng Month is: " + zonedDateTime.minusMonths(1));

        System.out.println("Date after subtracting days is: " + zonedDateTime.minusDays(15));

        System.out.println("Date after subtracting hours is: " + zonedDateTime.minusHours(15));

        System.out.println("Date after subtracting minutes is: " + zonedDateTime.minusMinutes(1));

        System.out.println("Date after subtracting seconds is: " + zonedDateTime.minusSeconds(15));

        System.out.println("Date after subtracting nanoseconds is: " + zonedDateTime.minusNanos(15));
    }
}
