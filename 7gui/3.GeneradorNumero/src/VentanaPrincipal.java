import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JRadioButton factorialRadioButton;
    private JRadioButton primoRadioButton;
    private JRadioButton fibonacciRadioButton;
    private JTextField textField1;
    private JTextField fin;
    private JButton Generar;
    private JTextArea textArea1;
    private JButton Limpiar;
    private JPanel VentPrincipal;


    public VentanaPrincipal() {
        Generar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().VentPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
