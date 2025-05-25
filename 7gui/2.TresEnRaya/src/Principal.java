import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4Button;
    private JButton bt5Button;
    private JButton bt6Button;
    private JButton bt7Button;
    private JButton bt8Button;
    private JButton bt9Button;
    private JPanel raya;
    private JButton limpiarButton;


    public Principal() {

        //
        MotorJuego.reset();

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                char simbolo = MotorJuego.tirada(0,0);
                bt1.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();

            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(0,1);
                bt2.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(0,2);
                bt3.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(1,0);
                bt4Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(1,1);
                bt5Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(1,2);
                bt6Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(2,0);
                bt7Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(2,1);
                bt8Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });

        bt9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char simbolo = MotorJuego.tirada(2,2);
                bt9Button.setText(String.valueOf(simbolo));
                MotorJuego.quienJuega();
            }
        });


       /* limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MotorJuego.limpiarTablero();

            }
        });*/
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().raya);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
