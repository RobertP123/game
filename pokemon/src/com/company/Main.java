package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final File theFile = new File("pokemons.txt");

    public static void main(String[] args) {
        WriteToFile(createPokemon());
    }

    public static pokemon createPokemon(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String name = sc.next();
        int health = sc.nextInt();
        int level = sc.nextInt();
        String type = sc.next();
        pokemon newpokemon = new pokemon(number, name, health, level, type);
        return newpokemon;
    }
    public static void WriteToFile(pokemon info) {
        try {
            FileWriter myWriter = new FileWriter(theFile.getName(), true);
            System.out.println("appending book info to file");
            myWriter.write(info.toString() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static void search() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the number of pokemon");
        String name = sc.next();
        Scanner scanner;
        try {
            scanner = new Scanner(theFile).useDelimiter( "]");

            while (scanner.hasNext()) {
                final String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(name)) {
                    System.out.println("I found " + name);
                    System.out.println(lineFromFile);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(" cannot write to file " + theFile);
        }
    }
}
