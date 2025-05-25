import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class principal {
    private JTextField prod;
    private JTextField un;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JTextArea textArea1;

    static List<Item> items = new ArrayList<>();

    public principal() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = String.valueOf(prod.getText());
                int unidades = Integer.parseInt(un.getText());

                if (producto != null && !producto.isEmpty() && unidades > 0){
                    items.add(new Item(producto, unidades));


                }


            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
