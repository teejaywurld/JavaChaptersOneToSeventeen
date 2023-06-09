package com.teejaywurld.main.ChapterEleven;

// TODO:- /* 11.17 (Catching Exceptions Using Class Exception) Write a program
//        that demonstrates how various exceptions are caught with
//        catch (Exception exception)
//        This time, define classes ExceptionA (which inherits from class
//        Exception) and ExceptionB (which inherits from class
//        ExceptionA). In your program, create try blocks that throw
//        exceptions of types ExceptionA, ExceptionB,
//        NullPointerException and IOException. All exceptions should
//        be caught with catch blocks specifying type Exception. */

import java.io.IOException;

public class CatchingExceptionsUsingClassException {
    public static void main(String[] args) {

        try {
            throw new CatchingExceptionA("Exception A");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        try {
            throw new CatchingExceptionB("Exception B");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        try {
            throw new NullPointerException();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        try {
            throw new IOException();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
