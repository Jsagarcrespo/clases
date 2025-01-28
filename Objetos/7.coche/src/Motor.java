public class Motor {

    private boolean arrancado;
    private int potencia, cilindrada;
    private String combustible;

    //vincular con Coche
    private Coche coche;

    public boolean arrancar(){
        return arrancado = true;
    }

    public boolean parar(){
        return arrancado = false;
    }

    public Motor(boolean arrancado, int potencia, int cilindrada, String combustible, Coche coche) {
        this.arrancado = arrancado;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.coche = coche;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "arrancado=" + arrancado +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                ", coche=" + coche +
                '}';
    }
}
