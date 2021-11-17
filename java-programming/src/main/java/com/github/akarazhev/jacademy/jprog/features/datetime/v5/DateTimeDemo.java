package com.github.akarazhev.jacademy.jprog.features.datetime.v5;

import java.time.DayOfWeek;
import java.time.LocalDate;

class DateTimeDemo {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.parse("2017-04-06").getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
