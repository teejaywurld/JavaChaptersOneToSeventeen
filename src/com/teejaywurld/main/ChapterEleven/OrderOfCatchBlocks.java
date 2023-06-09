package com.teejaywurld.main.ChapterEleven;

// TODO:- (Order of catch Blocks) Write a program demonstrating that the order
//        of catch blocks is important. If you try to catch a superclass exception
//        type before a subclass type, the compiler should generate errors

public class OrderOfCatchBlocks {
    public static void main(String[] args) {

        try {
            int n = 10 / 0;
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
