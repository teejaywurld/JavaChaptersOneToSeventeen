package com.teejaywurld.main.ChapterEleven;

public class CatchingExceptionsUsingOuterScopes {
    public static void main(String[] args) {
        try {
            doSomething("10");
            doSomething("Invalid - 10");
            doSomething("0");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException handled in main");
        }
    }

    private static void doSomething(String numberString) {
        try {
            int number = Integer.parseInt(numberString);

            System.out.println(100 / number);
        }
        catch (NumberFormatException formatException){
            System.out.println("NumberFormatException handled in doSomething");
        }
    }
}
