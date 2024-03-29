package com.teejaywurld.main.ChapterEight;

// TODO:- Time Class Case Study with Overloaded Constructors

public class TimeFormat2 {

    private int hour;
    private int minute;
    private int second;

    public TimeFormat2(){
        this(0, 0, 0);
    }

    public TimeFormat2(int hour){
        this(hour, 0, 0);
    }

    public TimeFormat2(int hour, int minute){
        this(hour, minute, 0);
    }

    public TimeFormat2(int hour, int minute, int second){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeFormat2(TimeFormat2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    public void setMinute(int minute){
        if (minute < 0 && minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        this.minute = minute;
    }

    public void setSecond(int second){
        if (second < 0 && second >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        this.second = second;
    }

    private int getHour() {
        return hour;
    }

    private int getMinute() {
        return minute;
    }

    private int getSecond() {
        return second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
