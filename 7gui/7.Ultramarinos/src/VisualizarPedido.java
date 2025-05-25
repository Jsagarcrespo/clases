import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class VisualizarPedido {

    private JTable tablePedido;
    JPanel panelPedido;

    private JList<Cliente> listCliente;

     public VisualizarPedido(List<Pedido> pedidos, List<Cliente> clientes){
         DefaultListModel<Cliente> clienteDefaultListModel = new DefaultListModel<>();
         clienteDefaultListModel.clear();

        for (Cliente cliente : clientes) {
            clienteDefaultListModel.addElement(cliente);
        }
        listCliente.setModel(clienteDefaultListModel);

        //tablePedido.setModel(new TablasPedidoModel());


         listCliente.addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 Cliente c = listCliente.getSelectedValue();

                 if (c != null){
                     tablePedido.setModel(new TablasPedidoModel(c.getPedidos()));
                 }
             }
         });
     }


}
