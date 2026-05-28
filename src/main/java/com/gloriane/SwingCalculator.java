package com.gloriane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean operatorPressed = false;

    public SwingCalculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            if (operatorPressed) {
                display.setText(command);
                operatorPressed = false;
            } else {
                display.setText(display.getText().equals("0") ? command : display.getText() + command);
            }
        } else if (command.equals("C")) {
            display.setText("0");
            num1 = num2 = result = 0;
            operator = "";
        } else if (command.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            operatorPressed = true;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 != 0) result = num1 / num2;
                    else { display.setText("Error"); return; }
                    break;
            }
            display.setText(result % 1 == 0 ? String.valueOf((int)result) : String.valueOf(result));
            operatorPressed = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator().setVisible(true));
    }
}
