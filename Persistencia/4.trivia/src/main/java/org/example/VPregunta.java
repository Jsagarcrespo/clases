package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VPregunta {
    private JTextField lasPreguntas;
    private JComboBox lasRespuestas;
    private JButton siguienteButton;
    private JPanel panlePregutas;

    private List<Pregunta> preguntas = new ArrayList<>();





    public VPregunta() throws SQLException {

        Connection conexion = DriverManager.getConnection("jdbc:sqlite:Mydb.db");
        Statement stat = conexion.createStatement();
        ResultSet rsQ = stat.executeQuery("select ID, Pregunta from Preguntas");

        while (rsQ.next()) {
            int id = rsQ.getInt("id");
            String texto = rsQ.getString("Pregunta");

            Pregunta pregunta = new Pregunta(id, texto);

            PreparedStatement stmtResp = conexion.prepareStatement("select Texto, Correcto from Respuestas where ID_Pregunta = ?");
            stmtResp.setInt(1, id);
            ResultSet rsAnsw = stmtResp.executeQuery();

            while (rsAnsw.next()) {
                String textoResp = rsAnsw.getString("Texto");
                boolean correcta = rsAnsw.getBoolean("Correcto");

                pregunta.getRespuestas().add(new Respuesta(textoResp, correcta, pregunta));
            }
            preguntas.add(pregunta);
        }
        actualizarPregunta();
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // lasPreguntas.setEditable(false);

                actualizarPregunta();

                    //preguntas.add(pregunta);
                }






        });
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("VPregunta");
        frame.setContentPane(new VPregunta().panlePregutas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    private void actualizarPregunta() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(preguntas.size());

        // Seleccionamos la pregunta aleatoria
        Pregunta preguntaselec = preguntas.get(indiceAleatorio);

        // Asignamos el texto de la pregunta al JTextField
        lasPreguntas.setText(preguntaselec.getTexto());

        // Limpiamos y rellenamos el JComboBox con las respuestas
        lasRespuestas.removeAllItems();
        for (Respuesta respuesta : preguntaselec.getRespuestas()) {
            lasRespuestas.addItem(respuesta.getTexto());
        }
    }





}
