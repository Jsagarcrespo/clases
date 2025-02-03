public class Vehiculo implements Vendible {
    protected String marca, modelo;
    protected int anio;
    protected double precio;
    private TiendaSingleton tiendaSingleton;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(String marca, String modelo, int anio, double precio, TipoVehiculo tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TiendaSingleton getTiendaSingleton() {
        return tiendaSingleton;
    }

    public void setTiendaSingleton(TiendaSingleton tiendaSingleton) {
        this.tiendaSingleton = tiendaSingleton;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void vendible() {

    }
}
