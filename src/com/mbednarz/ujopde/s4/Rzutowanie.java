package com.mbednarz.ujopde.s4;

public class Rzutowanie {

    public static void main(String[] args) {

        int a = 5, b = 2;
        double c = 12, d = 15;

        System.out.println((double) a / b);

        int result1 = a / (int)d;
        double result2 = a / d;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(1.0 / 5);

    }
}
