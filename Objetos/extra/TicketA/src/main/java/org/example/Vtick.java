package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Vtick {
    private JPanel panel;
    private JList trayectos;
    private JSpinner numeroTickets;
    private JButton limpiarButton;
    private JButton comprarButton;
    private JLabel total;

    private Trayecto actual = null;

    String cadenaConexion = "jdbc:sqlite:ticketbus.db";

    public Vtick(GestorDatos gestorDatos) {

        actualizarListaTrayectos(gestorDatos);

        // ##### 5 #####
        // Configura el Spinner para que solo se puedan vender entre 1 y 10 tickets (OK)
        SpinnerModel model = new SpinnerNumberModel(1, //valor inicial
                1, //min
                10, //max
                1); //step

        numeroTickets.setModel(model);

        // ##### 6 #####
        // Muestra la lista de trayectos disponibles como en la captura de pantalla
        // Descomenta el siguiente bloque cuando la lista tenga datos

   /*     // Crear el modelo primer paso
       DefaultListModel <Trayecto> modeloTrayecto = new DefaultListModel<>();

        trayectos.setModel(modeloTrayecto);

       // Segundo añadir el modelo a la lista
       for (Trayecto trayectoselect : gestorDatos.getTrayectos()){
           modeloTrayecto.addElement(trayectoselect);
       }*/


        numeroTickets.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                calcularTotal();
            }
        });
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // ##### 7 #####
                // Si el número de plazas disponibles es suficiente, actualiza el trayecto
                // Si no, muestra un mensaje de error

                int cantidadTickets = (int) numeroTickets.getValue();

                if (cantidadTickets < actual.getPlazas()) {

                    actual.setPlazas(actual.getPlazas() - cantidadTickets);
                    System.out.println(total);


                    try {
                        Connection conexion = DriverManager.getConnection(cadenaConexion);

                        String sql = "update trayectos set plazas = ? where id = ?";

                        PreparedStatement ps = conexion.prepareStatement(sql);

                        ps.setInt(1, actual.getPlazas());
                        ps.setInt(2, actual.getId());

                        int filaModificada = ps.executeUpdate();

                        if (filaModificada > 1) {
                            JOptionPane.showMessageDialog(null, "Se han actualizado las plazas", "OK", JOptionPane.INFORMATION_MESSAGE);
                            actualizarListaTrayectos(gestorDatos);
                            ps.close();

                        }


                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                    trayectos.repaint(); // importante

                    JOptionPane.showMessageDialog(null, "Has comprado los tickets", "OK", JOptionPane.INFORMATION_MESSAGE);

                }


                // ##### 8 #####
                // Actualiza el trayecto en la base de datos con la nueva cantidad de plazas disponibles
            }

        });
        trayectos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                actual = (Trayecto) trayectos.getSelectedValue();
                calcularTotal();

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarVentana();
            }
        });
    }

    private void actualizarListaTrayectos(GestorDatos gestorDatos) {
        DefaultListModel<Trayecto> modeloTrayecto = new DefaultListModel<>();

        for (Trayecto trayecto : gestorDatos.getTrayectos()) {
            modeloTrayecto.addElement(trayecto);
        }

        trayectos.setModel(modeloTrayecto);
    }


    private void reiniciarVentana() {
        trayectos.setSelectedIndex(0);
        numeroTickets.setValue(1);
    }

    private void calcularTotal() {
        int n = (int) numeroTickets.getValue();
        total.setText("Total: " + (actual.getPrecio() * n) + " €");
    }

    public JPanel getPanel() {
        return panel;
    }
}
