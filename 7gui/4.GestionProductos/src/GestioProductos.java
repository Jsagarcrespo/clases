import java.util.ArrayList;
import java.util.List;

public class GestioProductos {

    public List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void nuevo(Producto producto) {
        productos.add(producto);
    }

    public String listado(){
        String resultado = "";

        for (Producto prod : productos) {
            resultado += prod.getReferencia() + " " +
                    prod.getNombre() + " " +
                    prod.getPrecio() + "\n";
        }
        return resultado;

    }




}
