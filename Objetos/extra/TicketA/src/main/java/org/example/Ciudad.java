package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private int id;
    private String nombre;

    private final List<Trayecto> trayectos = new ArrayList<>();

    public Ciudad(String nombre) {
        this.id = -1;
        this.nombre = nombre;
    }

    public Ciudad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Trayecto> getTrayectos() {
        return trayectos;
    }

    @Override
    public String toString() {
        return nombre ;
    }
}
