package com.teejaywurld.main.ChapterThree;

public class DateClass {
    private int month;
    private int day;
    private int year;

    public DateClass(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate(){
        System.out.println("The date you entered is: " + month + "/" + day + "/" + year);
    }
}
