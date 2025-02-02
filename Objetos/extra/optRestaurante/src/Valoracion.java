public class Valoracion {

    private String texto;
    private int puntuacion;
    private Restaurante restaurante;

    public Valoracion(int puntuacion, String texto, Restaurante restaurante) {
        this.puntuacion = puntuacion;
        this.texto = texto;
        this.restaurante = restaurante;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Valoracion{" +
                "texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
