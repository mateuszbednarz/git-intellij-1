package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 23/02/2020 - 19:28
 * @project git-intellij-1
 */

/* -- LESSON 58: Stworzenie ramki (JFrame) -- */
public class MBFrame extends JFrame
{
    public MBFrame()
    {
        this.setBounds(100, 100, 300, 300);
        this.setTitle("MB Inv Mgmt Panel");
        this.pack();
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args)
    {
        new MBFrame().setVisible(true);
    }
}
