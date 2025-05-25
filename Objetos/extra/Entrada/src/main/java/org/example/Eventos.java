package org.example;

public class Eventos {
    private int id;
    private String nombre;
    private double precio;
    private int entradas_disponibles;

    public Eventos(int id, String nombre, double precio, int entradas_disponibles) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.entradas_disponibles = entradas_disponibles;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEntradas_disponibles() {
        return entradas_disponibles;
    }

    public void setEntradas_disponibles(int entradas_disponibles) {
        this.entradas_disponibles = entradas_disponibles;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", entradas_disponibles=" + entradas_disponibles +
                '}';
    }
}
