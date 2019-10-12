package com.mbednarz.ujopde.s9;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BootleEx {

    private double bootleCapacity;
    private double actualBootleState;

    static NumberFormat nf = new DecimalFormat("#0.00");

    double getActualBootleState()
    {
        return actualBootleState;
    }

    double getBootleCapacity()
    {
        return bootleCapacity;
    }

    private void setBootleCapacity(double bootleCapacity)
    {
        this.bootleCapacity = bootleCapacity;
    }

    void addWater(double addedWater)
    {
        if (addedWater > this.bootleCapacity)
            System.out.println("You can't add more water, capacity was exceeded!");
        else
            this.actualBootleState += addedWater;
    }

    void pourWater(double pouredWater)
    {
        if (this.actualBootleState < pouredWater)
            System.out.println("You can't pour more water you have in bootle!");
        else
            this.actualBootleState -= pouredWater;
    }

    void fromBootleToBootle(double liters, BootleEx whichBootle)
    {
        this.pourWater(liters);
        whichBootle.addWater(liters);
    }


    public static void main(String[] args) {

        BootleEx[] bootle = new BootleEx[50];

        for (int i = 0; i < bootle.length; i++) {
            bootle[i] = new BootleEx();
            //System.out.println("Bootle in table ID : " + (i + 1) + " and address in memory: " + bootle[i]);
        }
        System.out.println("All 'created' bootles count: " + bootle.length);
        System.out.println("-----------------------------------");
        bootle[0].setBootleCapacity(15);
        System.out.println("FIRST bootle capacity: " + bootle[0].getBootleCapacity() + " liters.");
        bootle[1].setBootleCapacity(20);
        System.out.println("SECOND bootle capacity: " + bootle[1].getBootleCapacity() + " liters.");
        bootle[2].setBootleCapacity(25);
        System.out.println("THIRD bootle capacity: " + bootle[2].getBootleCapacity() + " liters.");
        System.out.println("-----------------------------------");

        System.out.println("ADDING water to the THIRD bootle TEST:");
        bootle[2].addWater(22.6);
        System.out.println("After ADDING we have " + bootle[2].getActualBootleState() + "L in THIRD bootle | now " + nf.format(bootle[2].getBootleCapacity() - bootle[2].getActualBootleState()) + "L left!");

        System.out.println("-----------------------------------");
        System.out.println("POURING water from the THIRD bootle TEST:");
        bootle[2].pourWater(1.2);
        System.out.println("State of THIRD bootle after ADDING & then POURING: " + nf.format(bootle[2].getActualBootleState()) + "L");
        System.out.println("-----------------------------------");

        System.out.println("Moving water from BOOTLE 3 (25L cap) to BOOTLE 2 (20L cap) - TEST:");
        bootle[2].fromBootleToBootle(23, bootle[1]);
        System.out.println("State of SECOND bootle after moving water: " + bootle[1].getActualBootleState() + "L");
        System.out.println("State of THIRD bootle after moving water: " + nf.format(bootle[2].getActualBootleState()) + "L");

    }
}
