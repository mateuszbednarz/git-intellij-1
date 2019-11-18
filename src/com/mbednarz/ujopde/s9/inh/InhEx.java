package com.mbednarz.ujopde.s9.inh;

import com.mbednarz.ujopde.s9.inh.monsters.Monster;
import com.mbednarz.ujopde.s9.inh.monsters.Skeleton;
import com.mbednarz.ujopde.s9.inh.monsters.Zombie;

public class InhEx
{
    public static void main(String[] args)
    {
        Monster m = new Zombie();
        System.out.println("Monster run speed: " + m.runSpeed);

        Skeleton sk = new Skeleton(20, 50, "Arch");
        sk.attack();

        Zombie z = new Zombie();

        Skeleton skl = new Skeleton(30, 400);
        skl.attack();

        Monster mon = new Skeleton(25, 300, "Machete");
    }
}
