package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */

/* -- LESSON 70: Listy typu ComboBox -- */
public class ComboMenu extends JFrame
{
    public ComboMenu()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Combo Menu Example");
        this.setBounds(300, 200, 400, 400);

        panel.add(combo);

        combo.addItem(new ColorHandler("Black", Color.BLACK));
        combo.addItem(new ColorHandler("Orange", Color.ORANGE));
        combo.addItem(new ColorHandler("Green", Color.GREEN));
        combo.addItem(new ColorHandler("Red", Color.RED));

        combo.addActionListener(e -> {
            ColorHandler cHandler = (ColorHandler) ((JComboBox)e.getSource()).getSelectedItem();
            ((JComboBox) e.getSource()).setBackground(cHandler.getColor());
        });

        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
    }

    private class ColorHandler
    {
        public ColorHandler(String colorName, Color c)
        {
            this.c = c;
            this.colorName = colorName;
        }

        @Override
        public String toString()
        {
            return this.colorName;
        }

        public Color getColor()
        {
            return this.c;
        }
        private Color c;
        private String colorName;
    }

    private JPanel panel = new JPanel();
    private JComboBox combo = new JComboBox();

    public static void main(String[] args)
    {
        new ComboMenu().setVisible(true);
    }
}
