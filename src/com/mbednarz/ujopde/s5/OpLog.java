package com.mbednarz.ujopde.s5;

public class OpLog {

    public static void main(String[] args) {

        /*
            OPERATORY LOGICZNE to wartości TRUE lub FALSE

            !  :  negacja

            !(true)  :  zmienia wartość na FALSE
            !(false) :  zmienia wartość na TRUE

            &&  : koniunkcja, inaczej warunek "i", cała KONIUNKCJA jest PRAWDZIWA, gdy OBA wyrażenia są PRAWDZIWE

                  TRUE && TRUE == TRUE
                  TRUE && FALSE == FALSE
                  FALSE && TRUE == FALSE
                  FALSE && FALSE == FALSE

            ||  : alternatywa, inaczej warunek "lub", cała ALTERNATYWA jest FAŁSZYWA, gdy oba wyrażenia są FAŁSZYWE

                  TRUE || TRUE == TRUE
                  TRUE || FALSE == TRUE
                  FALSE || TRUE == TRUE
                  FALSE || FALSE == FALSE
         */

        int a = 5,
            b = 5,
            c = 7;

        System.out.println(a == b || c > 12);

        if (a != b || c > 12) {
            System.out.println("TAK");
        }

    }

}