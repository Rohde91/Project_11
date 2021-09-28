package com.company;

public class MyDate {
    private int day;
    private String month;
    private int year;

    MyDate(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return "Day: " + day + " Month: " + month + " Year: " + year;
    }

}
