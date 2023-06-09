package com.teejaywurld.main.ChapterEleven;

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 15: ");
        int number = scanner.nextInt();

        assert (number >= 0 && number <= 15) : "wrong number: " + number;

        System.out.printf("You entered %d%n", number);
    }
}
