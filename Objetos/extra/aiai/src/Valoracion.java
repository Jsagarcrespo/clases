public class Valoracion {
    private String texto;
    private int puntuacion;
    private Restaurante restaurante;

    public Valoracion(int puntuacion, String texto, Restaurante restaurante) {
        this.puntuacion = puntuacion;
        this.texto = texto;
        this.restaurante = restaurante;
        restaurante.addValoracion(this);
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Valoracion{" +
                "texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", restaurante=" + restaurante.getNombre() +
                '}';
    }
}