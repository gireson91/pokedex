package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Display {
    static void welcome() {
        System.out.println("Welcome to the Pokedex");

    }
    static boolean menu() throws FileNotFoundException {
        System.out.println("Please select a menu option:");
        System.out.println("1: Show Pokemon");
        System.out.println("2: Exit");
        Scanner myObj = new Scanner(System.in);
        String playOn = myObj.nextLine();
        if (playOn.equalsIgnoreCase("1")){
            int pokeNum = Display.selectPoke();
            Display.showPoke(pokeNum-1);
        }
        else if (playOn.equalsIgnoreCase("2")){
            return Display.endGame();
        }
        return true;
    }
    public static boolean endGame() {
        System.out.println("Game Over");
        return false;
    }
    public static String showPoke(int pokeNum) throws FileNotFoundException {
        FileReader file = new FileReader("src/main/resources/pokemon.csv");

        List<Pokemon> beans = new CsvToBeanBuilder<Pokemon>(file)
                .withType(Pokemon.class)
                .build()
                .parse();

            System.out.println(
                    "\n" + "ID: #" + beans.get(pokeNum).getId() + "\n" +
                            "Name: " + beans.get(pokeNum).getName() + "\n" +
                            "Type 1: " + beans.get(pokeNum).getType1() + "\n" +
                            "Type 2: " + beans.get(pokeNum).getType2() + "\n" +
                            "HP: " + beans.get(pokeNum).getHp() + "\n" +
                            "Attack: " + beans.get(pokeNum).getAttack() + "\n" +
                            "Defense: " + beans.get(pokeNum).getDefense() + "\n" +
                            "Attack Speed: " + beans.get(pokeNum).getSpAttack() + "\n" +
                            "Defense Speed: " + beans.get(pokeNum).getSpDefense() + "\n" +
                            "Speed: " + beans.get(pokeNum).getSpeed() + "\n");

        return null;
    }
    public static int selectPoke() {
        System.out.println("Which number Pokemon do you want to view?");
        Scanner myObj = new Scanner(System.in);
        if (myObj.hasNextInt()) {
            int pokeNum = Integer.parseInt(myObj.nextLine());
            if (pokeNum > 0 && pokeNum < 152) {
                return pokeNum;
            } else {
                System.out.println("Please enter a valid number between 1 and 151...");
                return selectPoke();
            }
        } else {
            System.out.println("Please enter a valid number between 1 and 151...");
            return selectPoke();
        }
    }
    }
