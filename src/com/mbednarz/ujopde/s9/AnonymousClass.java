package com.mbednarz.ujopde.s9;

/**
 * @author mbednarz
 * @created 19/02/2020 - 14:27
 * @project git-intellij-1
 */

/* -- LESSON 52: Klasy anonimowe -- */
public class AnonymousClass
{
    public static void main(String[] args)
    {
        AfterClickEvent ace = () -> System.out.println("Anonymous class EVENT!");
    }
}

interface AfterClickEvent
{
    void action();
}

class FirstButton implements AfterClickEvent
{
    @Override
    public void action()
    {
        System.out.println("FIRST button click event!");
    }
}

class SecondButton implements AfterClickEvent
{
    @Override
    public void action()
    {
        System.out.println("SECOND button click event!");
    }
}


