package com.mbednarz.ujopde.s12_swing_lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mbednarz
 * @created 18/04/2020 - 11:21
 * @project git-intellij-1
 */

/* -- LESSON 69: Obszar tekstowy, przeszukiwanie i podmienianie tekstów -- */
public class TextSearchTool extends JFrame
{
    public TextSearchTool()
    {
        initComponents();
    }

    public void initComponents()
    {
        this.setTitle("Base App Layout");
        this.setBounds(300, 200, 400, 400);

        searchPanel.add(findButton);
        searchPanel.add(searchedPhrase);
        searchPanel.add(andLabel);
        searchPanel.add(replaceButton);
        searchPanel.add(replaceForLabel);
        searchPanel.add(newText);

        // polecenie 'Zaznacz wszystko'
        // textArea.selectAll();

        // polecenie zaznaczenia jakiegoś fragmentu tekstu (liczone w ilości znaków)
        // textArea.select(0,10);

        // polecenie podmiany jakiegoś fragmentu tekstu zadaną w paremetrze wartością (zamiana 'znak za znak')
        // textArea.select(0,7);
        // textArea.replaceSelection("Lalunia");

        // działa pododbnie jak 'replaceSelection()', tylko zamienia nam jakąś ilość znaków (policzoną) na frazę podaną w parametrze
        // textArea.replaceRange("Kika", 0, 7);

        // wstawianie frazy w określone miejsce w tekście
        // textArea.insert("-> NOWA FRAZA <-", 10);

        // dodawanie zadanej frazy na końcu istniejącego tekstu
        // textArea.append("-> FRAZA DODANA NA KONCU <-");

        // szukanie w tekście za pomocą metody 'select()'
        // textArea.select(textArea.getText().indexOf("field"), textArea.getText().indexOf("field") + "field".length());

        findButton.addActionListener(new TextSearchHandler());
        replaceButton.addActionListener(new ReplaceTextHandler());

        this.getContentPane().add(scrollPane, BorderLayout.NORTH);
        this.getContentPane().add(searchPanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(3);
    }

    /* Text Search Handler */
    private class TextSearchHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            searchedTextBeginning = textArea.getText().indexOf(searchedPhrase.getText(), searchedTextBeginning + searchedPhrase.getText().length());
            System.out.println(searchedTextBeginning);

            if (searchedTextBeginning == -1)
                searchedTextBeginning = textArea.getText().indexOf(searchedPhrase.getText());

            if (searchedTextBeginning >= 0 && searchedPhrase.getText().length() > 0)
            {
                textArea.requestFocus();
                textArea.select(searchedTextBeginning, searchedTextBeginning + searchedPhrase.getText().length());
            }
        }

        private int searchedTextBeginning = 0;
    }

    /* Replace Text Handler */
    private class ReplaceTextHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (textArea.getSelectionStart() != textArea.getSelectionEnd()) {
                replaceText();
            }
            else {
                findButton.doClick(0);
                if (textArea.getSelectionStart() != textArea.getSelectionEnd())
                replaceText();
            }
        }

        private void replaceText()
        {
            textArea.requestFocus();
            int replacementOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to replace text?", "Text replacement confirmation", JOptionPane.YES_NO_OPTION);

            if (replacementOption == 0)
                textArea.replaceRange(newText.getText(), textArea.getSelectionStart(), textArea.getSelectionEnd());
        }
    }

    private JTextArea textArea = new JTextArea("Default field value inserted in the field!",10,10);
    private JScrollPane scrollPane = new JScrollPane(textArea);

    private JPanel searchPanel = new JPanel();
    private JButton findButton = new JButton("Find");
    private JLabel andLabel = new JLabel("&");
    private JButton replaceButton = new JButton("Replace");
    private JLabel replaceForLabel = new JLabel("for");

    private JTextField searchedPhrase = new JTextField(5);
    private JTextField newText = new JTextField(5);

    public static void main(String[] args)
    {
        /* dodać otwieranie okna na drugim monitorze ! */
        new TextSearchTool().setVisible(true);
    }
}
