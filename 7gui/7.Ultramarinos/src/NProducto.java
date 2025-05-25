import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class NProducto {
    private JTextField NomText;
    private JTextField PrecioText;
    private JButton guardarButton;
    JPanel Nproducto;



    int cont = 0;

    public NProducto(List<Producto> productos) {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = String.valueOf(NomText.getText());
                double precio = Double.parseDouble(PrecioText.getText());

                Producto producto = new Producto(cont, nombre, precio);
                productos.add(producto);

                cont ++;

                NomText.setText("");
                PrecioText.setText("");
            }
        });
    }
}
