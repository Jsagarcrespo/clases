package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
        personas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int numExpertosDisponible() {
        int numeroExp = 0;
        for (int i = 0; i < personas.size(); i++) {
            numeroExp = numeroExp + 1;

        }
        return numeroExp;
    }

    private List<Persona> personas = new ArrayList<>();

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
