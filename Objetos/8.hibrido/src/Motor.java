public class Motor {

    // Necesario poner en protegido para que luego podamos usar el toString en las herencias de Motor
    protected boolean arrancado;
    protected int potencia;


    public Motor(boolean arrancado, int potencia) {
        this.arrancado = arrancado;
        this.potencia = potencia;
    }

    public Motor() {

    }

    public void isArrancado(){
        arrancado = true;
    }

    public void parar(){

        arrancado = false;
    }

    private Coche coche;

    @Override
    public String toString() {
        return "Motor{" +
                "arrancado=" + arrancado +
                ", potencia=" + potencia //
                // Esta parte si la agregamos y la llamamos para printear nos dara null, ya que en el constructor no lo llamamos
                // +
                // ", coche=" + coche +
                // '}'
                ;
    }
}
