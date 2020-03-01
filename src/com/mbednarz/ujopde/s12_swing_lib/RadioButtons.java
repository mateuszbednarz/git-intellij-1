package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mbednarz
 * @created 01/03/2020 - 20:42
 * @project git-intellij-1
 */

/* -- LESSON 65: Przełączniki 'radio' oraz głębsza analiza NetBeans -- */
public class RadioButtons extends JFrame
{
    public RadioButtons()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Radio Buttons");
        this.setBounds(300, 200, 300, 200);

        secondPanel.add(label);

        changeFont("Small !", 20);
        changeFont("Medium !", 25);
        changeFont("Big !", 30);

        changeColor("Blue !", Color.BLUE);
        changeColor("Red !", Color.RED);
        changeColor("Cyan !", Color.CYAN);

        /*
        JRadioButton smallRb = new JRadioButton("Change font !");
        JRadioButton middleRb = new JRadioButton("Medium");

        smallRb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setFont(new Font("Monospaced", Font.BOLD,20));
            }
        });

        groupSize.add(smallRb);
        groupSize.add(middleRb);

        firstPanel.add(smallRb);
        firstPanel.add(middleRb);
        */
        this.getContentPane().add(firstPanel, BorderLayout.NORTH);
        this.getContentPane().add(secondPanel, BorderLayout.CENTER);
        this.getContentPane().add(thirdPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(3);
    }

    public void changeFont(String buttonName, final int buttonSize)
    {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setFont(new Font("Monospaced", Font.PLAIN, buttonSize));
            }
        });

        fontChangers.add(button);
        firstPanel.add(button);
    }

    public void changeColor(String buttonName, final Color color)
    {
        JRadioButton button = new JRadioButton(buttonName);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setForeground(color);
            }
        });

        colorChangers.add(button);
        thirdPanel.add(button);
    }

    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JPanel thirdPanel = new JPanel();

    JLabel label = new JLabel("Something...");

    ButtonGroup fontChangers = new ButtonGroup();
    ButtonGroup colorChangers = new ButtonGroup();

    public static void main(String[] args)
    {
        new RadioButtons().setVisible(true);
    }
}
