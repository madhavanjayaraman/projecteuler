package com.madhavan.projecteuler;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CountingSundays {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        int counter = 0;
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 0; month < 12; month++) {
                calendar.set(year, month, 1);
                int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
                if(day_of_week==Calendar.SUNDAY){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
