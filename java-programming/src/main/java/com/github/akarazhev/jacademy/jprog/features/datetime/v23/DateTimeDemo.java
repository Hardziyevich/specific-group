package com.github.akarazhev.jacademy.jprog.features.datetime.v23;

import java.time.LocalDate;
import java.time.Period;

class DateTimeDemo {

    public static void main(String[] args) {
        Period period = Period.between(LocalDate.parse("2017-04-17"), LocalDate.parse("2020-05-18"));

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("The difference between two dates is " + years + " Years, " + months + " Months and " + days + " Days");
    }
}
