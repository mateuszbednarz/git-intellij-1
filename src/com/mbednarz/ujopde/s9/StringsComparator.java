package com.mbednarz.ujopde.s9;

public class StringsComparator {

    public static void main(String[] args) {

        String name1 = new String ("Mateusz");
        String name2 = new String("MateuszB");

        if (name1.equals(name2))
            System.out.println("Strings (names) are EQUAL!");
        else
            System.out.println("Strings (names) are NOT EQUAL!");

    }

}
