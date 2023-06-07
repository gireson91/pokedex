package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        boolean gameOn = true;
        Display.welcome();

        while (gameOn) {
            gameOn = Display.menu();

        }

    }
}