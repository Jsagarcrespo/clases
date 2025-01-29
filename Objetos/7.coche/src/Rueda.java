public class Rueda {

    private int diametro;

    //vincular con coche
    private Coche coche;

    public Rueda(int diametro) {
        this.diametro = diametro;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
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
                "diametro='" + diametro  +
                '}';
    }
}
