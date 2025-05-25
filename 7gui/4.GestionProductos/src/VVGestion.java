import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VVGestion {
    JPanel priPanel;
    private JTextField ref;
    private JTextField nom;
    private JTextField prec;
    private JButton limpiarButton;
    private JButton guardarButton;
    private JButton listadoButton;
    private JPanel products;
    private JPanel botons;

    List<Producto> productos = new ArrayList<>();
    GestioProductos gestionProductos = new GestioProductos();

 public VVGestion() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String referencia = String.valueOf(ref.getText());
                String nobmre = String.valueOf(nom.getText());
                Double precio = Double.parseDouble(prec.getText());
            }
        });
        listadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VList");
                frame.setContentPane(new VList(gestionProductos).panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
