public class Valoracion {

    private String texto;
    private int puntuacion;

    // vincular con Restaurante
    private Restaurante[] restaurante;

    public Valoracion(int puntuacion, String texto, Restaurante restaurante) {
        this.puntuacion = puntuacion;
        this.texto = texto;
        this.restaurante = new  Restaurante[10];
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

    public Restaurante[] getRestaurante() {
        if (restaurante == null){
            restaurante = new Restaurante[10];
        }
        return restaurante;
    }

    public void setRestaurante(Restaurante[] restaurante) {
        this.restaurante = restaurante;
    }


    @Override
    public String toString() {
        return "Valoracion{" +
                "texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                /*", restaurante=" + Arrays.toString(restaurante) +*/
                '}';
    }
}
