package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class VComprarEntradas {
    private JList<Eventos> eventos;
    private JSpinner numeroEntradas;
    private JButton comprarButton;
    private JLabel total;
    JPanel panelCompra;



    private Eventos calculoEntrada = null;

    String cadenaConexion = "jdbc:sqlite:entradas.db";

    private void actualizarTablaEventos(GestorDB gestorDB) {
        DefaultListModel<Eventos> modeloEvento = new DefaultListModel<>();

        for (Eventos eventos1 : gestorDB.getEventos()) {
            modeloEvento.addElement(eventos1);
        }

        eventos.setModel(modeloEvento);
    }

    // vamos a hacerlo para calcular el total del precio de las entradas
    public void calcularTotal(){
        // con esto vamos a coger el valor del spinner
        int n = (int) numeroEntradas.getValue();
        total.setText("Total: " + (calculoEntrada.getPrecio() * n) + " €");
    }


    public VComprarEntradas(GestorDB gestorDB) {

        actualizarTablaEventos(gestorDB);

        // Aqui vamos a configurar el spinner entre 1 a maximo
        SpinnerModel model = new SpinnerNumberModel(1,
                1,
                /*calculoEntrada.getEntradas_disponibles()*/20,
                1);

        numeroEntradas.setModel(model);



        numeroEntradas.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                calcularTotal();
            }
        });
        eventos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                calculoEntrada = eventos.getSelectedValue();
                calcularTotal();
            }
        });
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidaEntradas = (int) numeroEntradas.getValue();

                if (cantidaEntradas < calculoEntrada.getEntradas_disponibles()){

                    int cantidadDisponibles = calculoEntrada.getEntradas_disponibles() - cantidaEntradas;

                    calculoEntrada.setEntradas_disponibles(cantidadDisponibles);

                    try {
                        gestorDB.actualizarEntradasDisponibles(calculoEntrada.getId(), cantidadDisponibles );
                        JOptionPane.showMessageDialog(null, "se ha actualizado correctamente", "ok",JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                    eventos.repaint();


                }
            }
        });
    }
}
