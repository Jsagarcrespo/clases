package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeloPaneInformativo extends AbstractTableModel {

    private String[] columnas= {"Origen", "Destino", "Hora", "Precio", "Plazas disponibles"};

    private List<Trayecto> trayectos = new ArrayList<>();

    public ModeloPaneInformativo(List<Trayecto> trayectos){
        this.trayectos = trayectos;
    }

    @Override
    public int getRowCount() {
        return trayectos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trayecto t = trayectos.get(rowIndex);

        switch (columnIndex){
            case 1:
                return t.getOrigen();
            case 2:
                return t.getDestino();
            case 3:
                return t.getHora();
            case 4:
                return t.getPrecio();
            case 5:
                return t.getPlazas();


        }
        return null;

    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    // ##### 3 #####
    // Añade el código necesario para que el modelo de tabla funcione como en la captura de pantalla (OK)

}

