package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author mbednarz
 * @created 23/03/2020 - 23:12
 * @project git-intellij-1
 */

/* -- LESSON 67: FocusListener, KeyListener, VirtualKeys, GridLayout oraz własne menu -- */
public class ListenersAndCustomMenu extends JFrame
{
    public ListenersAndCustomMenu()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Custom Menu");
        this.setBounds(300, 200, 300, 200);

        menuPanel.setLayout(new GridLayout(3, 1));
        menuPanel.add(firstElement);
        menuPanel.add(secondElement);
        menuPanel.add(thirdElement);

        c.add(menuPanel);
        this.setDefaultCloseOperation(3);
    }

    private Container c = this.getContentPane();
    private JPanel menuPanel = new JPanel();

    private MenuButton firstElement = new MenuButton("1-Add");
    private MenuButton secondElement = new MenuButton("2-Edit");
    private MenuButton thirdElement = new MenuButton("3-Delete");

    private int i = 0;

    private class MenuButton extends JButton implements FocusListener, ActionListener
    {
        public MenuButton(String buttonName)
        {
            super(buttonName);
            this.addFocusListener(this);
            this.addActionListener(this);
            this.addKeyListener(new KeyAdapter()

            /*   gdy naciśniemy na klawiaturze literę 'a' wywoływane są kolejno metody:
             *   1] keyPressed
             *   2] keyTyped
             *   3] keyReleased
             */
            {
                @Override
                public void keyPressed(KeyEvent e)
                {
                    keyPressedHandler(e);
                }
            });

            this.setBackground(cDefault);
        }

        @Override
        public void focusGained(FocusEvent e)
        {
            this.setBackground(cFocusGained);
        }

        @Override
        public void focusLost(FocusEvent e)
        {
            this.setBackground(cDefault);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(this, ((MenuButton) e.getSource()).getText());
        }

        private void keyPressedHandler(KeyEvent e)
        {
            int menuLength = menuPanel.getComponentCount();

            if (i == 0) i = 10 * menuLength;
            if (e.getKeyCode() ==  KeyEvent.VK_DOWN)
            {
                /*
                    wykorzystamy tutaj tzw. dzielenie Modulo (0 % 3 = 0; 1 % 3 = 1; 2 % 3 = 2; 3 % 3 = 0; 4 % 3 = 1)
                 */

                menuPanel.getComponent(++i % menuLength).requestFocus();
                System.out.println(i);
            }
            else if (e.getKeyCode() ==  KeyEvent.VK_UP)
            {
                menuPanel.getComponent(--i % menuLength).requestFocus();
                System.out.println(i);
            }

            else if (e.getKeyCode() ==  KeyEvent.VK_ENTER)
            {
                //MenuButton tmp_btn = (MenuButton) e.getSource();
                //tmp_btn.doClick();
                ((MenuButton) e.getSource()).doClick();
            }
        }


        private Color cFocusGained = Color.ORANGE;
        private Color cDefault = Color.CYAN;
    }

    public static void main(String[] args)
    {
        new ListenersAndCustomMenu().setVisible(true);
    }
}
