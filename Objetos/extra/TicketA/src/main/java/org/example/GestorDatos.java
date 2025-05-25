package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    private List<Ciudad> ciudades = new ArrayList<>();
    private List<Trayecto> trayectos = new ArrayList<>();

    public GestorDatos() {
        leerCiudades();
        leerTrayectos();
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public List<Trayecto> getTrayectos() {
        return trayectos;
    }

    public void leerCiudades() {
        String cadenaConexion = "jdbc:sqlite:ticketbus.db";

        try {
            Connection conexion = DriverManager.getConnection(cadenaConexion);

            String sql = "SELECT * FROM ciudades";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Ciudad ciudad = new Ciudad(rs.getInt("id"), rs.getString("nombre"));
                ciudades.add(ciudad);
            }

            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al leer las ciudades desde la bd...");
        }
    }

    private void leerTrayectos() {
        String cadenaConexion = "jdbc:sqlite:ticketbus.db";

        try {
            Connection conexion = DriverManager.getConnection(cadenaConexion);

            String sql = "SELECT * FROM trayectos";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Ciudad origen = buscarCiudad(rs.getInt("ciudad_origen_id"));
                Ciudad destino = buscarCiudad(rs.getInt("ciudad_destino_id"));

                Trayecto trayecto = new Trayecto(rs.getInt("id"), origen, destino, rs.getString("hora"), rs.getDouble("precio"), rs.getInt("plazas"));

                trayectos.add(trayecto);
                origen.getTrayectos().add(trayecto);
                destino.getTrayectos().add(trayecto);
            }

            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al leer los trayectosd desde la bd...");
        }
    }

    private Ciudad buscarCiudad(int id) {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getId() == id) {
                return ciudad;
            }
        }

        return null;
    }
}
