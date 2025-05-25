import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VGestion {
    private JTextField ref;
    private JTextField prec;
    private JTextField nom;
    private JButton limpiarButton;
    private JButton guardar;
    private JButton listadoButton;
    private JPanel panel1;
    JPanel panelgrande;



    GestionProductos gestionProductos = new GestionProductos();
    //static List<Producto> productos = new ArrayList<>();

    public VGestion() {
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prec.setText("");
                nom.setText("");
                ref.setText("");
            }
        });


        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String referencia = String.valueOf(ref.getText());
                String nombre = String.valueOf(nom.getText());
                double precio = Double.parseDouble(prec.getText());

                if (referencia != null && !referencia.isEmpty() && nombre != null && !nombre.isEmpty() && precio > 0){
                    Producto producto = new Producto(referencia, nombre, precio);
                    // con esto sustituimos el add en vez de poner aqui la linea 20, en el objeto gestionProducto se gestiona.
                    gestionProductos.nuevo(producto);

                    // Si quiseramos esta version tendriamos que quitar el static en getProductos de gestionProductos.java
                    // gestionProductos.getProductos().add(producto);

                    //productos.add(producto);

                    JOptionPane.showMessageDialog(null,
                            "Producto añadido correctamente: ",
                            "Nuevo producto",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Falta de llenar un campo ",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }


            }
        });

        listadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("VGestion");
                        frame.setContentPane(new Listado(gestionProductos).Listado); // Llamamos a la funcion de listado que se ha creado, pasamos el parametro y despues el Nombre que se le ha dado al JPanel
                        frame.pack();
                        frame.setVisible(true);
            }
        });
    }



}
