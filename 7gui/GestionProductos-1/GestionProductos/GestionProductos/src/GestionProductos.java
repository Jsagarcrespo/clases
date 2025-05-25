import java.util.ArrayList;
import java.util.List;

public class GestionProductos {

    private static List<Producto> productos = new ArrayList<>();

    public static List<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(List<Producto> productos) {
        GestionProductos.productos = productos;
    }

    public void nuevo(Producto producto){
        productos.add(producto);
    }



    public String listado() {
        String resultado = "";

        for (Producto pr : productos){
            resultado += pr.getReferencia() + " " +
                    pr.getNombre() + " " +
                    pr.getPrecio() + "\n";
        }

        return resultado;
    }


}
