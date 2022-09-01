package com.teejaywurld.main.ChapterThree;

import java.util.*;

public class DateClassDriver {
    public static void main(String[] args) {

        DateClass myDate = new DateClass(5, 5, 2022);
        System.out.println();

        System.out.println("Complete the following instructions carefully: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tEnter the current month here: ");
        int month = scanner.nextInt();
        myDate.setMonth(month);

        System.out.print("\tEnter the current day here: ");
        int day = scanner.nextInt();
        myDate.setDay(day);

        System.out.print("\tEnter the current year here: ");
        int year = scanner.nextInt();
        myDate.setYear(year);

        System.out.println();

        myDate.displayDate();

        System.out.println();

    }
}
