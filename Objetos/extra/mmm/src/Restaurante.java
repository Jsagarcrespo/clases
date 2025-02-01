public class Restaurante {
    private String nombre;
    private boolean estrella = false;
    private double precioMedio;
    private int contador;
    Valoracion[] valoraciones = new Valoracion[10];

    public Restaurante(String nombre, boolean estrella, double precioMedio) {
        this.nombre = nombre;
        this.estrella = estrella;
        this.precioMedio = precioMedio;
        this.valoraciones = new Valoracion[10];
        this.contador = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstrella() {
        return this.estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public double getPrecioMedio() {
        return this.precioMedio;
    }

    public void setPrecioMedio(double precioMedio) {
        this.precioMedio = precioMedio;
    }

    public void agregarVal(Valoracion valoracion) {
        if (this.contador < this.valoraciones.length) {
            this.valoraciones[this.contador] = valoracion;
            ++this.contador;
        } else {
            System.out.println("No se puede agregar mas");
        }

    }

    public double calcularValoracionMedia() {
        if (this.contador == 0) {
            return 0.0;
        } else {
            int suma = 0;

            for(int i = 0; i < this.contador; ++i) {
                suma += this.valoraciones[i].getPuntuacion();
            }

            return (double)suma / (double)this.contador;
        }
    }

    public Valoracion[] getValoraciones() {
        return this.valoraciones;
    }

    public void setValoraciones(Valoracion[] valoraciones) {
        this.valoraciones = valoraciones;
    }
}
