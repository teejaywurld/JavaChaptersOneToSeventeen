package com.teejaywurld.main.ChapterFourteen;

public class StringBuilderCapLen {
    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("Hello, how are you today?");

        System.out.printf("buffer = %s%nlength = %s%ncapacity = %s%n%n",buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
    }
}
