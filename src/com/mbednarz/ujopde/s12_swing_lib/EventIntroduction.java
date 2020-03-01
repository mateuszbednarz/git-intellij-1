package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author mbednarz
 * @created 29/02/2020 - 14:54
 * @project git-intellij-1
 */

/* -- LESSON 63: Wstęp do zdarzeń -- */
public class EventIntroduction extends JFrame
{
    public EventIntroduction()
    {
        super("Events Introduction");
        this.setBounds(300, 200, 400, 400);
        initComponents();
        this.setDefaultCloseOperation(3);
    }

    public void initComponents()
    {
        red = new JButton("Red!");
        red.addActionListener(new ColorListener(Color.RED));

        green = new JButton("Green!");
        green.addActionListener(new ColorListener(Color.GREEN));

        this.getContentPane().add(panel);
        panel.add(red);
        panel.add(green);

        createButton("Yellow!", Color.YELLOW);
    }

    // przycisk to KOMPONENT, który jest ŹRÓDŁEM ZDARZEŃ
    // ŹRÓDŁO może być nasłuchiwane przez tzw. SŁUCHACZE, obsługujące dane ZDARZENIE
    // SŁUCHACZE implementują konkretne interfejsy obsługjące dane ZDARZENIE
    JButton red;
    JButton green;
    JPanel panel = new JPanel();

    public void createButton(String buttonName, Color color)
    {
        JButton button = new JButton(buttonName);
        panel.add(button);
        button.addActionListener(new ColorListener(color));
    }

    // klasa wewnętrzna - ma dostęp do wszystkich zmiennych głównej klasy EventIntroduction
    private class ColorListener implements ActionListener
    {
        public ColorListener(Color color)
        {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("Color listener defined ACTION is performed after CLICK on 'Red!' button!");
            panel.setBackground(color);
        }

        Color color;
    }

    public static void main(String[] args)
    {
        new EventIntroduction().setVisible(true);
    }
}
