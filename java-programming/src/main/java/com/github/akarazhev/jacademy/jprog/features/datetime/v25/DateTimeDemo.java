package com.github.akarazhev.jacademy.jprog.features.datetime.v25;

import java.time.Duration;
import java.time.LocalTime;

class DateTimeDemo {

    public static void main(String[] args) {
        Duration duration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));
        System.out.println("The difference is " + duration.getSeconds() + " Seconds");
    }
}
