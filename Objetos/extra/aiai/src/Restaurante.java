
public class Restaurante {
    private String nombre;
    private boolean estrellaMichelin;
    private double precioMedio;
    private Valoracion[] valoraciones;
    private int numValoraciones;

    public Restaurante(String nombre, double precioMedio, boolean estrellaMichelin) {
        this.nombre = nombre;
        this.precioMedio = precioMedio;
        this.estrellaMichelin = estrellaMichelin;
        this.valoraciones = new Valoracion[10];
        this.numValoraciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getEstrellaMichelin() {
        return estrellaMichelin;
    }

    public double valoracionMedia() {
        if (numValoraciones == 0) return 0;
        int suma = 0;
        for (int i = 0; i < numValoraciones; i++) {
            suma += valoraciones[i].getPuntuacion();
        }
        return (double) suma / numValoraciones;
    }

    public void addValoracion(Valoracion valoracion) {
        if (numValoraciones < 10) {
            valoraciones[numValoraciones] = valoracion;
            numValoraciones++;
        } else {
            System.out.println("No se pueden agregar mas valoraciones a este restaurante.");
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", estrellaMichelin=" + estrellaMichelin +
                ", precioMedio=" + precioMedio +
                ", valoracionMedia=" + valoracionMedia() +
                '}';
    }
}