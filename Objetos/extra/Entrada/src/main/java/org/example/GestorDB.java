package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class GestorDB {


    private List<Eventos> eventos = new ArrayList<>();


    public void cargarEventos() {
        try {
            String cadenaConexion = "jdbc:sqlite:entradas.db";
            Connection conexion = DriverManager.getConnection(cadenaConexion);


            String sql = "SELECT * FROM eventos";

            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Eventos evento = new Eventos(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("entradas_disponibles")
                );
                eventos.add(evento);
            }

            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al leer la base de datos de los eventos");
        }
    }

    public void actualizarEntradasDisponibles(int idEvento, int nuevaCantidad) throws SQLException {

        String cadenaConexion = "jdbc:sqlite:entradas.db";
        Connection conexion = DriverManager.getConnection(cadenaConexion);
        String query = "UPDATE eventos SET entradas_disponibles = ? WHERE id = ?";

        PreparedStatement pstmt = conexion.prepareStatement(query);

        pstmt.setInt(1, nuevaCantidad);
        pstmt.setInt(2, idEvento);
        pstmt.executeUpdate();

        int filaModificada = pstmt.executeUpdate();

        if (filaModificada > 1) {
            System.out.println("Actualizado correctamente");
            pstmt.close();
        }

    }

    public GestorDB(){
        cargarEventos();
        }

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }
}


