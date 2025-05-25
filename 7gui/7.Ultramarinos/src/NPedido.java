import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class NPedido {
    private JTextField unidadesTextF;
    private JTextField fechaTextF;
    private JButton guardarButton;
    JPanel Npedido;

    // primer paso
    private JList<Producto> productoList;
    private JList<Cliente> listCliente;

    // segundo paso
    private DefaultListModel<Cliente> clienteModel;
    private DefaultListModel<Producto> productoModel;


    int cont = 0;



    public NPedido(List<Cliente> clientes, List<Producto> productos, List<Pedido> pedidos) {

        // Tercer paso
        listCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // vale hay que tener cuidado: setSelectionModel no es lo mismo que setSelectionMode, la "l" del final nos la puede jugar
        productoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Cuarto paso
        clienteModel = new DefaultListModel<>();
        productoModel = new DefaultListModel<>();

        listCliente.setModel(clienteModel);
        productoList.setModel(productoModel);

        // Quinto paso
        for (Cliente cliente : clientes) {
            clienteModel.addElement(cliente);
        }

        for (Producto producto : productos) {
            productoModel.addElement(producto);
        }


        // todo esto va a ser antes de darle a guardar




        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            Cliente clienteSelecionado =  listCliente.getSelectedValue();
            Producto productoSelecionado = productoList.getSelectedValue();

            int unidad = Integer.parseInt(unidadesTextF.getText());
            String fecha = String.valueOf(fechaTextF.getText());



            if (unidad > 0 && !fecha.isEmpty() && clienteSelecionado != null && productoSelecionado != null){
                Pedido pedido = new Pedido(cont, unidad, fecha, clienteSelecionado, productoSelecionado);
                pedidos.add(pedido);
                clienteSelecionado.getPedidos().add(pedido);
                productoSelecionado.getPedidos().add(pedido);
                cont ++;
                JOptionPane.showMessageDialog(null,
                        "Pedido añadido "  ,
                        "ok",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Tienes rellenar todos los campos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }



            }
        });
    }
}
