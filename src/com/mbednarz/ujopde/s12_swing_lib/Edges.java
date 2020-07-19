package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mbednarz
 * @created 01/07/2020 - 10:03
 * @project git-intellij-1
 */

/* -- LESSON 75: Krawędzie -- */
public class Edges extends JFrame
{
    public Edges()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Edges");
        this.setBounds(300, 200, 400, 400);

        addBorderSwitch("Create etched border...", BorderFactory.createEtchedBorder());
        addBorderSwitch("Create lowered bevel border...", BorderFactory.createLoweredBevelBorder());

        //radioPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        radioPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Title: Borders", TitledBorder.RIGHT, TitledBorder.BOTTOM));

        this.getContentPane().setLayout(new GridLayout(2,1));
        this.getContentPane().add(radioPanel);
        this.getContentPane().add(borderPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel radioPanel = new JPanel();
    private JPanel borderPanel = new JPanel();
    private ButtonGroup radioGroup = new ButtonGroup();

    public void addBorderSwitch(final String name, final Border border)
    {
        JRadioButton borderSwitch = new JRadioButton(name);
        borderSwitch.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                borderPanel.setBorder(BorderFactory.createTitledBorder(border, name));
            }
        });

        radioGroup.add(borderSwitch);
        radioPanel.add(borderSwitch);
    }

    public static void main(String[] args)
    {
        new Edges().setVisible(true);
    }
}
