package org.example;

public class Trayecto {
    private int id;
    private Ciudad origen;
    private Ciudad destino;
    private String hora;
    private double precio;
    private int plazas;

    public Trayecto(Ciudad origen, Ciudad destino, String hora, double precio, int plazas) {
        this.id = -1;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.precio = precio;
        this.plazas = plazas;
    }

    public Trayecto(int id, Ciudad origen, Ciudad destino, String hora, double precio, int plazas) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.precio = precio;
        this.plazas = plazas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return
                "origen=" + origen +
                ", destino=" + destino +
                ", hora='" + hora + '\'' +
                ", precio=" + precio +
                ", plazas=" + plazas +
                '}';
    }
}
