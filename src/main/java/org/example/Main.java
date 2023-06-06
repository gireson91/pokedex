package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        boolean gameOn = true;
        Display.welcome();

        while (gameOn) {
            Display.menu();
            Scanner myObj = new Scanner(System.in);
            String playOn = myObj.nextLine();
            if (playOn.equalsIgnoreCase("1")){
                Display.showPoke();
            }
            else if (playOn.equalsIgnoreCase("2")){
                gameOn = Display.endGame();
            }
        }

    }
}