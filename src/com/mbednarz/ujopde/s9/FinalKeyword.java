package com.mbednarz.ujopde.s9;

import java.util.Date;

public class FinalKeyword
{
    public static void main(String[] args)
    {
        final double PI = 3.14;

        Employee e = new Employee();

        System.out.println("Employment date: " + e.employmentDate);
    }
}

/* jeżeli klasa ma modyfikator FINAL, to NIE MOŻNA po niej dziedziczyć!
    Modyfikator FINAL ma spore znaczenie w kontekście SECURITY!
 */
abstract class Person {}

class Employee extends Person
{
    final Date employmentDate;

    // DEFAULT CONSTRUCTOR
    Employee()
    {
        this.employmentDate = new Date();
    }

    // NON-DEFAULT CONSTRUCTORS
    Employee(Date empDate)
    {
        this.employmentDate = empDate;
    }

    // METHODS
    Date getEmploymentDate()
    {
        return this.employmentDate;
    }
}

class Developer extends Employee {}
