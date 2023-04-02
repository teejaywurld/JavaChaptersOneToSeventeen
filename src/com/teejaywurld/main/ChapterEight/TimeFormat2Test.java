package com.teejaywurld.main.ChapterEight;

public class TimeFormat2Test {

    public static void main(String[] args) {

        TimeFormat2 time1 = new TimeFormat2();
        TimeFormat2 time2 = new TimeFormat2(2);
        TimeFormat2 time3 = new TimeFormat2(21, 34);
        TimeFormat2 time4 = new TimeFormat2(12, 25, 42);
        TimeFormat2 time5 = new TimeFormat2(time4);

        System.out.println("Constructed with:");
        displayTime("time1: all default arguments", time1);
        displayTime("time2: hour specified; default minute and second", time2);
        displayTime("time3: hour and minute specified; default second", time3);
        displayTime("time4: hour, minute and second specified", time4);
        displayTime("time5: TimeFormat2 object time4 specified", time5);

        try {
            TimeFormat2 time6 = new TimeFormat2(29, 83, 99);
        }

        catch (IllegalArgumentException exception){
            System.out.printf("%nException while initializing time6: %s%n", exception.getMessage());
        }
    }

    private static void displayTime(String header, TimeFormat2 time) {
        System.out.printf("%s%n  %s%n  %s%n", header, time.toUniversalString(), time);
    }
}
