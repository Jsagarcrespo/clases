import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPrincipal {
    private JButton nuevoContactoButton;
    private JButton verContactosButton;
    private JButton buscarButton;
    JPanel VentaPrincipal;

    Agenda agenda = new Agenda();

    public VPrincipal() {
        nuevoContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VNuevo");
                frame.setContentPane(new VNuevo(agenda).Vnuevo); //No me dejaba proque lo tenia privado el JPanel en VNuevo.java
                frame.pack();
                frame.setVisible(true);
            }
        });

        verContactosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VFicha");
                frame.setContentPane(new VFicha(agenda).Vficha);
                frame.pack();
                frame.setVisible(true);
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("VBuscar");
                frame.setContentPane(new VBuscar(agenda).BuscaPanelTocho);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


}
