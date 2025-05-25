import javax.swing.*;
import java.awt.*;

public class VList {
    private JTextArea textArea1;
    JPanel panel1;

    public VList(GestioProductos gestioProductos){
        textArea1.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea1.append(String.format("%-15s %-20s %-10s\n", "Referencia", "Nombre", "Precio"));
        textArea1.append(String.format(gestioProductos.listado()));
    }
}
