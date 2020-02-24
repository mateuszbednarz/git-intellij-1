package com.mbednarz.ujopde.s9;

/**
 * @author mbednarz
 * @created 22/02/2020 - 15:09
 * @project git-intellij-1
 */

/* -- LESSON 56: Domyślne metody interfejsów -- */
public class InterfaceDefaultMethod
{
    public static void main(String[] args)
    {
        Calculator c = a -> 0;
    }
}

interface Calculator
{
    // abstract, 'normal' method
    double calculate(int a);

    // default interface method
    default double sqrt(int a)
    {
        return java.lang.Math.sqrt(a);
    };
}

class MyCalc implements Calculator
{
    @Override
    public double calculate(int a)
    {
        return this.sqrt(a * 5);
    }
}
