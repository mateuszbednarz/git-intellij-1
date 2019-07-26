package com.mbednarz.ujopde.s9;

public class Constructors {

    public static void main(String[] args) {

        Point p1 = new Point(10, 15);
        Point p2 = new Point(20, 25);

        System.out.println("p1.x = " + p1.x);
        System.out.println("p1.y = " + p1.y);

        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);
    }
}

class Point
{
    Point()
    {
        System.out.println("Wywołano konstruktor domyślny!");
        x = 20;
        y = 20;
    }

    Point(int first, int second)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami!");

        x = first;
        y = second;
    }

    int x;
    int y;
}
