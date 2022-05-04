package com.teejaywurld.ChapterThree;

import java.util.Scanner;

public class AccountTwoDriver {
    public static void main(String[] args) {

        AccountTwo accountTwo = new AccountTwo("Adesoji Taiwo", 50.0);
        AccountTwo accountThree = new AccountTwo("Olugbenga Shofunade", -7.53);

        System.out.printf("%s's balance: $%.2f%n",accountTwo.getName(), accountTwo.getBalance());
        System.out.printf("%s's balance: $%.2f%n%n",accountThree.getName(), accountThree.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your deposit amount here: ");
        double depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to accountTwo's balance%n%n", depositAmount);
        accountTwo.deposit(depositAmount);

        System.out.printf("%s's balance = $%.2f%n", accountTwo.getName(), accountTwo.getBalance());
        System.out.printf("%s's balance = $%.2f%n%n", accountThree.getName(), accountThree.getBalance());

        System.out.print("Enter your deposit amount here: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to accountThree's balance%n%n", depositAmount);
        accountThree.deposit(depositAmount);

        System.out.printf("%s's balance is: $%.2f%n", accountTwo.getName(), accountTwo.getBalance());
        System.out.printf("%s's balance is: $%.2f%n%n", accountThree.getName(), accountThree.getBalance());
        System.out.println("Thank you for banking with us!");
    }
}
