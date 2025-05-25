package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VMenu {
    private JButton nuevoTrayectoButton;
    private JPanel panel1;
    private JButton ventaDeTicketsButton;
    private JButton panelInformativoButton;


    private final GestorDatos gestorDatos = new GestorDatos();

    public VMenu() {
        nuevoTrayectoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Nuevo trayecto");
                frame.setContentPane(new VNuevoProyecto(gestorDatos).getPanel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        ventaDeTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Venta de tickets");
                frame.setContentPane(new Vtick(gestorDatos).getPanel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        panelInformativoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VPanelInformativo");
                frame.setContentPane(new VInformativo(gestorDatos).panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getPanel() {
        return panel1;
    }
}
