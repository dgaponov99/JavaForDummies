package Chapter_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;

    JTextField textField = new JTextField(15);
    JButton button = new JButton("Сделать попытку");
    JLabel label = new JLabel(numGuesses + " попыток");

    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        // using method
        button.addActionListener(this);

        // using inner class
        //button.addActionListener(new MyActionListener());

        // using anonymous class
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFilesText = textField.getText();

                if (Integer.parseInt(textFilesText)==randomNumber){
                    button.setEnabled(false);
                    textField.setText(textField.getText() + " Ура, угадал!");
                    textField.setEnabled(false);
                } else {
                    textField.setText("");
                    textField.requestFocus();
                }

                numGuesses++;
                String guessWord = (numGuesses == 1) ? " попытка" : " попыток";
                label.setText(numGuesses + guessWord);
            }
        });*/
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textFilesText = textField.getText();

        if (Integer.parseInt(textFilesText)==randomNumber){
            button.setEnabled(false);
            textField.setText(textField.getText() + " Ура, угадал!");
            textField.setEnabled(false);
        } else {
            textField.setText("");
            textField.requestFocus();
        }

        numGuesses++;
        String guessWord = (numGuesses == 1) ? " попытка" : " попыток";
        label.setText(numGuesses + guessWord);
    }


    // inner class
    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String textFilesText = textField.getText();

            if (Integer.parseInt(textFilesText)==randomNumber){
                button.setEnabled(false);
                textField.setText(textField.getText() + " Ура, угадал!");
                textField.setEnabled(false);
            } else {
                textField.setText("");
                textField.requestFocus();
            }

            numGuesses++;
            String guessWord = (numGuesses == 1) ? " попытка" : " попыток";
            label.setText(numGuesses + guessWord);
        }
    }
}
