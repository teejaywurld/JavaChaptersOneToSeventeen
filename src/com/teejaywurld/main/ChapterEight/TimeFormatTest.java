package com.teejaywurld.main.ChapterEight;

public class TimeFormatTest {

    public static void main(String[] args) {

        TimeFormat timeFormat = new TimeFormat();

        displayTime("After time object is created", timeFormat);
        System.out.println();

        timeFormat.setTime(13, 22, 8);
        displayTime("After calling setTime", timeFormat);
        System.out.println();

        try {
            timeFormat.setTime(99,99,99);
        }

        catch (IllegalArgumentException exception) {
            System.out.printf("Exception: %s%n%n", exception.getMessage());
        }

        displayTime("After calling setTime with invalid values", timeFormat);
    }

    private static void displayTime(String header, TimeFormat time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, time.toUniversalString(), time);
    }
}
