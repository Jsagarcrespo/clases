// Recordar poner el extends para poder acceder a los atributos de Motor
public class MotorCombustionInterna extends Motor{

    private int cilindrada;
    private String combustible;

    public MotorCombustionInterna(int potencia, int cilindrada, String combustible, boolean arrancado) {

        // Causas por la que "super" puede dar error:
        // porque se te ha olvidado hacer la referencia al objeto padre con: extends
        // porque en super los atributos de Motor los pongar en otro orden en el constructor de Motor tenemos:
        // public Motor(boolean arrancado, int potencia), con lo que hay respetar eso
        super(arrancado, potencia);

        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }

    // No es necesario tenerlo porque parece ser que se puede inicializar con:  MotorCombustionInterna motorCombustionInterna ;
   // public MotorCombustionInterna(){}

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

    @Override
    public String toString() {
        return "MotorCombustionInterna{" +
                "cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +

                // No podremos acceder a estos dos si al menos no estan en proteceted en el objeto padre
                ", arrancado=" + arrancado +
                ", potencia=" + potencia +
                '}';
    }
}
