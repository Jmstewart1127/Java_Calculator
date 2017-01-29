package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jacob Stewart on 1/27/2017.
 */
public class App {

    double num, ans;
    int calculation;

    private JButton clear;
    private JPanel panelMain;
    private JTextField textField1;
    private JRadioButton ON;
    private JRadioButton OFF;
    private JButton divide;
    private JButton subtract;
    private JButton equals;
    private JButton add;
    private JButton nine;
    private JButton six;
    private JButton multiply;
    private JButton eight;
    private JButton seven;
    private JButton five;
    private JButton four;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton bckspc;
    private JButton decimal;
    private JLabel label;

    public void disable() {
        textField1.setEnabled(false);

        clear.setEnabled(false);
        divide.setEnabled(false);
        subtract.setEnabled(false);
        equals.setEnabled(false);
        add.setEnabled(false);
        nine.setEnabled(false);
        six.setEnabled(false);
        multiply.setEnabled(false);
        eight.setEnabled(false);
        seven.setEnabled(false);
        five.setEnabled(false);
        four.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        bckspc.setEnabled(false);
        decimal.setEnabled(false);
    }

    public void enable() {
        textField1.setEnabled(true);

        clear.setEnabled(true);
        divide.setEnabled(true);
        subtract.setEnabled(true);
        equals.setEnabled(true);
        add.setEnabled(true);
        nine.setEnabled(true);
        six.setEnabled(true);
        multiply.setEnabled(true);
        eight.setEnabled(true);
        seven.setEnabled(true);
        five.setEnabled(true);
        four.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        bckspc.setEnabled(true);
        decimal.setEnabled(true);
    }

    public void math_operation() {
        switch(calculation) {

            case 1: //addition
                ans = num + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;

            case 2: //subtraction
                ans = num - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;

            case 3: // multiplication
                ans = num * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;

            case 4: // division
                ans = num / Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;
        }
    }


    public App() {
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + ".");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation = 4;
                textField1.setText("");
                label.setText(num + "/");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation = 3;
                textField1.setText("");
                label.setText(num + "*");
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation = 2;
                textField1.setText("");
                label.setText(num + "-");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation = 1;
                textField1.setText("");
                label.setText(num + "+");

            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                math_operation();
            }
        });
        OFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });
        ON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });
        bckspc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                if (length == 0) return;
                textField1.setText(textField1.getText().substring(0, length - 1));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Jframe("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
