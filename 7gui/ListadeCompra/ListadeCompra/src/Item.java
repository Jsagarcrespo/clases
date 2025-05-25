public class Item {

    private String producto;
    private int unidades;

    public Item(String producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


}
