package org.example;

public class Display {
    static void welcome() {
        System.out.println("Welcome to the Pokedex");
        System.out.println("Please select a menu option:");
        System.out.println("1: Show Pokemon");
        System.out.println("2: Exit");
    }

    public static boolean endGame() {
        System.out.println("Game Over");
        return false;
    }
}
