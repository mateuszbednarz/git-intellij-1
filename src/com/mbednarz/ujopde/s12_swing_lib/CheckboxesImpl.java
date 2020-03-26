package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mbednarz
 * @created 23/03/2020 - 22:20
 * @project git-intellij-1
 */

/* -- LESSON 66: Pole wyboru - checkbox -- */
public class CheckboxesImpl extends JFrame
{
    public CheckboxesImpl()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Checkboxes Implementation");
        this.setBounds(300, 200, 300, 200);

        fl.setFont(new Font("Monospaced", Font.PLAIN, 20));

        ActionListener al = new CheckboxHandler();

        boldedTextChbx.addActionListener(al);
        italicTextChbx.addActionListener(al);
        fp.add(boldedTextChbx);
        fp.add(italicTextChbx);

        sp.add(fl);

        this.getContentPane().add(fp, BorderLayout.NORTH);
        this.getContentPane().add(sp, BorderLayout.CENTER);

        this.setDefaultCloseOperation(3);
    }

    JPanel fp = new JPanel();
    JPanel sp = new JPanel();

    JCheckBox boldedTextChbx = new JCheckBox("Bold");
    JCheckBox italicTextChbx = new JCheckBox("Italic");

    JLabel fl = new JLabel("I'm beautiful!");

    public class CheckboxHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int fontStyle = Font.PLAIN;

            if (boldedTextChbx.isSelected())
                fontStyle += Font.BOLD;
            if (italicTextChbx.isSelected())
                fontStyle += Font.ITALIC;

            fl.setFont(new Font(fl.getFont().getFamily(), fontStyle, fl.getFont().getSize()));
        }
    }

    public static void main(String[] args)
    {
        new CheckboxesImpl().setVisible(true);
    }
}
