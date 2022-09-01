package com.teejaywurld.main.ChapterThree;

import java.util.Scanner;

public class AccountClassDriver {
    public static void main(String[] args) {

        System.out.println();

        AccountClass accountClass = new AccountClass("Adetunji Henry", 2000.50);
        AccountClass accountClass2 = new AccountClass("Oluwole Kindness", -1050.98);

        System.out.printf("%s's balance = %.2f%n", accountClass.getName(), accountClass.getBalance());
        System.out.printf("%s's balance = %.2f%n%n", accountClass2.getName(), accountClass2.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your deposit amount here: ");
        double depositAmount = scanner.nextDouble();
        System.out.printf("%nadding $%.2f to accountClass's balance%n%n", depositAmount);
        accountClass.deposit(depositAmount);

        System.out.printf("%s's balance = %.2f%n", accountClass.getName(), accountClass.getBalance());
        System.out.printf("%s's balance = %.2f%n%n", accountClass2.getName(), accountClass2.getBalance());

        System.out.print("Enter your deposit amount here: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding $%.2f to accountClass2's balance%n%n", depositAmount);
        accountClass2.deposit(depositAmount);

        System.out.print("Enter your withdrawal amount here: ");
        double withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nsubtracting $%.2f from accountClass's balance%n%n", withdrawalAmount);
        accountClass.withdraw(withdrawalAmount);

        System.out.print("Enter your withdrawal amount here: ");
        withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nsubtracting $%.2f from accountClass2's balance%n%n", withdrawalAmount);
        accountClass2.withdraw(withdrawalAmount);

        System.out.printf("%s's total balance is: $%.2f%n", accountClass.getName(), accountClass.getBalance());
        System.out.printf("%s's total balance is: $%.2f%n", accountClass2.getName(), accountClass2.getBalance());

        System.out.println();

        System.out.println("Thank you for banking with us!");

    }
}
