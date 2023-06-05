package org.example;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("src/main/resources/pokemon.csv");
//        boolean gameOn = true;
//
//        while (gameOn) {
//            Display.welcome();
//            Scanner myObj = new Scanner(System.in);
//            String playOn = myObj.nextLine();
//            if (playOn.equalsIgnoreCase("no")){
//                gameOn = Display.endGame();
//            }
//        }
        List<Pokemon> beans = new CsvToBeanBuilder<Pokemon>(file)
                .withType(Pokemon.class)
                .build()
                .parse();

        for (Pokemon p : beans) {
            System.out.println(
                     "\n" +"Name: " + p.getName() + "\n" +
                            "Type 1: " + p.getType1() + "\n" +
                            "Type 2: " + p.getType2() + "\n" +
                            "HP: " + p.getHp() + "\n" +
                            "Attack: " + p.getAttack() + "\n" +
                            "Defense: " + p.getDefense() + "\n" +
                            "Attack Speed: " + p.getSpAttack() + "\n" +
                            "Defense Speed: " + p.getSpDefense() + "\n" +
                            "Speed: " + p.getSpeed());
        }
    }
}