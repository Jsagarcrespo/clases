import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TablasPedidoModel extends AbstractTableModel {

    private String[] columnas = {"ID", "FECHA", "CANTIDAD", "PRODUCTO"};

    private List<Pedido> pedidos;

    public TablasPedidoModel(List<Pedido> pedidos) {
        this.pedidos = pedidos; // importante
    }

    public TablasPedidoModel() {
        this.pedidos = new ArrayList<>(); // importante

    }

    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido e = pedidos.get(rowIndex);

        switch (columnIndex){
            case 0:
                return e.getId();

            case 1:
                return e.getFecha();

            case 2:
                return e.getCantidad();

            case 3:
                return e.getProductos().getNombre();

        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    /* @Override
    public String getColumName(int column) {
        return column[column];
    }*/
}
