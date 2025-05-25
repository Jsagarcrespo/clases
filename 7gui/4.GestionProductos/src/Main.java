import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GestioProductos> gestioProductos = new ArrayList<>();

        JFrame frame = new JFrame("VVGestion");
        frame.setContentPane(new VVGestion().priPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}