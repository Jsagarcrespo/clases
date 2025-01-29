public class Puerta {

    private boolean elvalunaElectrico;

    //vincular con Coche
    private Coche coche;

    public Puerta(boolean elvalunaElectrico) {
        this.elvalunaElectrico = elvalunaElectrico;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public boolean isElvalunaElectrico() {
        return elvalunaElectrico;
    }

    public void setElvalunaElectrico(boolean elvalunaElectrico) {
        this.elvalunaElectrico = elvalunaElectrico;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "elvalunaElectrico=" + elvalunaElectrico +
                '}';
    }
}
