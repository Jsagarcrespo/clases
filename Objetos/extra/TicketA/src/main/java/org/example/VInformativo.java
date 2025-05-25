package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VInformativo {
    private JTable tabla;
    private JButton actualizarButton;
    JPanel panel1;

    private final GestorDatos gestorDatos;

    public VInformativo(GestorDatos gestorDatos) {
        this.gestorDatos = gestorDatos;
        actualizarTabla();   // IMPORTANTE PARA QUE PUEDA VER LA TABLA

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTabla();
            }
        });
    }

    public void actualizarTabla() {
        // ##### 4 #####
        // Instancia el modelo de tabla y muestra la información (OK)

        /*DefaultListModel<Trayecto> clienteDefaultListModel = new DefaultListModel<>();
        clienteDefaultListModel.clear();

        for (Trayecto trayecto : trayectos) {
            clienteDefaultListModel.addElement(trayecto);
        }*/


        ModeloPaneInformativo modelo = new ModeloPaneInformativo(gestorDatos.getTrayectos());
        tabla.setModel(modelo);

    }
}



