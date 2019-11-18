package com.mbednarz.ujopde.s9;

import java.util.Arrays;

public class IntfsExercise
{
    public static void main(String[] args)
    {
        FirstInterface iemp = new IntfsEmployee();

        System.out.println("Wartość liczby PI: " + FirstInterface.PI);

        int[] tab = new int[5];

        tab[0] = 2;
        tab[1] = 10;
        tab[2] = -40;
        tab[3] = -5;
        tab[4] = 23;

        Arrays.sort(tab);

        System.out.println("First element value after sorting: " + tab[0]);
    }
}

interface FirstInterface
{
    // ZMIENNA w interfejsie od razu ma właściwości: PUBLIC, STATIC oraz FINAL!
    double PI = 3.14;

    // METODA w interfejsie jest od razu: PUBLIC oraz ABSTRACT
    void defaultMethod();
}

class IntfsEmployee implements FirstInterface
{
    private double empSalary;

    // METHODS
    public double getEmpSalary()
    {
        return this.empSalary;
    }

    @Override
    public void defaultMethod()
    {

    }
}