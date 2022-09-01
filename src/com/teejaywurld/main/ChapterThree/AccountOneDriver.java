package com.teejaywurld.main.ChapterThree;

public class AccountOneDriver {
    public static void main(String[] args) {
        AccountOne accountOne = new AccountOne("Babatunde Timothy");
        AccountOne accountTwo = new AccountOne("Olushola  Samuel");

        System.out.println();

        System.out.printf("accountOne's name is: %s%n", accountOne.getName());
        System.out.printf("accountTwo's name is %s%n", accountTwo.getName());
    }
}
