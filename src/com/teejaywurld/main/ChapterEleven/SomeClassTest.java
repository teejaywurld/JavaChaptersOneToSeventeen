package com.teejaywurld.main.ChapterEleven;

public class SomeClassTest {
    public static void main(String[] args) {
        try {
            new SomeClass(-1);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
