import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private JButton nuevoProductoButton;
    private JButton nuevoPedidoButton;
    private JButton pedidosPorClienteButton;
    JPanel menu;

    List<Cliente> clientes = new ArrayList<>();
    List<Producto> productos = new ArrayList<>();
    List<Pedido> pedidos = new ArrayList<>();

    public Menu() {


        clientes.add(new Cliente(1, "Sagar"));
        clientes.add(new Cliente(2, "Misha"));
        clientes.add(new Cliente(3, "Laura"));
        clientes.add(new Cliente(4, "Fernando"));

        nuevoProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("NProducto");
                frame.setContentPane(new NProducto(productos).Nproducto);
                frame.pack();
                frame.setVisible(true);

            }
        });
        nuevoPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("NPedido");
                frame.setContentPane(new NPedido(clientes, productos, pedidos).Npedido);
                frame.pack();
                frame.setVisible(true);
            }
        });
        pedidosPorClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VisualizarPedido");
                frame.setContentPane(new VisualizarPedido(pedidos, clientes).panelPedido);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
