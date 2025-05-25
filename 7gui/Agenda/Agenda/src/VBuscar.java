import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VBuscar {
    JPanel BuscaPanelTocho;
    private JComboBox comboBox1;
    private JTextField busqueda;
    private JButton buscarButton;
    private JTextField name;
    private JTextField phone;
    private JTextField mail;



    public VBuscar(Agenda agenda) {

        name.setEditable(false);
        phone.setEditable(false);
        mail.setEditable(false);




        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion = (String) comboBox1.getSelectedItem();
                Contacto contacto = agenda.bucar(busqueda.getText(), CampoBusqueda.valueOf(opcion));


                if (contacto != null){
                    name.setText(contacto.getNombre());
                    phone.setText(contacto.getTelefono());
                    mail.setText(contacto.getEmail());

                }

            }
        });
    }




}
