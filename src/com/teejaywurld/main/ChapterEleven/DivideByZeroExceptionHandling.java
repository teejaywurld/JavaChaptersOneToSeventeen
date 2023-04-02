package com.teejaywurld.main.ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroExceptionHandling {

    public static int quotient(int numerator, int denominator)
        throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int firstEntry = scanner.nextInt();

                System.out.print("Please enter an integer denominator: ");
                int secondEntry = scanner.nextInt();

                int result = quotient(firstEntry, secondEntry);
                System.out.printf("%nResult: %d / %d = %d%n", firstEntry, secondEntry, result);
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine();
                System.out.printf("You can only enter integers. Please try again.%n%n");
            }
            catch (ArithmeticException arithmeticException){
                System.err.printf("Exception: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);
    }
}
