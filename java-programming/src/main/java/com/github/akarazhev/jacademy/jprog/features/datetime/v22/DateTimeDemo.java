package com.github.akarazhev.jacademy.jprog.features.datetime.v22;

import java.time.LocalDate;
import java.time.Period;

class DateTimeDemo {

    public static void main(String[] args) {
        Period period = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
        System.out.println(period);
    }
}
