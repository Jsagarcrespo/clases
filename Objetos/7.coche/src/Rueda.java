public class Rueda {

    private String diametro;

    //vincular con coche
    private Coche coche;

    public Rueda(String diametro, Coche coche) {
        this.diametro = diametro;
        this.coche = coche;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro='" + diametro + '\'' +
                ", coche=" + coche +
                '}';
    }
}
