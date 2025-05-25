import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NNNPedido {
    
    private JTextField uniText;
    private JTextField precText;
    private JButton guardarButton;
    
    
    private JList<Cliente> listClientes;
    private JList<Producto> listProductos;
    
    private DefaultListModel<Cliente> clienteDefaultListModel; 
    private DefaultListModel<Producto> productoDefaultListModel; 
    
    
    public NNNPedido() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                listClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
            }
        });
    }
}
