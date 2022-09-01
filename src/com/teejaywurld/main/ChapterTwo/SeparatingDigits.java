package com.teejaywurld.main.ChapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter your five digit number here: ");

        int number = scanner.nextInt();
        int firstDigit = number / 10000;
        System.out.println(firstDigit);
        int secondDigit =  (number % 10000) / 1000;
        System.out.println(secondDigit);
        int thirdDigit = (number % 1000) / 100;
        System.out.println(thirdDigit);
        int fourthDigit = (number % 100) / 10;
        System.out.println(fourthDigit);
        int fifthDigit = number % 10;

        System.out.printf("%d %d %d %d %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

        System.out.println();
    }
}
