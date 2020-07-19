package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * @author mbednarz
 * @created 06/07/2020 - 14:33
 * @project git-intellij-1
 */
public class Sliders extends JFrame
{
    public Sliders()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Sliders");
        this.setBounds(300,300,300,200);

        sliderValue.setEditable(false);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                sliderValue.setText("" + ((JSlider)e.getSource()).getValue());
                tl.setFont(new Font(tl.getFont().getFontName(), tl.getFont().getStyle(), ((JSlider)e.getSource()).getValue()));
            }
        });

        this.getContentPane().add(slider, BorderLayout.NORTH);
        this.getContentPane().add(tl, BorderLayout.CENTER);
        this.getContentPane().add(sliderValue, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JSlider slider = new JSlider(JSlider.HORIZONTAL,0,30,5);
    JTextField sliderValue = new JTextField("" + slider.getValue());
    JLabel tl = new JLabel("Text size test!");

    public static void main(String[] args)
    {
        new Sliders().setVisible(true);
    }
}
