package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Display {
    static void welcome() {
        System.out.println("Welcome to the Pokedex");
    }
    static void menu() {
        System.out.println("Please select a menu option:");
        System.out.println("1: Show Pokemon");
        System.out.println("2: Exit");
    }
    public static boolean endGame() {
        System.out.println("Game Over");
        return false;
    }
    public static String showPoke() throws FileNotFoundException {
        FileReader file = new FileReader("src/main/resources/pokemon.csv");

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
        return null;
    }
}
