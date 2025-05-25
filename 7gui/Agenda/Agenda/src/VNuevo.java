import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VNuevo {
    private JTextField nom;
    private JTextField tel;
    private JTextField em;
    private JButton limpiarButton;
    private JButton guardarButton;
    JPanel Vnuevo; // Si quiero poder usarlo en Vprincipal.java quitarle el private para que pueda acceder

    public VNuevo(Agenda agenda) { //Importante que le añada Agenda para hacer referencia al objeto
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nom.setText("");
                tel.setText("");
                em.setText("");
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = String.valueOf(nom.getText());
                String telefono = String.valueOf(tel.getText());
                String email = String.valueOf(em.getText());

                if (nombre != null && !nombre.isEmpty() && telefono != null && !telefono.isEmpty() && email != null && !email.isEmpty()){
                    Contacto contacto = new Contacto(nombre, telefono, email);
                    agenda.nuevo(contacto);
                    JOptionPane.showMessageDialog(null,
                            "Contacto añadido con exito",
                            "exito",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Rellena todos los campos",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
