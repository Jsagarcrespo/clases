public class Coche {

    private String marca, modelo;
    private int color;

    //vincular con Motor
    private Motor[] motor;

    //vincular con Rueda
    // La razon por la que lo voy a coger como un array es porque voy a crear bocles en el main para guardar
    // el diametrode cada rueda
    private Rueda[] rueda;

    //vincular con Puerta
    private Puerta[] puerta;

    public Coche(String marca, String modelo, int color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

        // no olvidarse de esta parte porque si no nos puede reflejar en el codigo que "NullPointerException"
        // Es necesarion inicializarlo antes de usarlo para que no de error
        rueda = new Rueda[4];
        motor = new Motor[2];
        puerta = new Puerta[5];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public void setMotor(Motor[] motor) {
        this.motor = motor;
    }

    public Rueda[] getRueda() {
        return rueda;
    }

    public void setRueda(Rueda[] rueda) {
        this.rueda = rueda;
    }

    public Puerta[] getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta[] puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                '}';
    }
}
