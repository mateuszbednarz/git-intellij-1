package com.mbednarz.ujopde.s9;

public class Bootle {

    private double capacityInLiters;

    Bootle(double capacityInLiters)
    {
        this.capacityInLiters = capacityInLiters;
    }

    double getCapacityInLiters()
    {
        return capacityInLiters;
    }

    void addWater(double addedLiters)
    {
        this.capacityInLiters += addedLiters;
    }

    boolean pourWater(double pouredLiters)
    {
        if (pouredLiters < capacityInLiters)
            this.capacityInLiters -= pouredLiters;
        else
            return false;

        return true;
    }

    void fromBootleToBootle(double liters, Bootle whichBootle)
    {
        if (this.pourWater(liters))
        {
            whichBootle.addWater(liters);
        }
        else
            System.out.println("Za mało wody w butelce!");

    }

    public static void main(String[] args) {

        Bootle[] bootle = new Bootle[3];

        bootle[0] = new Bootle(5);
        bootle[1] = new Bootle(8);
        bootle[2] = new Bootle(10);

        //bootle[0].addWater(5);

        bootle[0].fromBootleToBootle(2, bootle[1]);

        System.out.println("Bootle [0] capacity: " + bootle[0].getCapacityInLiters());
        System.out.println("Bootle [1] capacity: " + bootle[1].getCapacityInLiters());
        System.out.println("Bootle [2] capacity: " + bootle[2].getCapacityInLiters());
    }

}
