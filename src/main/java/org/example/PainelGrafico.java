package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelGrafico {

    JFrame frame = new JFrame("SERVIDOR");
    JPanel panel = new JPanel();
    JTextField inputFieldNome = new JTextField(10);
    JTextField inputFieldAcesso = new JTextField(10);
    JLabel labelNome = new JLabel("Nome:");
    JLabel labelAcesso = new JLabel("Acesso:");

    public PainelGrafico() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.setLocationRelativeTo(null);

        panel.setLayout(new GridLayout(6, 2));

        inputFieldNome.setFont(new Font("Arial", Font.PLAIN, 30));
        inputFieldAcesso.setFont(new Font("Arial", Font.PLAIN, 30));

        panel.add(labelNome);
        panel.add(inputFieldNome);
        panel.add(labelAcesso);
        panel.add(inputFieldAcesso);

        String[] buttonLabels = {
                "Sair"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            panel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (label.equals("Sair")) {
                        System.exit(0);
                    }
                }
            });
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
