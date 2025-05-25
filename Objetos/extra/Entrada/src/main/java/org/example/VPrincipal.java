package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VPrincipal {
    private JButton comprarEntradasButton;
    private JButton VEventosButton;
    JPanel panel1;

    private List<Eventos> eventos = new ArrayList<>();

    public VPrincipal() {
        comprarEntradasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VComprarEntradas");
                frame.setContentPane(new VComprarEntradas(new GestorDB()).panelCompra);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        VEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VEventos");
                frame.setContentPane(new VEventos(new GestorDB()).panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }




}
