import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel panel1;
    private JPanel log;
    private JTextField usu;
    private JTextField pass;
    private JButton entrarButton;


    public Login() {
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = String.valueOf(usu.getText());
                String usuar = "admin";
                String contraseina = pass.getText();
                String passwd = "admin";

                if (usuario.isEmpty() || contraseina.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Te falta un area por rellenar", "Título", JOptionPane.ERROR_MESSAGE);
                }

                if (usuario.equals(usuar) && contraseina.equals(passwd)) {
                    JOptionPane.showMessageDialog(null, "Has introducido bien la contraseña", "Título", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Título", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
