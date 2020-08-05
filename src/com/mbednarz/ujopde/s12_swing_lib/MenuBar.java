package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author mbednarz
 * @created 05/08/2020 - 13:35
 * @project git-intellij-1
 */

/* -- LESSON 77: Tworzenie pasków menu -- */
/* -- LESSON 78: Działania (akcje) -- */

public class MenuBar extends JFrame
{
    public MenuBar()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Menu bar");
        this.setBounds(300,300,200,200);
        this.setJMenuBar(menuBar);

        JMenu fileMenu = menuBar.add(new JMenu("File"));
        fileMenu.setMnemonic('F');

        JMenuItem newFileSubmenu = fileMenu.add(new JMenuItem("New"));
        newFileSubmenu.addActionListener(e -> System.out.println("New file creation implementation..."));

        fileMenu.addSeparator();
        final Action sa = new SaveAction("Save", "We are saving changes clicking here...", "ctrl S", new ImageIcon("Save.gif"));
        final JMenuItem saveSubmenu = fileMenu.add(sa);
        saveAllButton =  new JButton(sa);
        saveSubmenu.setToolTipText("Saving changes...");
        saveSubmenu.setMnemonic('S');
        saveSubmenu.setAccelerator(KeyStroke.getKeyStroke("Ctrl S"));
        saveSubmenu.setEnabled(false);
        sa.setEnabled(false);
        /*
        saveSubmenu.addActionListener(e -> {
            System.out.println("File saved on HDD!");
            saveSubmenu.setEnabled(textAreaFlag = false);
        });

        */
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.addSeparator();

        JMenu optionsMenu = new JMenu("Options");
        fileMenu.add(optionsMenu);
        optionsMenu.add(new JMenuItem("Option 1..."));
        optionsMenu.add(new JMenuItem("Option 2..."));
        optionsMenu.add(readOnlyCheck);

        readOnlyCheck.addActionListener(e -> {
            if (readOnlyCheck.isSelected())
                sa.setEnabled(false);
            else
                sa.setEnabled(textAreaFlag);
        });

        JMenu helpMenu = menuBar.add(new JMenu("Help"));
        helpMenu.add(new JMenuItem("FAQ"));

        textArea.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                if (readOnlyCheck.isSelected())
                    e.consume();
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                if (readOnlyCheck.isSelected())
                    e.consume();
                else if (!(textArea.getText() + e.getKeyChar()).equals(textAreaBefore) && ifAscii(e.getKeyChar()))
                {
                    textAreaBefore = textArea.getText() + e.getKeyChar();
                    sa.setEnabled(textAreaFlag = true);
                }
            }
        });

        this.getContentPane().setLayout(new GridLayout(2,1));
        this.getContentPane().add(textArea);
        this.getContentPane().add(saveAllButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private JMenuBar menuBar = new JMenuBar();
    private JCheckBoxMenuItem readOnlyCheck = new JCheckBoxMenuItem("Read only");
    private JRadioButtonMenuItem radioButton;
    private JTextArea textArea = new JTextArea();
    private boolean textAreaFlag = false;
    private String textAreaBefore = "";
    private JButton saveAllButton;

    private class SaveAction extends AbstractAction
    {
        public SaveAction(String name, String tip, String keyShortcut, Icon icon)
        {
            this.putValue(Action.NAME, name);
            this.putValue(Action.SHORT_DESCRIPTION, tip);
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyShortcut));
            this.putValue(Action.SMALL_ICON, icon);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("File saved on HDD!");
            this.setEnabled(textAreaFlag = false);
        }
    }

    private boolean ifAscii(char ch)
    {
        for (int i = 0; i < 255; i++)
            if (ch == i)
                return true;
        return false;
    }

    public static void main(String[] args)
    {
        new MenuBar().setVisible(true);
    }
}
