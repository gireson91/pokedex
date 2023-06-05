package org.example;

public class Display {
    static void welcome() {
        System.out.println("Welcome to the Pokedex");
        System.out.println("Would you like to play on? Yes or No");
    }

    public static boolean endGame() {
        System.out.println("Game Over");
        return false;
    }
}
