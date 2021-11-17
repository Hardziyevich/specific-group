package com.github.akarazhev.jacademy.jprog.features.datetime.v21;

import java.time.Period;

class DateTimeDemo {

    public static void main(String[] args) {
        Period period = Period.ofDays(5);  // Period of 5 days.
        System.out.println(period.getDays());

        period = Period.ofMonths(3);  // Period of 3 months.
        System.out.println(period.getMonths());

        period = Period.ofYears(2);  // Period of 2 Years
        System.out.println(period.getYears());


        period = Period.of(2, 5, 12); // Period of 2 Years, 5 Months and 12 Days.
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
