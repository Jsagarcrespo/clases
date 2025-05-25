package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Tema> temas = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        do {
            System.out.println("1. Dar de alta un tema nuevo\n" +
                    "2. Dar de alta una persona nueva\n" +
                    "3. Dada una persona, vincularla con un tema\n" +
                    "4. Listado de todos los temas y número de expertos disponibles en cada uno\n" +
                    "5. Dada una persona, listado de temas en las que es experta\n" +
                    "6. Dado un tema, persona con coste/hora más bajo\n" +
                    "7. Salir");

            try {
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Nombre Tema:");
                        String Ntema = br.readLine();
                        temas.add(new Tema(Ntema));
                        break;

                    case 2:
                        System.out.println("Nombre:");
                        String nombre = br.readLine();
                        System.out.println("Coste Hora:");
                        double costeH = Double.parseDouble(br.readLine());
                        System.out.println("Fecha Alta:");
                        LocalDate fechaAlta = LocalDate.parse(br.readLine());
                        System.out.println("Disponible?");
                        boolean disponible = Boolean.parseBoolean(br.readLine());

                        personas.add(new Persona(nombre, fechaAlta, costeH, disponible));
                        break;

                    case 3:
                        System.out.println("Personas disponibles:");
                        for (Persona pers : personas) {
                            System.out.println("Nombre: " + pers.getNombre());
                        }
                        String INombre = br.readLine();
                        int PersonaInd = -1;
                        int TemaInd = -1;

                        for (int i = 0; i < personas.size(); i++) {
                            if (INombre.equals(personas.get(i).getNombre())) {
                                PersonaInd = i;
                                break;
                            }
                        }

                        System.out.println("Temas disponibles:");
                        for (Tema tem : temas) {
                            System.out.println("Nombre: " + tem.getNombre());
                        }
                        String ITema = br.readLine();

                        for (int i = 0; i < temas.size(); i++) {
                            if (ITema.equals(temas.get(i).getNombre())) {
                                TemaInd = i;
                                break;
                            }
                        }

                        if (PersonaInd != -1 && TemaInd != -1) {
                            temas.get(TemaInd).getPersonas().add(personas.get(PersonaInd));
                            personas.get(PersonaInd).getTemas().add(temas.get(TemaInd));
                            System.out.println("Vinculación exitosa.");
                        } else {
                            System.out.println("No se ha podido vincular el tema con la persona.");
                        }
                        break;

                    case 4:
                        for (Tema tema : temas) {
                            System.out.println("Nombre Tema: " + tema.getNombre());
                            System.out.println("Expertos disponibles: " + tema.numExpertosDisponible());
                        }
                        break;

                    case 5:
                        System.out.println("Personas registradas:");
                        for (Persona persona : personas) {
                            System.out.println("Nombre: " + persona.getNombre());
                        }
                        String person = br.readLine();

                        for (Persona per : personas) {
                            if (person.equals(per.getNombre())) {
                                System.out.println("Nombre: " + per.getNombre());
                                System.out.println("Temas en los que es experta:");
                                for (Tema t : per.getTemas()) {
                                    System.out.println("- " + t.getNombre());
                                }
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Temas disponibles:");
                        for (Tema t : temas) {
                            System.out.println("Nombre: " + t.getNombre());
                        }
                        String tema = br.readLine();
                        String nombreMasBarato = "";
                        double costoMinimo = Double.MAX_VALUE;

                        for (Tema t : temas) {
                            if (tema.equals(t.getNombre())) {
                                for (Persona per : t.getPersonas()) {
                                    if (per.getCosteH() < costoMinimo) {
                                        nombreMasBarato = per.getNombre();
                                        costoMinimo = per.getCosteH();
                                    }
                                }
                            }
                        }

                        System.out.println("Persona con coste/hora más bajo: " + nombreMasBarato);
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida :(");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida, el número no es correcto.");
            }

        } while (opcion != 7);
    }
}
