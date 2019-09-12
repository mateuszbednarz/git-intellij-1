package com.mbednarz.ujopde.s9;

public class StatMethodsAndFields {

    public static void main(String[] args) {

        //Math m = new Math();
        double sum = Math.sumCalc(15.9, 14.4);
        System.out.println("Sum = " + sum);
        System.out.println("PI digit value = " + Math.PI);
        System.out.println();

        Client firstCl = new Client("Brian Jones");
        Client secondCl = new Client("Alan Parish");
        Client thirdCl = new Client("Micheal Knight");

        System.out.println(firstCl.clientID + ": " + firstCl.name);
        System.out.println(secondCl.clientID + ": " + secondCl.name);
        System.out.println(thirdCl.clientID + ": " + thirdCl.name);
        System.out.println(Client.nextID + ": ");
    }
}

class Math
{
    static final double PI = 3.14;
    static double sumCalc(double a, double b)
    {
        return a + b;
    }
}

class Client {

    Client(String name)
    {
        this.name = name;
        clientID = nextID;
        nextID++;
    }

    String name;
    int clientID = 0;
    static int nextID = 1;
}


