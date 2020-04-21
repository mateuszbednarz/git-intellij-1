package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */
/* -- LESSON 73: Aplikacja z wieloma ramkami -- */
public class MultiframeAppExternalModule extends JFrame
{
    public MultiframeAppExternalModule(JFrame parent)
    {
        initComponents();

        int width = (int) parent.getBounds().getWidth(); // 300 px
        int height = (int) parent.getBounds().getHeight(); // 200 px

        int frameWidth = this.getSize().width; // 250 px
        int frameHeight = this.getSize().height; // 75 px

        this.setLocation(parent.getBounds().x + (width - frameWidth)/2, parent.getBounds().y + (height - frameHeight)/2);
    }

    public void initComponents()
    {
        this.setTitle("Opened frame no: " + (++i));
        this.setBounds(300, 200, 250, 75);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new MultiframeAppMain().setVisible(true);
    }

    static int i = 0;
}
