package com.mbednarz.ujopde.s9;

public class Methods {

    public static void main(String[] args) {

    Test tci = new Test();
    Test tci2 = new Test();

    tci.printText("Jessica","Baszczyn");
    tci2.printText("Brian", "Dobrovolsky");

    double result = tci.sumCalc(11.2,22.2);
    System.out.println("Suma: " + result);

    double divisionResult = tci.division(12.6, 3.15);
    System.out.println("Wynik dzielenia: " + divisionResult);
    }
}

class Test
{
    void printText(String name, String surname)
    {
        System.out.println("Firstname: " + name);
        System.out.println("Surname: " + surname);
        System.out.println();
    }

    int sumCalc(int a, int b)
    {
        return a + b;
    }

    double sumCalc(double a, double b)
    {
        return a + b;
    }

    double division(double a, double b)
    {
        if (b == 0)
            return 0;

        return a/b;
    }
}