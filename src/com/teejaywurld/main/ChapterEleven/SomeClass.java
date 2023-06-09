package com.teejaywurld.main.ChapterEleven;

// TODO:- (Constructor Failure) Write a program that shows a constructor passing
//        information about constructor failure to an exception handler. Define
//        class SomeClass, which throws an Exception in the constructor. Your
//        program should try to create an object of type SomeClass and catch the
//        exception that’s thrown from the constructor.

public class SomeClass {

    private int number;

    public SomeClass(int number) throws Exception {
        if (number < 0){
            throw new Exception("Number must be greater than or equal to zero");
        }
        this.number = number;
    }
}
