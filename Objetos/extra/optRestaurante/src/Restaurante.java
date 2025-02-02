public class Restaurante {

    private String nombre;
    private boolean estrellaMichelin;
    private double precioMedio;
    private int numValoraciones;
    private Valoracion[] valoracion;

    public Restaurante(String nombre, double precioMedio, boolean estrellaMichelin) {
        this.nombre = nombre;
        this.precioMedio = precioMedio;
        this.estrellaMichelin = estrellaMichelin;
        this.valoracion = new Valoracion[10];
        this.numValoraciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(double precioMedio) {
        this.precioMedio = precioMedio;
    }

    public Valoracion[] getValoracion() {
        return valoracion;
    }

    public boolean getEstrellaMichelin() {
        return estrellaMichelin;
    }

    public void setEstrellaMichelin(boolean estrellaMichelin) {
        this.estrellaMichelin = estrellaMichelin;
    }

    public void agValoracion(Valoracion val) {
        if (this.numValoraciones < 10) {
            this.valoracion[this.numValoraciones] = val;
            this.numValoraciones++;
        } else {
            System.out.println("No se pueden agregar más valoraciones");
        }
    }

    public double valoracionMedia() {
        if (numValoraciones == 0) return 0;
        int suma = 0;
        for (int i = 0; i < this.numValoraciones; i++) {
            suma += this.valoracion[i].getPuntuacion();
        }
        return (double) suma / numValoraciones;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", estrellaMichelin=" + estrellaMichelin +
                ", precioMedio=" + precioMedio +
                '}';
    }
}
