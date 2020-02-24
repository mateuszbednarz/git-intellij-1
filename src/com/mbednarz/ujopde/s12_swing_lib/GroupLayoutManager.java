package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 24/02/2020 - 21:59
 * @project git-intellij-1
 */

/* -- LESSON 62: Manager Group Layout -- */
public class GroupLayoutManager extends JFrame
{
    public GroupLayoutManager()
    {
        this.setBounds(300, 300, 300, 300);
        initComponents();
        this.setDefaultCloseOperation(3);
    }


    public void initComponents()
    {
        GroupLayout gl = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(gl);

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(bt1).
                addGroup(gl.createParallelGroup().addComponent(bt2).addComponent(bt4)).addComponent(bt3).addContainerGap(10, Short.MAX_VALUE).addComponent(cb));
        gl.setVerticalGroup(gl.createSequentialGroup().
                addGroup(gl.createParallelGroup().addComponent(bt1).addComponent(bt2).addComponent(bt3)).addComponent(bt4).addContainerGap(10, Short.MAX_VALUE).addComponent(cb));
        pack();
    }


    JButton bt1 = new JButton("Button 1");
    JButton bt2 = new JButton("Button 2");
    JButton bt3 = new JButton("Button 3");
    JButton bt4 = new JButton("Button 4");
    JButton cb = new JButton("Cancel");


    public static void main(String[] args)
    {
        new GroupLayoutManager().setVisible(true);
    }
}
