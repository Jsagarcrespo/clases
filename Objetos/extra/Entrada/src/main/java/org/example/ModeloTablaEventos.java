package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeloTablaEventos extends AbstractTableModel {

    private String[] columnas = {"Nombre", "Precio", "Entradas disponibles"};

    private List<Eventos> eventos = new ArrayList<>();

    public ModeloTablaEventos(List<Eventos> eventos){
        this.eventos = eventos;
    }

    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Eventos e = eventos.get(rowIndex);
        switch (columnIndex){
            case 1:
                return e.getNombre();
            case 2:
                return e.getPrecio();
            case 3:
                return e.getEntradas_disponibles();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}
