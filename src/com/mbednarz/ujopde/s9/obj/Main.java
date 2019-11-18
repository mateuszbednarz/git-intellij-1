package com.mbednarz.ujopde.s9.obj;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Object o = new Point(5,60);
        Point p1 = new Point(5,10); // address in memory
        Point p2 = new Point(5,10); // address in memory

        System.out.println("Class name for 'p1': " + p1.getClass());
        System.out.println("Class name for 'p2': " + p2.getClass());

        if (p1.equals(p2))
            System.out.println("Objects are EQUAL!");
        else
            System.out.println("Objects are NOT EQUAL!");
        */

        Object[] points = new Point[4];

        points[0] = new Point(2,8);
        points[1] = new Point(3,8);
        points[2] = new Point(4,8);
        points[3] = new Point(2,31);

        for (int i = 0; i < points.length; i++)
        {
            System.out.println(points[i]);
        }
    }
}

class Point
{
    private int x;
    private int y;

    // DEFAULT CONSTRUCTOR
    Point() {}

    // NON-DEFAULT CONSTRUCTORS
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int getX()
    {
        return x;
    }

    int getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object o)
    {
        Point ourPoint = (Point) o;

        if (this == o)
            return true;

        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;

        return this.x == ourPoint.x && this.y == ourPoint.y;
    }

    @Override
    public String toString()
    {
        return "Points coordinates: X = " + getX() + ", Y = " + getY();
    }
}