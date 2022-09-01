package com.teejaywurld.main.ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;

        System.out.print("Enter your first number here: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter your third number here: ");
        thirdNumber = scanner.nextInt();

        sum = firstNumber + secondNumber + thirdNumber;
        average = sum / 3;
        product = firstNumber * secondNumber * thirdNumber;

        largest = firstNumber;
        if (secondNumber > largest)
            largest = secondNumber;
        if (thirdNumber > largest)
            largest = thirdNumber;

        smallest = firstNumber;
        if (secondNumber < smallest)
            smallest = secondNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;

        System.out.println();

        System.out.printf("The smallest number of the three is: %d%n", smallest);
        System.out.printf("The largest number of the three is: %d%n", largest);
        System.out.printf("The sum of the three numbers is %d%n", sum);
        System.out.printf("The average of the three numbers is %d%n", average);
        System.out.printf("The multiplication of the three numbers is %d%n", product);

        System.out.println();
    }
}
