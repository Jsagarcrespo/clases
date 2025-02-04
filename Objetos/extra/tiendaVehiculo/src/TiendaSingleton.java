public class TiendaSingleton {

    private TiendaSingleton instanacia;
    private int numVehiculos;
    private int contador;
    private Vehiculo[] vehiculo;

    //CREAR INSTANCIA
    private static TiendaSingleton instancia;

    public TiendaSingleton() {
        this.vehiculo = new Vehiculo[10];
        this.contador = 0;

    }
    public static TiendaSingleton getInstanacia() {
        if (instancia == null){
            instancia = new TiendaSingleton();
        }

        return instancia;
    }

    public void setInstanacia(TiendaSingleton instanacia) {
        this.instanacia = instanacia;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void anyadirVehiculo(Vehiculo ve){
        if (this.contador < 10){
            this.vehiculo[this.contador] = ve;
            this.contador++;
        }
    }

    public void listarVehiculos() {
        for (int i = 0; i < this.contador; i++) {
            vehiculo[i].vendible();
        }
    }


}
