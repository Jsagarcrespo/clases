public class Pelicula {
    private String titulo;
    private int anyo, duracion;
    private Genero genero;
    private Calificacion calificacion;

    public Pelicula(String titulo, int anyo, int duracion, Genero genero, Calificacion calificacion) {
        this.titulo = titulo;
        this.anyo = anyo;
        this.duracion = duracion;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyo=" + anyo +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", calificacion=" + calificacion +
                '}';
    }
}
