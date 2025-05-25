import javax.swing.*;
import java.awt.*;

public class Listado {
    private JTextArea textArea1;
    JPanel Listado;

    public Listado(GestionProductos gestionProductos){
        textArea1.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea1.append(String.format("%-15s %-20s %-10s\n", "Referencia", "Nombre", "Precio"));
        textArea1.append(String.format(gestionProductos.listado()));
    }




}
