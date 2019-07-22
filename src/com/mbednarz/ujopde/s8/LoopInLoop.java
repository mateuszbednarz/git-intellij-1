package com.mbednarz.ujopde.s8;

public class LoopInLoop {

    public static void main(String[] args) {

        /* Tabliczka mnożenia */


        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
