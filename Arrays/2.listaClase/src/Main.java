package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nombres;
        nombres = new String[3];
        String name;


        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Introduce nombre y apellido: ");
            name = br.readLine();
            nombres[i] = name;


        }

        String letra = " ";
        do {
            try {
                System.out.println("Introduce la primera letra: ");
                letra = br.readLine();
               /* boolean encontrado = false;*/

                for (String nombre : nombres) {
                    if (nombre.charAt(0) == letra.charAt(0)) {

                        System.out.println(nombre);
                        /*encontrado = true;*/

                    } else {
                        System.out.println("no encontrado");
                    }
                }

               /* if (!encontrado) {
                    System.out.println("No hay coincidencia");
                }*/


                if (letra.equalsIgnoreCase("fin")) {
                    System.out.println("Saliendo...");
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Introduce una letra campo vacio o no valido");
            }

        } while (!letra.equalsIgnoreCase("fin"));
    }

}
