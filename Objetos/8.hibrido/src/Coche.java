
public class Coche {
    private String marca, modelo;
    private int color;

    private Rueda[] rueda;
    private Puerta[] puerta;
    private Motor motor;


    public Coche(String marca, String modelo, int color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

        rueda = new Rueda[4];
        puerta = new Puerta[5];

    }

    public Coche(String marca, String modelo, int color, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
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

    public Motor getMotor() {
        // para que no me salte NullPointerException
        // Si no, no nos deja invokar Motor.isArrancado() porque el valor de retorno es nulo
        if (motor == null){
            // Tengo creado dos contructores para que en este no necesite meter valores
            // Hay otro para la ora de imprimir por pantalla
             motor = new Motor();
        }

        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", motor[=" + motor +
                '}';
    }
}
