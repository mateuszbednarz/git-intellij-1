package com.mbednarz.ujopde.s9.inh.monsters;

public class Skeleton extends Monster
{
    String weaponType;

    // DEFAULT CONSTRUCTOR:
    public Skeleton()
    {
        System.out.println("C: This is a DEFAULT CONSTRUCTOR from 'Skeleton' class!");
    }

    // NON-DEFAULT CONSTRUCTORS:
    public Skeleton(double runSpeed, double liveTime)
    {
        super(runSpeed, liveTime);
        System.out.println("C: This is a NON-DEFAULT CONSTRUCTOR from 'Skeleton' class with TWO ARGUMENTS!");
    }

    public Skeleton(double runSpeed, double liveTime, String weaponType)
    {
        super(runSpeed, liveTime);
        this.weaponType = weaponType;
        System.out.println("C: This is a NON-DEFAULT CONSTRUCTOR from 'Skeleton' class with THREE ARGUMENTS!");
        System.out.println("Skeleton params: run speed = " + runSpeed + ", live time: " + liveTime + ", weapon: " + weaponType);
    }

    @Override
    public void attack()
    {
        super.attack();
        System.out.println("This is an SPECIFIED attack method for Skeleton!");
    }

    @Override
    protected void monsterDescription()
    {

    }
}
