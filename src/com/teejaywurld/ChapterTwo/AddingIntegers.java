package com.teejaywurld.ChapterTwo;

import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int difference = 0;
        int quotient = 0;
        int multiplication = 0;

        System.out.print("Enter your first number here: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        int secondNumber = scanner.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        quotient = firstNumber / secondNumber;
        multiplication = firstNumber * secondNumber;

        System.out.println();

        System.out.printf("The total sum of added figures is: %d%n", sum);
        System.out.printf("The total difference of the two figures is: %d%n", difference);
        System.out.printf("The total division of the two figures is: %d%n", quotient);
        System.out.printf("The multiplication of the two figures is: %d%n", multiplication);
    }
   }

