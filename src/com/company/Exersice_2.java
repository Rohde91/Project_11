package com.company;

public class Exersice_2 {

    // Den skal hedde static grundet at main er static
    static void printTile(Tile tile){
        System.out.println(tile);
    }

    public static void main(String[] args) {
        Tile tile1 = new Tile(10, 'c');

        printTile(tile1);

        Tile tile2 = new Tile(10, 'c');
        Tile tile3 = new Tile(5, 'd');

        System.out.println("tile1 equals tile2 " + tile1.equals(tile2));
        System.out.println("tile1 equals tile3 " + tile1.equals(tile3));

        char letter = tile3.getLetter();
        tile3.setLetter('w');
    }
}
