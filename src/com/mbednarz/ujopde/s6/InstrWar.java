package com.mbednarz.ujopde.s6;

public class InstrWar {

    public static void main(String[] args) {

    /*
        TRUE lub FALSE
        INSTRUKCJE WARUNKOWE:

        if (WYRAŻENIE)
            instrukcja;
        else
            instrukcja;
     */

        int a = 2,
            b = 5;

        if (a > b)
            System.out.println("a > b");

        else if (a < b) {
            System.out.println("a < b");
            System.out.println("Tak do właśnie działa!");
        }

        else
            System.out.println("a == b");

        // if (a != b && c > 5)
            // System.out.println("TEST PRAWDY");

    }

}
