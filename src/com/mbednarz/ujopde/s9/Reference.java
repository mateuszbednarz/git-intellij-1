package com.mbednarz.ujopde.s9;

public class Reference {

    public static void main(String[] args) {

        int a = 53;
        int b = a;

        //b = 30;

        System.out.println("Value of 'a': " + a);
        System.out.println("Value of 'b': " + b);

        RefTest rtValue = new RefTest();
        /* pod 'rtValue' nie znajduje się żadna wartość 'zwykła' (typ prymitywny) , ale ADRES.
        *  Jest to tzw. zmienna referencyjna */
    }
}

class RefTest
{
    int a = 20;
}