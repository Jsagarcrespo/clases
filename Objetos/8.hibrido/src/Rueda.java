public class Rueda {
    private int diametro;
    private Coche coche;

    public Rueda(int diametro, Coche coche) {
        this.diametro = diametro;
        this.coche = coche;
    }

    public int getRueda() {
        return diametro;
    }

    public void setRueda(int rueda) {
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
                "diametro=" + diametro +
                ", coche=" + coche +
                '}';
    }
}
