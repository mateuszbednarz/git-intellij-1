package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */

public class BaseAppLayout extends JFrame
{
    public BaseAppLayout()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Base App Layout");
        this.setBounds(300, 200, 400, 400);
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args)
    {
        new BaseAppLayout().setVisible(true);
    }
}
