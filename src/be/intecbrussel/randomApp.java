package be.intecbrussel;

import java.util.*;


public class randomApp {
    public static void main(String[] args) {

        Random rng = new Random();
        int random1 = rng.nextInt();
        int random2 = rng.nextInt(10);
        int random3 = rng.nextInt(5) + 5; // (betekent van 5 tot en met 9)
        int random4 = rng.nextInt(10) - 5;// (betekent van 9 tot en met 4)

        int random5 = rng.nextInt(45);
        int random6 = rng.nextInt(45);
        int random7 = rng.nextInt(45);
        int random8 = rng.nextInt(45);
        int random9 = rng.nextInt(45);
        int random10 = rng.nextInt(45);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
        System.out.println(random5);
        System.out.println(random6);
        System.out.println(random7);
        System.out.println(random8);
        System.out.println(random9);
        System.out.println(random10);


    }
}