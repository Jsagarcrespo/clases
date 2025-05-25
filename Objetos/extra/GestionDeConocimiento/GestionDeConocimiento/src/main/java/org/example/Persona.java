package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private double CosteH;
    private LocalDate Fecha;
    private boolean disponible;

    public Persona(String nombre, LocalDate fecha, double costeH, boolean disponible) {
        this.nombre = nombre;
        Fecha = fecha;
        CosteH = costeH;
        this.disponible = disponible;
        temas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosteH() {
        return CosteH;
    }

    public void setCosteH(double costeH) {
        CosteH = costeH;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    private List<Tema> temas = new ArrayList<>();

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", CosteH=" + CosteH +
                ", Fecha=" + Fecha +
                ", disponible=" + disponible +
                '}';
    }
}
