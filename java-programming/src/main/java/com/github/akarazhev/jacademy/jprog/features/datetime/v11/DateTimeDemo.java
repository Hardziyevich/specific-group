package com.github.akarazhev.jacademy.jprog.features.datetime.v11;

import java.time.LocalTime;

class DateTimeDemo {

    public static void main(String[] args) {
        int minute = LocalTime.parse("07:45").getMinute();
        System.out.println(minute);
    }
}
