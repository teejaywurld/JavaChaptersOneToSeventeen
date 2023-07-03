package com.teejaywurld.main.ChapterFourteen;

public class StringMiscellaneous {
    public static void main(String[] args) {

        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        System.out.printf("%nLength of s1: %d", s1.length());

        // loop through characters in s1 with charAt and display reversed
        System.out.printf("%nThe string reversed is: ");
        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.printf("%c ", s1.charAt(count));

        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}
