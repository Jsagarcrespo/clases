import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void verCartelera(Pelicula[] pelicula) {
        System.out.println("Cartelera:");
        for (Pelicula peli : pelicula) {
            if (peli != null) {
                System.out.println(peli);
            }
        }
    }

    public static void visualizar(Pelicula[] peliculas) {
        System.out.println("Cartelera:");
        for (int i = 0; i < peliculas.length; i++) {

            if (peliculas[i] == null) {
                System.out.println("Posición " + i + ": vacio");
            } else {
                System.out.println("Posición " + i + ": " + peliculas[i]);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int contador = 0;
        Pelicula[] pelicula = new Pelicula[3];

        int opt = 0;

        while (opt != 4) {

            System.out.print("1. Publicar película\n" +
                    "2. Borrar película\n" +
                    "3. Ver cartelera\n" +
                    "4. Salir\n" +
                    "Opcion:  ");

            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:

                    System.out.print("titulo: ");
                    String titulo = br.readLine();

                    System.out.print("Año: ");
                    int anyo = Integer.parseInt(br.readLine());

                    System.out.print("Duracion: ");
                    int duracion = Integer.parseInt(br.readLine());
                    ;

                    System.out.print("Genero: ACCION, AVENTURAS, COMEDIA,\n" +
                            "DRAMA, TERROR, MUSICAL, SCIFI, BELICA," +
                            "WESTERN, SUSPENSE:  ");
                    String genero = br.readLine();
                    Genero gen = null;

                    switch (genero) {
                        case "ACCION":
                            gen = Genero.ACCION;
                            break;

                        case "AVENTURAS":
                            gen = Genero.AVENTURAS;
                            break;

                        case "COMEDIA":
                            gen = Genero.COMEDIA;
                            break;

                        case "DRAMA":
                            gen = Genero.DRAMA;
                            break;

                        case "TERROR":
                            gen = Genero.TERROR;
                            break;

                        case "MUSICAL":
                            gen = Genero.MUSICAL;
                            break;

                        case "SCIFI":
                            gen = Genero.SCIFI;
                            break;

                        case "BELICA":
                            gen = Genero.BELICA;
                            break;

                        case "WESTERN":
                            gen = Genero.WESTERN;
                            break;

                        case "SUSPENSE":
                            gen = Genero.SUSPENSE;
                            break;

                        default:
                            System.out.println("Opcion no valdio");
                            break;
                    }

                    System.out.print("Que nota le das: TP, M_7, M_12, M_16, M_18: ");
                    String calificacion = br.readLine();
                    // Es necesario inicializarlo si no nos dara error
                    Calificacion cal = null;

                    switch (calificacion) {
                        case "TP":
                            cal = Calificacion.TP;
                            break;

                        case "M_7":
                            cal = Calificacion.M_7;
                            break;

                        case "M_12":
                            cal = Calificacion.M_12;
                            break;

                        case "M_16":
                            cal = Calificacion.M_16;
                            break;

                        case "M_18":
                            cal = Calificacion.M_18;
                            break;

                        default:
                            System.out.println("Opcion no valdio");
                            break;

                    }

                    // Aqui nos dara problemas ya que gen y cal no espera tener valores nulos
                    // con lo que cuando los declaremos los tenemos que dar valor de "null"
                    System.out.println(contador);
                    pelicula[contador] = new Pelicula(titulo, anyo, duracion, gen, cal);
                    System.out.println(pelicula[contador]);

                    System.out.println("=================");
                    verCartelera(pelicula);

                    contador++;
                    break;

                case 2:
                    System.out.println("ver salas");
                    visualizar(pelicula);

                    System.out.print("Elige sala a borrar: ");
                    int sal = Integer.parseInt(br.readLine());

                    pelicula[sal] = null;

                    visualizar(pelicula);

                    System.out.println("Borrado exitosos");

                    break;

                case 3:
                    visualizar(pelicula);
                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion no valido");
                    break;
            }

        }

    }
}