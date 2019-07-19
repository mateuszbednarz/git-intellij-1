package com.mbednarz.ujopde.s6;

public class WyrWar {

    public static void main(String[] args) {

        /*
          WYRAŻENIE ? CO MA SIĘ STAC JEŻELI 'TRUE' : CO MA SIE STAC JEŻELI 'FALSE'
            x % 2 == 0 ? "Parzysta" : "Nieparzysta"
         */

        int x = 4;

        //if (x % 2 == 0)
        //    System.out.println("Parzysta");
        //else
        //    System.out.println("Nieparzysta");

        String czyParzysta = x % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(czyParzysta);
    }
}
