package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PiedraPapelTijera {
    private JButton piedraButton;
    private JButton pepelButton;
    private JButton tijeraButton;
    private JTextField Ordenador;
    private JPanel PiedraPaple;
    private String ValorUsu;
    private String[] valoresPC = {"Piedra", "Papel", "Tijera"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("PiedraPapelTijera");
        frame.setContentPane(new PiedraPapelTijera().PiedraPaple);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private PiedraPapelTijera() {

        piedraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ValorUsu = "Piedra";
                Random RandomPC = new Random();
                int ind = RandomPC.nextInt(valoresPC.length);
                String Rpc = valoresPC[ind];


                String resultado = "";
                if (Rpc.equals("Papel")) {
                    resultado = "Pierdes";
                } else if (Rpc.equals("Tijera")) {
                    resultado = "Ganas";
                } else {
                    resultado = "Empate";
                }

                // Leer JSON actual
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Resultado resultado1 = new Resultado();

                File jsonFile = new File("totales.json");

                if (jsonFile.exists()) {
                    try (Reader reader = new FileReader(jsonFile, StandardCharsets.UTF_8)) {
                        resultado1 = gson.fromJson(reader, Resultado.class);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                if (resultado.equals("Ganas")) {
                    resultado1.usuario++;
                } else if (resultado.equals("Pierdes")) {
                    resultado1.ordenador++;
                }

                try (Writer writer = new FileWriter(jsonFile, StandardCharsets.UTF_8)) {
                    gson.toJson(resultado1, writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                // Mostrar en campo de texto
                Ordenador.setText("PC: " + Rpc + " — " + resultado);


            }
        });
        pepelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValorUsu = "Papel";
                Random RandomPC = new Random();
                int ind = RandomPC.nextInt(valoresPC.length);
                String Rpc = valoresPC[ind];

                String resultado = "";
                if (Rpc.equals("Tijera")) {
                    resultado = "Pierdes";
                } else if (Rpc.equals("Piedra")) {
                    resultado = "Ganas";
                } else {
                    resultado = "Empate";
                }

                // Leer JSON actual
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Resultado resultado1 = new Resultado();

                File jsonFile = new File("totales.json");

                if (jsonFile.exists()) {
                    try (Reader reader = new FileReader(jsonFile, StandardCharsets.UTF_8)) {
                        resultado1 = gson.fromJson(reader, Resultado.class);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                if (resultado.equals("Ganas")) {
                    resultado1.usuario++;
                } else if (resultado.equals("Pierdes")) {
                    resultado1.ordenador++;
                }

                try (Writer writer = new FileWriter(jsonFile, StandardCharsets.UTF_8)) {
                    gson.toJson(resultado1, writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                // Mostrar en campo de texto
                Ordenador.setText("PC: " + Rpc + " — " + resultado);


            }
        });

        tijeraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValorUsu = "Tijera";

                Random RandomPC = new Random();
                int ind = RandomPC.nextInt(valoresPC.length);
                String Rpc = valoresPC[ind];

                String resultado = "";
                if (Rpc.equals("Piedra")) {
                    resultado = "Pierdes";
                } else if (Rpc.equals("Papel")) {
                    resultado = "Ganas";
                } else {
                    resultado = "Empate";
                }

                // Leer JSON actual
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Resultado resultado1 = new Resultado();

                File jsonFile = new File("totales.json");

                if (jsonFile.exists()) {
                    try (Reader reader = new FileReader(jsonFile, StandardCharsets.UTF_8)) {
                        resultado1 = gson.fromJson(reader, Resultado.class);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                if (resultado.equals("Ganas")) {
                    resultado1.usuario++;
                } else if (resultado.equals("Pierdes")) {
                    resultado1.ordenador++;
                }

                try (Writer writer = new FileWriter(jsonFile, StandardCharsets.UTF_8)) {
                    gson.toJson(resultado1, writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                // Mostrar en campo de texto
                Ordenador.setText("PC: " + Rpc + " — " + resultado);

            }
        });


    }


}



