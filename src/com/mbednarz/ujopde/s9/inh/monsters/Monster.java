package com.mbednarz.ujopde.s9.inh.monsters;

public abstract class Monster
{
    /*
    EXAMPLE: zombies, skeletons in general are MONSTERS, so:

    MONSTER - it will be the [BASE] or [PARENT] or [SUPER] class,
    ZOMBIE, MONSTER - it will be the [SUB] or [CHILD] or [INHERITING] class,
    */

    public double runSpeed;
    protected double liveTime;

    // DEFAULT CONSTRUCTOR:
    public Monster()
    {
        System.out.println("C: This is a DEFAULT CONSTRUCTOR from 'Monster' class!");
    }

    // NON-DEFAULT CONSTRUCTORS:
    public Monster(double runSpeed, double liveTime)
    {
        this.runSpeed = runSpeed;
        this.liveTime = liveTime;
        System.out.println("C: This is a NON-DEFAULT CONSTRUCTOR from 'Monster' class!");
    }

    protected void attack()
    {
        // default attack parameters
        System.out.println("M: This is an BASE 'attack()' methods from a 'Monster' class!");
    }

    protected abstract void monsterDescription();
}
