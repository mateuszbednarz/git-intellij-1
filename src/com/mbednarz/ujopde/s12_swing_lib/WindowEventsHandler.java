package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */
/* -- LESSON 72: Obsługa zdarzeń okna -- */
public class WindowEventsHandler extends JFrame implements WindowListener
{
    public WindowEventsHandler()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Window Events Handler");
        this.setBounds(300, 200, 400, 400);
        this.addWindowListener(this);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new WindowEventsHandler().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e)
    {
        JOptionPane.showMessageDialog(rootPane, "Hello Admin!");
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        int closingOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure want to close?");

        if (closingOption == 0)
            this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Save all files after window closed!");
    }

    @Override
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window is hidden to Start bar now!");
    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window is opened from Start bar now!");
    }

    @Override
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window is active now!");
    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window is not active now!");
    }
}
