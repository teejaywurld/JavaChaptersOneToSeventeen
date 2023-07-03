package com.teejaywurld.main.ChapterSixteen;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> firstList = new LinkedList<>();

        for (String color : colors)
            firstList.add(color);

        String[] colorSet = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> secondList = new LinkedList<>();

        for (String color : colorSet)
            secondList.add(color);

        firstList.addAll(secondList);
        secondList = null;
        printList(firstList);

        convertToUppercaseString(firstList);
        printList(firstList);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(firstList, 4, 7);
        printList(firstList);
        printReversedList(firstList);
    }

    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");

        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }

    private static void convertToUppercaseString(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
}
