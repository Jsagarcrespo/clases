package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VNuevoProyecto {
    private JComboBox<Ciudad> ciudadOrigen;
    private JComboBox<Ciudad> ciudadDestino;
    private JTextField horaText;
    private JTextField precioText;
    private JTextField plazasText;
    private JButton guardarButton;
    private JPanel panel;

    //private GestorDatos gestorDatos; ESTO SI LO QUIERO VER ANTES DE USAR EL MAIN PRINCIPAL

    public VNuevoProyecto(GestorDatos gestorDatos) {
        //esto si quiero verlo antes de meterlo en el main principal
        // this.gestorDatos = gestorDatos;
        // ##### 1 #####
        // Rellena los ComboBox de ciudadOrigen y ciudadDestino con los datos disponibles en gestorDatos (OK)

        for (Ciudad origen : gestorDatos.getCiudades()){
            ciudadOrigen.addItem(origen);

        }

        for (Ciudad destino : gestorDatos.getCiudades()){
            ciudadDestino.addItem(destino);

        }
        
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadenaConexion = "jdbc:sqlite:ticketbus.db";
                // ##### 2 #####
                // Recoge los datos del interfaz de usuario y crea un nuevo objeto de tipo Trayecto en gestorDatos
                // Muestra un error si empieza y termina en la misma ciudad (OK)

                Ciudad origen = ciudadOrigen.getItemAt(ciudadOrigen.getSelectedIndex());
                Ciudad destino = ciudadDestino.getItemAt(ciudadDestino.getSelectedIndex());
                String hora = horaText.getText();
                double precio = Double.parseDouble(precioText.getText());
                int plazas = Integer.parseInt(plazasText.getText());

                if (origen == destino){
                    JOptionPane.showMessageDialog(null, "No puede ir al mismo lugar de origen y destino", "Error", JOptionPane.ERROR_MESSAGE);

                } else {

                    Trayecto trayecto = new Trayecto(origen, destino, hora, precio, plazas);
                    gestorDatos.getTrayectos().add(trayecto);
                    try {


                        Connection conexion = DriverManager.getConnection(cadenaConexion);

                        String sql = "insert into trayectos (ciudad_origen_id, ciudad_destino_id, hora, precio, plazas) values (?, ?, ?, ?, ?)";

                        PreparedStatement ps = conexion.prepareStatement(sql);
                        ps.setInt(1, origen.getId());
                        ps.setInt(2, destino.getId());
                        ps.setString(3, hora);
                        ps.setDouble(4, precio);
                        ps.setInt(5, plazas);

                        int filasModificadas = ps.executeUpdate();

                        if (filasModificadas > 1){
                            JOptionPane.showMessageDialog(null, "OK", "se ha insertado exitosamente", JOptionPane.INFORMATION_MESSAGE);



                            ps.close();
                        }

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }



                    JOptionPane.showMessageDialog(null, "OK", "OK", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        });
    }
    private void reiniciarVentana() {
        ciudadOrigen.setSelectedIndex(0);
        ciudadDestino.setSelectedIndex(0);
        horaText.setText("12:00");
        precioText.setText("7.45");
        plazasText.setText("55");
    }

    public JPanel getPanel() {
        return panel;
    }



   /* public static void main(String[] args) {
        JFrame frame = new JFrame("VNuevoTrayecto");
        frame.setContentPane(new VNuevoTrayecto(new GestorDatos()).panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/

  /*  public Container getPanel() {
        return panel;
    }*/

}
