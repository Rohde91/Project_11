package com.company;

public class Exersice_3 {

    public static void main(String[] args) {
        MyDate MyDate1 = new MyDate(12,"january",2211);
        // Værdierne indsættes i day/month/year som står som private i filen MyDate.
        System.out.println(MyDate1);

        MyDate Birthday = new MyDate(8,"august",1991);
        // Værdierne indsættes i day/month/year som står som private i filen MyDate.
        // Denne gang i sammenhæng med at lave det om til ens fødselsdag.
        System.out.println(Birthday);

        // Som man nu kan se, så skriver den begge prints ud, som forskellige.
    }
}
