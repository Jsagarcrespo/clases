public class TiendaSingleton {

    private TiendaSingleton instanacia;
    private int numVehiculos;
    private int contador;
    private Vehiculo[] vehiculo;

    public TiendaSingleton(TiendaSingleton instanacia, int numVehiculos, Vehiculo[] vehiculo) {
        this.instanacia = instanacia;
        this.numVehiculos = numVehiculos;
        this.vehiculo = new Vehiculo[10];
        this.contador = 0;

    }

    private static TiendaSingleton instancia;

    public static TiendaSingleton getInstanacia() {
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





    public void añadirVehiculo(Vehiculo ve){
        if (this.contador < 10){
            this.vehiculo[this.contador] = ve;
            this.contador++;
        }
    }

    public void listarVehiculos(){
        for (int i = 0; i < this.contador; i++) {
            System.out.println(vehiculo[i]);
        }
    }

}
