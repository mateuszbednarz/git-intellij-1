package com.mbednarz.ujopde.s7;

public class TabWieloWym {

    public static void main(String[] args) {

        /*
            --------------------------------
              [0][0]  |  [0][1]  |  [0][2]
            --------------------------------
              [1][0]  |  [1][1]  |  [1][2]
            --------------------------------
              [2][0]  |  [2][1]  |  [2][2]
            --------------------------------
              [3][0]  |  [3][1]  |  [3][2]
            --------------------------------
         */

        int[][] tab = new int[4][3];   // int[ilość wierszy][ilość kolumn]
        tab[0][0] = 25;

        System.out.println(tab[0][0]);

    }
}
