package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */
/* -- LESSON 73: Aplikacja z wieloma ramkami -- */
public class MultiframeAppMain extends JFrame
{
    public MultiframeAppMain()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Multiframe App");
        this.setBounds(300, 200, 400, 400);

        createFrameBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new MultiframeAppExternalModule(currentFrame).setVisible(true);
            }
        });

        this.getContentPane().add(createFrameBtn);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JFrame currentFrame = this;
    private JButton createFrameBtn = new JButton("Create frame...");

    public static void main(String[] args)
    {
        new MultiframeAppMain().setVisible(true);
    }
}
