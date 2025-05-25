public class Producto {

    private String referencia, nombre;
    private double precio;

    private GestioProductos gestioProductos;

    public Producto(String referencia, String nombre, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public GestioProductos getGestioProductos() {
        return gestioProductos;
    }

    public void setGestioProductos(GestioProductos gestioProductos) {
        this.gestioProductos = gestioProductos;
    }
}
