package com.mbednarz.ujopde.s9;

/**
 * @author mbednarz
 * @created 19/02/2020 - 16:02
 * @project git-intellij-1
 */

/* -- LESSON 53: Agregacja i kompozycja -- */
public class Aggregation
{
    public static void main(String[] args)
    {
        EmployeeProfile ep = new EmployeeProfile("Pamela", "Anderson",
                             new EmployeeAddress("Palm Beach", 340, 20, "60634", "Miami"));

        System.out.println(ep);
    }
}

class EmployeeProfile
{
    String firstname;
    String surname;
    EmployeeAddress empAddress;

    public EmployeeProfile(String firstname, String surname, EmployeeAddress empAddress)
    {
        this.firstname = firstname;
        this.surname = surname;
        this.empAddress = empAddress;
    }

    @Override
    public String toString()
    {
        return this.firstname + " " + this.surname + ", " + empAddress.street;
    }
}

class EmployeeAddress
{
    String street;
    int buildingNo;
    int flatNo;
    String postalCode;
    String city;

    public EmployeeAddress(String street, int buildingNo, int flatNo, String postalCode, String city)
    {
        this.street = street;
        this.buildingNo = buildingNo;
        this.flatNo = flatNo;
        this.postalCode = postalCode;
        this.city = city;
    }
}
