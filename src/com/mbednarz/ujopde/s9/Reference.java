package com.mbednarz.ujopde.s9;

public class Reference {

    public static void main(String[] args) {

        //int a = 53;
        //int b = a;

        //b = 30;

        //System.out.println("Value of 'a': " + a);
        //System.out.println("Value of 'b': " + b);

        //RefTest rtValueOne = new RefTest();
        /* pod 'rtValueOne' nie znajduje się żadna wartość 'zwykła' (typ prymitywny) , ale ADRES.
        *  Jest to tzw. zmienna referencyjna */

        //RefTest rtValueTwo = rtValueOne;
        //rtValueTwo.a = 40;

        //System.out.println(rtValueOne.a);

        int a = 5;

        RefTest xr = new RefTest();
        a = xr.changeValue(a);
        System.out.println("Value of 'a': " + a);

        Foo f = new Foo();

        xr.changeContent(f);
        System.out.println(f.y);

    }
}

class RefTest
{
    //int a = 20;
    int changeValue(int value)
    {
        value += 2;
        return value;
    }

    void changeContent(Foo fv)
    {
        fv.y += 40;
    }
}

class Foo
{
    int y = 20;
}