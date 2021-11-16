package com.github.akarazhev.jacademy.jprog.features.datetime.v24;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DateTimeDemo {

    public static void main(String[] args) {
        Duration duration = Duration.ofDays(1);  // Created a duration of 1 day.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in a day.

        duration = Duration.ofHours(2);  // Created a duration of 2 hours.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 2 hours.

        duration = Duration.ofMinutes(23);  // Created a duration of 23 minutes.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 23 minutes.

        duration = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration.getSeconds() + " seconds");
    }
}
