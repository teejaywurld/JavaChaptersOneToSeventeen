package com.teejaywurld.main.ChapterThree;

public class ClassStudentDriver {
    public static void main(String[] args) {
        System.out.println();
        ClassStudent bestClass = new ClassStudent("Mayowa Bankole", 95.45);
        ClassStudent superClass = new ClassStudent("Ayomide Oladimeji", 75.58);

        System.out.println("\t\tFind your exam grade below:");

        System.out.println();

        System.out.printf("\t%s's letter grade is: %s%n", bestClass.getName(), bestClass.getLetterGrade());
        System.out.printf("\t%s's letter grade is: %s%n", superClass.getName(), superClass.getLetterGrade());

        System.out.println();

        System.out.println("\t\tThank you for checking");
    }
}
