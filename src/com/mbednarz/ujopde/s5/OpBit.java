package com.mbednarz.ujopde.s5;

public class OpBit {

    public static void main(String[] args) {

        /*
            0 - FALSE
            1 - TRUE

            OPERATORY BITOWE:
            &  :  iloczyn bitowy
            |  :  suma bitowa
            ^  :  XOR (exclusive OR)
            ~  :  negacja bitowa
            x << 1  :  przesunięcie w lewo o 1
            x >> 2  :  przesunięcie w prawo o 2

            126 = 1*10^2 + 2*10^1 + 6*10^0
            1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 2 = 10

            1110 = 14
            1011 = 11
            ---------- ILOCZYN BITOWY (SUMA)
            1010 = 10


            0001 - upr. do pisania posta na forum
            0010 - upr. do edycji posta na forum
            0100 - upr. do usuwania postów na forum
            1000 - upr. do banowania userów na forum

            1111 = 15
         */
        System.out.println("Iloczyn bitowy: ");
        System.out.println(14 & 11);

    }

}
