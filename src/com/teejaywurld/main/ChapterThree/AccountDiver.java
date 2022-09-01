package com.teejaywurld.main.ChapterThree;

import java.util.Scanner;

public class AccountDiver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.print("Please enter your account name here: ");
        String theName = scanner.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("The name in object myAccount is: %n%s%n", myAccount.getName());

    }
}
