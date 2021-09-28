package com.company;

public class MyDate {
    private int day;
    private String month;
    private int year;
        // private er kun muligt at bruge lokalt i koden.
        // public kan tilgås udenfor.
        // De er ikke definerede grundet at den får information fra Exersice_3.
        // De data/information der kommer fra Exersice_3 bliver der efter kørt igennem systemet og
        // udskrevet ved hjælp at toString der kommer nederst i denne fil.

    MyDate(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        // integers grundet at vi skal bruge talværdier uden komma
        // String grundet at vi skal bruge flere bogstaver end et (shar)
        // this. kan udskiftes, men forstod ikke hvordan
        // Dette kan ses i den kode der er lavet af Jens Peter
    }

    public String toString(){
        return "Day: " + day + " Month: " + month + " Year: " + year;
        // toString bruges for at gøre det print der kommer læsbart.
    }
}
