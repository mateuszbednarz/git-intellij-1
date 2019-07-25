package com.mbednarz.ujopde.s8;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            if (i % 2 == 0)
                continue; // przerwij iterację od tego momentu i nie wykonuj już żadnych instrukcji po mnie

            System.out.println(i);
        }

    }

}
