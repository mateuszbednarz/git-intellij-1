package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 24/02/2020 - 20:18
 * @project git-intellij-1
 */

/* -- LESSON 61: Panele & manager Flow Layout -- */
public class PanelsAndFlowMgmt extends JFrame
{
    public PanelsAndFlowMgmt()
    {
        this.setBounds(300, 300, 300, 300);
        initComponents();
        this.setDefaultCloseOperation(3);
    }

    public void initComponents()
    {
        bt1.setPreferredSize(new Dimension(100, 100));
        bt2.setPreferredSize(bt2.getPreferredSize());

        pn1.add(bt1);
        pn1.add(bt2);
        pn1.add(bt3);
        pn1.add(bt4);

        this.getContentPane().add(pn1, BorderLayout.CENTER);
    }

    JPanel pn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JButton bt1 = new JButton("Button 1");
    JButton bt2 = new JButton("Button 2");
    JButton bt3 = new JButton("Button 3");
    JButton bt4 = new JButton("Button 4");


    public static void main(String[] args)
    {
        new PanelsAndFlowMgmt().setVisible(true);
    }
}
