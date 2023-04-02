package com.teejaywurld.main.ChapterSeven;

import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {

        // sort doubleArray into ascending order
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for (double value : doubleArray)
            System.out.printf("%.1f ", value);

        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray into array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean copy = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (copy ? "==" : "!="));

        // compare intArray to filledIntArray for equality
        copy = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", (copy ? "==" : "!="));

        // search intArray for the value of 5
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0)
            System.out.printf("Found 5 at element %d in intArray%n", location);
        else
            System.out.println("5 is not found in intArray%n");

        location = Arrays.binarySearch(intArray, 5068);

        if (location >= 0)
            System.out.printf("Found 5068 at element %d in intArray%n", location);
        else
            System.out.println("5068 is not found in intArray");
    }

    private static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array)
            System.out.printf("%d ", value);
    }
}
