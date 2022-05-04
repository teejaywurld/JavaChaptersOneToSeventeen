package com.teejaywurld.ChapterThree;

public class AccountClass {
    private String name;
    private double balance;

    public AccountClass(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void withdraw (double withdrawalAmount){
        if (withdrawalAmount <= balance)
            balance -= withdrawalAmount;
        else
            System.out.print("Withdrawal amount exceeded account balance\n");

        System.out.println();
    }


}

