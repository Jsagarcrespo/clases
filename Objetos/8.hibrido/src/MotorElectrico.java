// Recordar poner el extends para poder acceder a los atributos de Motor
public class MotorElectrico extends Motor {

    private String tipobateria;

    public MotorElectrico(boolean arrancado,  int potencia, String tipobateria) {
        super(arrancado, potencia);
        this.tipobateria = tipobateria;
    }

    public String getTipobateria() {
        return tipobateria;
    }

    public void setTipobateria(String tipobateria) {
        this.tipobateria = tipobateria;
    }

    @Override
    public String toString() {
        return "MotorElectrico{" +
                "tipobateria='" + tipobateria + '\'' +
                ", potencia=" + potencia +
                ", arrancado=" + arrancado +
                '}';
    }
}
