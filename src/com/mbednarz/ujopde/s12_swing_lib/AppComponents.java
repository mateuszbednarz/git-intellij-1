package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 23/02/2020 - 20:03
 * @project git-intellij-1
 */

/* -- LESSON 60: Managery układów, komponenty, przyciski -- */
public class AppComponents extends JFrame
{
    public AppComponents()
    {
        super("Window Layout");
        this.setBounds(300, 200, 400, 400);
        initComponents();
        this.setDefaultCloseOperation(3);
        this.pack();
    }

    public void initComponents()
    {
        centerButton = new JButton("Center Button!");
        topButton = new JButton("Top Button!");
        bottomButton = new JButton("Bottom Button!");
        rightButton = new JButton("Right Button!");
        leftButton = new JButton("Left Button!");

        Container c = this.getContentPane();
        c.add(centerButton, BorderLayout.CENTER);
        c.add(topButton, BorderLayout.PAGE_START);
        c.add(bottomButton, BorderLayout.PAGE_END);
        c.add(rightButton, BorderLayout.LINE_END);
        c.add(leftButton, BorderLayout.LINE_START);
    }

    JButton centerButton;
    JButton topButton;
    JButton bottomButton;
    JButton rightButton;
    JButton leftButton;

    public static void main(String[] args)
    {
        new AppComponents().setVisible(true);
    }
}
