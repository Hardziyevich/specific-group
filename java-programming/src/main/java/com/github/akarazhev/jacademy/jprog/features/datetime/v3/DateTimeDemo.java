package com.github.akarazhev.jacademy.jprog.features.datetime.v3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateTimeDemo {

    public static void main(String[] args) {
        // parse(CharSequence text)
        LocalDate date = LocalDate.parse("2015-02-12");
        System.out.println(date);

        // parse(CharSequence text, DateTimeFormatter formatter)
        date = LocalDate.parse("12/02/2012", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date);
    }
}
