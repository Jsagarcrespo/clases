public class Coche extends Vehiculo{

    private int numPuertas;

    public Coche(String marca, String modelo, int anio, double precio, TipoVehiculo tipoVehiculo, boolean vender, int numPuertas) {
        super(marca, modelo, anio, precio, tipoVehiculo, vender);

        this.numPuertas = numPuertas;
    }
}
