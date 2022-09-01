package com.teejaywurld.main.ChapterThree;

public class AccountTwo {
    private String name;
    private double balance;

    // Account Constructor that receives two parameters --line 11
    // Validate that the balance is greater than 0.0; if it's not,
    // instance variable balance keeps its default initial value of 0.0

    public AccountTwo (String name, double balance){
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit (double depositAmount){
        if (depositAmount > 0.0)  // if the deposit is valid, add it to balance
            balance += depositAmount;
    }

    public double getBalance(){
        return balance;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
