package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VEventos {
    JPanel panel1;
    private JButton actualizarButton;
    private JTable table1;

    private final GestorDB gestorDB;
    private List<Eventos> ev;

     public VEventos(GestorDB gestorDB) {
        this.gestorDB = gestorDB;
        actualizarTabla();

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTabla();
            }
        });

    }

    public void actualizarTabla(){
        ModeloTablaEventos modelo = new ModeloTablaEventos(gestorDB.getEventos());
        table1.setModel(modelo);
    }



}
