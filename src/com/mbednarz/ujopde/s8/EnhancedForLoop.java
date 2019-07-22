package com.mbednarz.ujopde.s8;

public class EnhancedForLoop {

    public static void main(String[] args) {

        String[] devCourses =
        {
            "Java Basics",
            "Java Desktop Apps",
            "Java Web Apps",
            "Python Basics",
            "Python Desktop Apps",
            "Python Web Apps",
            "Auto IT Course"
        };

        for(String cNames: devCourses) {
            System.out.println(cNames);
        }

    }
}
