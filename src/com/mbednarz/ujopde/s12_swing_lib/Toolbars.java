package com.mbednarz.ujopde.s12_swing_lib;

/* -- LESSON 80: Paski narzędzi i kursory -- */

import javax.swing.*;

public class Toolbars extends JFrame
{
    public Toolbars()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Toolbars");
        this.setBounds(300,300,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Toolbars().setVisible(true);
    }
}
