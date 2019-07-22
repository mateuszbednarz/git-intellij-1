package com.mbednarz.ujopde.s8;

public class DoWhileLoop {

    public static void main(String[] args) {

        String[] devCourses =
        {
            "Java For Beginners",
            "Java Applications",
            "Java Pipes",
            "Java 8 Advanced",
            "C# For Beginners",
            "C# Web Applications",
            "C# Pipes",
            "FrontEnd For Dummies"
        };

        int i = 0;
        while (i < devCourses.length) {
            System.out.println(i + ": " + devCourses[i]);

            i++;
        }

        //do {
        //    System.out.println(i + ": " + devCourses[i]);
        //    i++;
        //} while (i < devCourses.length);
    }
}
