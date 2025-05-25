import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VFicha {
    private JTextField Nom;
        private JTextField Tel;
        private JTextField Em;
        private JButton atras;
        private JTextField numActual;
        private JTextField total;
        private JButton alante;
        JPanel Vficha;




    int contacto = 0;



    public VFicha(Agenda agenda) {

        Nom.setEditable(false);
        Tel.setEditable(false);
        Em.setEditable(false);
        numActual.setEditable(false);
        total.setEditable(false);


        // Con esto estableceremos en que contacto vamos a empezar, con lo que siempre emepzaremos por el primer contacto
        if (agenda.numContactos() > 0){
            Nom.setText(agenda.contactos.get(contacto).getNombre()); // Mirar que el list de contactos en Agenda no sea privado porque si no no vamos a poder acceder
            Tel.setText(agenda.contactos.get(contacto).getTelefono());
            Em.setText(agenda.contactos.get(contacto).getEmail());
            numActual.setText(String.valueOf( contacto+ 1));
            total.setText(String.valueOf(agenda.numContactos()));

        }


        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contacto > 0){
                    contacto --;
                    Nom.setText(agenda.contactos.get(contacto).getNombre()); // Mirar que el list de contactos en Agenda no sea privado porque si no no vamos a poder acceder
                    Tel.setText(agenda.contactos.get(contacto).getTelefono());
                    Em.setText(agenda.contactos.get(contacto).getEmail());

                    numActual.setText(String.valueOf( contacto + 1 ));

                }
            }
        });
        alante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (agenda.numContactos() - 1 > contacto){
                    contacto ++;
                    Nom.setText(agenda.contactos.get(contacto).getNombre()); // Mirar que el list de contactos en Agenda no sea privado porque si no no vamos a poder acceder
                    Tel.setText(agenda.contactos.get(contacto).getTelefono());
                    Em.setText(agenda.contactos.get(contacto).getEmail());

                    numActual.setText(String.valueOf( contacto + 1 ));

                }
            }

        });


    }





}
