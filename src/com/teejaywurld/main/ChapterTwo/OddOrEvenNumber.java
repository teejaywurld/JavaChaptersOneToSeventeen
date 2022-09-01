package com.teejaywurld.main.ChapterTwo;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter your number here: ");
        number = scanner.nextInt();

        System.out.println();

        if (number % 2 == 0)
            System.out.println("The number you entered is an even number");
        if (number % 2 != 0)
            System.out.println("The number you entered is an odd number");

        System.out.println();
    }
}
