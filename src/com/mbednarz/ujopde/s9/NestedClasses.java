package com.mbednarz.ujopde.s9;


/* -- LESSON 50: Klasy zagnieżdżone -- */
public class NestedClasses
{
    public static void main(String[] args)
    {
        A externalObj = new A();
        A.B tmpObj = externalObj.new B();
        A.C tmpSecObj = new A.C();
    }
}

class A
{
    A()
    {
        System.out.println("I'm from EXTERNAL class 'A'!");
    }

    class B
    {
        B()
        {
            System.out.println("I'm from NESTED class 'B'!");
        }

        void myMeth()
        {
            testValue = 60;
        }

        private int tmpValue;
    }

    static class C
    {
        C()
        {
            System.out.println("I'm from NESTED class 'C'!");
        }
    }

    void mySecMethod()
    {
        B obj = new B();
    }

    private int testValue;
}
