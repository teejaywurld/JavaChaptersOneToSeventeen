package com.teejaywurld.main.ChapterEleven;

public class CatchingExceptionA extends Exception{

    public CatchingExceptionA(){
        super("Exception A");
    }

    public CatchingExceptionA(String message){
        super(message);
    }
}
