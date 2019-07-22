package com.mbednarz.ujopde.s8;

public class ForLoop {

    public static void main(String[] args) {

        String[] devCourses =
        {
            "Java Basics",
            "Java Desktop Apps",
            "Java Web Apps",
            "Python Basics",
            "Python Desktop Apps",
            "Python Web Apps"
        };
        // (inicjalizacja zmiennych; warunek pętli; co ma się stać po wykonaniu wszystkich instrukcji w pętli)
        for (int i = 0; i < devCourses.length; i++) {
            System.out.println(i + ": " + devCourses[i]);
        }
    }
}
