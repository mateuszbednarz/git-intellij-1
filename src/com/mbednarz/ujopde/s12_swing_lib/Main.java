package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;    // Abstract Window Toolkit

/**
 * @author mbednarz
 * @created 23/02/2020 - 18:08
 * @project git-intellij-1
 */

/* -- LESSON 58: Stworzenie ramki (JFrame) -- */
public class Main
{
    // default conctructor
    // pierwszy ze sposobów na stworzenie JFrame
    public Main()
    {
        JFrame frame = new JFrame();
        frame.setTitle("MB Investments Mgmt Center");
        frame.setSize(new Dimension(300,300));
        frame.setLocation(new Point(200, 100));
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/com/mbednarz/ujopde/s12_swing_lib/rli.png"));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
