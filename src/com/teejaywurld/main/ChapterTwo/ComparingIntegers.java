package com.teejaywurld.main.ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println();

        System.out.print("Enter your first number here: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        secondNumber = scanner.nextInt();

        System.out.println();

        if (firstNumber > secondNumber) {
            System.out.println("The first number you entered 'is larger'");
        }

        if (secondNumber > firstNumber){
            System.out.println("The second number you entered 'is larger'");
        }

        if (firstNumber == secondNumber){
            System.out.println("These numbers you entered are equal");
        }
    }
}
