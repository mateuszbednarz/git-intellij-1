package com.mbednarz.ujopde.s4;

public class Zmienne {

    public static void main(String[] args) {

        String imie = "Mateusz";
        String nazwisko = "Bednarz";

        int a = 10;
        int b = 6;
        int c;
        long d = 283139932949L;
        long e;

        String personalData = imie + " " + nazwisko;

        /*
            Typy całkowite:
            byte - 8 bitów - zakres od: -128 od 127
            short - 16 bitów - zakres od: -32.768 do 32.767
            int - 32 bity - zakres od: -2^31 do 2^31-1
            long - 64 bity - zakres od: -2^63 do 2^63-1

            Typy znakowe:
            char - 2 bajty (tylko jeden znak!)
            String - ciąg znaków

            Typy zmiennoprzecinkowe:
            float - 32 bity - zakres od: 1.4*10^(-45) do 3.4*10^138
            double - 64 bity - polecany do użytku - zakres od: 4.9*10^(-324) do 1.8*10^308
         */

        char znak = 'A';

        c = a + b;
        e = b + d;

        float liczba = 4.67f;
        double money = 56.939323;

        System.out.println(c);
        System.out.println(e);
        System.out.println(znak);
        System.out.println(liczba);
        System.out.println(money);
        System.out.println(personalData);
    }
}
