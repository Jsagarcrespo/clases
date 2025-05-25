package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VJugador {


    private JTextField JugName;
    private JPanel panel1;
    private JButton siguienteButton;

    List<Jugador> jugadors = new ArrayList<>();

    String cadenaConexion = "jdbc:sqlite:Mydb.db";

    public static void main(String[] args) {
        JFrame frame = new JFrame("VJugador");
        frame.setContentPane(new VJugador().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VJugador() {
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws RuntimeException {
                boolean jugadorExiste = false;

                String usuName = String.valueOf(JugName.getText());

                try {
                    Connection conexion = DriverManager.getConnection(cadenaConexion);

                    // PODRIA VALER PERO SI EN SQL PUEDO BUSCAR EL NOMBRE DIRECTAMENTE POR QUE O USARLO
                    //String sql = "Select * from Jugadores";

                    String sql = "Select Record from Jugadores where Nombre = ?";

                    //Valido si solo hubiera sido el select normal sin la haberlo buscado por nombre
                    /*Statement st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sql);*/

                    PreparedStatement ps = conexion.prepareStatement(sql) ;
                    ps.setString(1, usuName);

                    ResultSet rs = ps.executeQuery();

                    /*String nombre;
                    int record = 0; */

                    //while (rs.next()){
                        /*Jugador jugador = new Jugador(
                                // nombre =rs.getString("Nombre"); YA NO HACE FALTA PORQUE LO HACEMOS EN EL SQL
                                record = rs.getInt("Record");
                        //jugadorExiste = true; NO HACE FALTA VERIFICAR

                        );*//*

                        //jugadors.add(jugador);*/

                        // if (usuName.equalsIgnoreCase(nombre)){ LO SACAMOS DE LA PROPIA BASE DE DATOS
                        if (rs.next()){
                            int record = rs.getInt("Record");
                            JOptionPane.showMessageDialog(null, "Hola " + usuName + " tu record era de " + record, "OK", JOptionPane.INFORMATION_MESSAGE);
                            ps.close();
                            rs.close();
                        } else {
                            String insertSql = "Insert into Jugadores (Nombre) values (?)";
                            int filasModificadas;
                            PreparedStatement pst = conexion.prepareStatement(insertSql) ;

                                pst.setString(1, usuName);

                                filasModificadas = pst.executeUpdate();


                            if (filasModificadas > 0){
                                JOptionPane.showMessageDialog(null, "hola nuevo jugador: " + usuName, "OK", JOptionPane.INFORMATION_MESSAGE );
                                Jugador jugador = new Jugador(usuName, 0);
                                jugadors.add(jugador);
                            }
                        }

                    //}
                    conexion.close();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }




            }
        });
    }
}
