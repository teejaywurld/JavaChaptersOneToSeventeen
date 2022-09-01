package com.teejaywurld.main.ChapterTwo;

import java.util.Scanner;

public class FiveIntegersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

        System.out.print("Enter your first number here: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter your third number here: ");
        thirdNumber = scanner.nextInt();

        System.out.print("Enter your fourth number here: ");
        fourthNumber = scanner.nextInt();

        System.out.print("Enter your fifth number here: ");
        fifthNumber = scanner.nextInt();

        int largest = firstNumber;
        if (secondNumber > largest)
            largest = secondNumber;
        if (thirdNumber > largest)
            largest = thirdNumber;
        if (fourthNumber > largest)
            largest = fourthNumber;
        if (fifthNumber > largest)
            largest = fifthNumber;

        int smallest = firstNumber;
        if (secondNumber < smallest)
            smallest = secondNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;
        if (fourthNumber < smallest)
            smallest = fourthNumber;
        if (fifthNumber < smallest)
            smallest = fifthNumber;

        System.out.println();

        System.out.printf("The smallest number is: %d%n", smallest);
        System.out.printf("The largest number is: %d%n", largest);

        System.out.println();
    }
}
