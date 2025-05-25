import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id, cantidad;
    private String fecha;

    public Pedido(int id, int cantidad, String fecha, Cliente clientes, Producto productos) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.clientes = clientes;
        this.productos = productos;

    }

    private Cliente clientes;
    private Producto productos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }
}
