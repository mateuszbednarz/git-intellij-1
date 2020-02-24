package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 23/02/2020 - 19:50
 * @project git-intellij-1
 */

/* -- LESSON 59: Centrowanie ramki -- */
public class WindowCentering extends JFrame
{
    public WindowCentering()
    {
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setTitle("MB Inv Mgmt Center");
        this.setDefaultCloseOperation(3);
        this.setSize(screenWidth/2, screenHeight/2);

        System.out.println("Screen size: " + screenWidth + " x " + screenHeight);
    }

    public static void main(String[] args)
    {
        new WindowCentering().setVisible(true);
    }
}
