package com.teejaywurld.ChapterTwo;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println();

        System.out.print("Enter your first number here: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.printf("%d == %d%n", firstNumber, secondNumber);
        }

        if (secondNumber == firstNumber){
            System.out.printf("%d == %d%n", secondNumber, firstNumber);
        }

        if (firstNumber < secondNumber){
            System.out.printf("%d < %d%n", firstNumber, secondNumber);
        }

        if (secondNumber < firstNumber){
            System.out.printf("%d < %d%n", secondNumber, firstNumber);
        }

        if (firstNumber > secondNumber){
            System.out.printf("%d > %d%n", firstNumber, secondNumber);
        }

        if (secondNumber > firstNumber){
            System.out.printf("%d > %d%n", secondNumber, firstNumber);
        }

        if (firstNumber != secondNumber){
            System.out.printf("%d != %d%n", firstNumber, secondNumber);
        }

        if (secondNumber != firstNumber){
            System.out.printf("%d != %d%n", secondNumber, firstNumber);
        }

        if (firstNumber <= secondNumber){
            System.out.printf("%d <= %d%n", firstNumber, secondNumber);
        }

        if (secondNumber <= firstNumber){
            System.out.printf("%d <= %d%n", secondNumber, firstNumber);
        }

        if (firstNumber >= secondNumber){
            System.out.printf("%d >= %d%n", firstNumber, secondNumber);
        }

        if (secondNumber >= firstNumber){
            System.out.printf("%d >= %d%n", secondNumber, firstNumber);
        }

        else {
            System.out.print("Number is not correct");
        }
        System.out.println();
    }
}
