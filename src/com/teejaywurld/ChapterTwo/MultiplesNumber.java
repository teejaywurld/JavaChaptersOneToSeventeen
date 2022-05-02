package com.teejaywurld.ChapterTwo;

import java.util.Scanner;

public class MultiplesNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.print("Enter your first number here: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        secondNumber = scanner.nextInt();

        System.out.println();

        if (firstNumber % secondNumber == 0)
            System.out.printf("The number you entered is a multiple of the second", firstNumber, secondNumber);

        if (firstNumber % secondNumber != 0)
            System.out.printf("The first number you entered is not a multiple of the second", firstNumber, secondNumber);

        System.out.println();
    }
}
