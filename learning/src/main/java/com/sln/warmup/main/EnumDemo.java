package com.sln.warmup.main;

import com.sln.warmup.enums.WeekDays;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String args[]) {
        System.out.println("Week Starting day in enum  " + WeekDays.MON);
        System.out.println("Week Starting day in enum  string " + WeekDays.MON
                .name());
        WeekDays[] weekDays = WeekDays.values();
        System.out.println("Total Week days in Enum  " + Arrays.asList(weekDays));
    }
}
