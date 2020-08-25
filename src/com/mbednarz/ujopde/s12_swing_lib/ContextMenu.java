package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* -- LESSON 79: Obsługa zdarzeń myszki oraz menu kontekstowe -- */

public class ContextMenu extends JFrame
{
    public ContextMenu()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Context Menu");
        this.setBounds(300,300,300,300);

        final JPopupMenu contextMenu = new JPopupMenu();

        //contextMenu.add(new JMenuItem("New !"));
        contextMenu.add(new JMenuItem(new AbstractAction("CLOSE !")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        }));

        //contextMenu.add(new JMenuItem("Open !"));
        //contextMenu.add(new JMenuItem("Close !"));

        this.getContentPane().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("STEP 2: zwolnienie przycisku myszy!");

                if (e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1)
                    JOptionPane.showMessageDialog(rootPane, "3 x kliknięcie LEWYM przyciskiem myszy!");

                //if (e.getButton() == MouseEvent.BUTTON3)
                if (e.isPopupTrigger())
                    contextMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        this.getContentPane().add(testButton, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JButton testButton = new JButton("Test Button");

    public static void main(String[] args)
    {
        new ContextMenu().setVisible(true);
    }
}
