package com.teejaywurld.main.ChapterSix;

// TODO:
//  (Exponentiation) Write a method integerPower(base, exponent) that returns the value of base exponent
//  For example, integerPower(3, 4) calculates 3 ^ 4 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
//  nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//  Do not use any Math class methods. Incorporate this method into an application that reads integer
//  values for base and exponent and performs the calculation with the integerPower method.

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value for the base here: ");
        int base = scanner.nextInt();

        System.out.println();

        System.out.print("Enter the exponent for the base here: ");
        int exponent = scanner.nextInt();

        scanner.close();

        System.out.printf("%n%d raised to power %d = %d", base, exponent, integerPower(base, exponent));
    }

    private static long integerPower(int base, int exponent) {
        long result = 1;

        for (; exponent != 0; --exponent)
            result *= base;

            return result;
    }
}
