package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author mbednarz
 * @created 29/02/2020 - 16:27
 * @project git-intellij-1
 */

/* -- LESSON 64: Etykiety & zegarek -- */
public class ClockAndLabels extends JFrame
{
    public ClockAndLabels()
    {
        super("Clock and labels");
        this.setBounds(300, 200, 400, 400);
        initComponents();
        this.setDefaultCloseOperation(3);
    }

    public void initComponents()
    {
        panel.add(timeLabel);
        panel.add(timeValue);

        ActionListener stoper = new Clock();
        Timer clock = new Timer(1000, stoper);
        clock.start();

        this.getContentPane().add(panel);
        pack();
    }

    JPanel panel = new JPanel();
    JLabel timeLabel = new JLabel("Current time:");
    JLabel timeValue = new JLabel(getCurrentTime());

    private class Clock implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            timeValue.setText(getCurrentTime());
        }
    }

    public String getCurrentTime()
    {
        GregorianCalendar gcal = new GregorianCalendar();

        // sposób na dodanie '0' przed, jeżeli godzina/minuta/sekunda < 10
        String h = "" + gcal.get(Calendar.HOUR_OF_DAY);
        String m = "" + gcal.get(Calendar.MINUTE);
        String s = "" + gcal.get(Calendar.SECOND);

        if(Integer.parseInt(h) < 10)
            h = "0" + h;
        if(Integer.parseInt(m) < 10)
            m = "0" + m;
        if(Integer.parseInt(s) < 10)
            s = "0" + s;

        return h + ":" + m + ":" + s;

        /*
        int hour = gcal.get(Calendar.HOUR_OF_DAY);
        int minute = gcal.get(Calendar.MINUTE);
        int second = gcal.get(Calendar.SECOND);
        */
    }

    public static void main(String[] args)
    {
        new ClockAndLabels().setVisible(true);
    }
}
