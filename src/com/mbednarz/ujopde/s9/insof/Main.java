package com.mbednarz.ujopde.s9.insof;

public class Main
{
    public static void main(String[] args)
    {
        Person[] p = new Person[4];
        p[0] = new Employee("Kamil", "Strzelczyk", 50000);
        p[1] = new Student("Jacek", "Krzaczkowski", 3000);

        for (Person person : p)
        {
            if(person instanceof Person)
                person.getDescription();
            else
                break;
        }
    }
}

abstract class Person
{
    String firstname;
    String surname;

    // NON-DEFAULT CONSTRUCTORS:
    Person(String firstname, String surname)
    {
        this.firstname = firstname;
        this.surname = surname;
    }

    // METHODS
    abstract void getDescription();

}

class Employee extends Person
{
    double salary;

    // NON-DEFAULT CONSTRUCTORS:
    Employee(String firstname, String surname, double salary)
    {
        super(firstname, surname);
        this.salary = salary;
    }

    void work()
    {
        System.out.println("I'm working hard everyday in UE Commission");
    }

    @Override
    void getDescription()
    {
        System.out.println("EMPLOYEE (European Comission): " + firstname + " " + surname + ", salary per month: " + salary + " EUR.");
    }
}

class Student extends Person
{
    double scholarship;

    // NON-DEFAULT CONSTRUCTORS:
    Student(String firstname, String surname, double scholarship)
    {
        super(firstname, surname);
        this.scholarship = scholarship;
    }

    @Override
    void getDescription()
    {
        System.out.println("STUDENT (Harvard): " + firstname + " " + surname + ", scholarship per month: " + scholarship + " USD.");
    }
}

