package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        List <Eventos> eventos = new ArrayList<>();


        //  POR SI QUERIA VISUALIZARLO POR UN MOMENTO
        /*System.out.println("que es lo que pasa");
        GestorDB  gestorDB = new GestorDB() ;
        gestorDB.cargarEventos();


        for (Eventos evento : gestorDB.getEventos()){
            System.out.println("entradas disponibles " + evento);
        }*/


        JFrame frame = new JFrame("VPrincipal");
        frame.setContentPane(new VPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }


}