package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pokemon pikachu = new pokemon(100,)
    }

    public static Array createPokemon(){
        Scanner sc = new Scanner(System.in);
        int health = sc.nextInt();
        int level = sc.nextInt();
        String name = sc.next();
        String position = sc.next();
        return new String[]{health, level, name, position};
    }
}
