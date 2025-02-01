import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opt;
        int contRestaurante = 0;
        Restaurante[] restaurantes = new Restaurante[10];

        do {
            System.out.print("1. Crear nuevo restaurante\n" +
                    "2. Anadir una valoracion a un restaurante\n" +
                    "3. Listado de los restaurantes con estrella Michelin\n" +
                    "4. Listado de los restaurantes con valoracion media superior a 3\n" +
                    "5. Listado de todos los restaurantes con su valoracion media\n" +
                    "6. Salir\nOpcion: ");
            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:
                    if (contRestaurante < 10) {
                        System.out.print("Nombre: ");
                        String nombre = br.readLine();

                        System.out.print("Estrella Michelin (si/no): ");
                        boolean estrellaMichelin = br.readLine().trim().equalsIgnoreCase("si");

                        System.out.print("Precio Medio: ");
                        double precioMedio = Double.parseDouble(br.readLine());

                        restaurantes[contRestaurante] = new Restaurante(nombre, precioMedio, estrellaMichelin);
                        System.out.println("Restaurante creado: " + restaurantes[contRestaurante]);
                        contRestaurante++;
                    } else {
                        System.out.println("No se pueden agregar mas restaurantes.");
                    }
                    break;

                case 2:
                    System.out.print("Escribe el nombre del restaurante: ");
                    String nombreRestaurante = br.readLine();
                    Restaurante restauranteEncontrado = null;
                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurantes[i].getNombre().equalsIgnoreCase(nombreRestaurante)) {
                            restauranteEncontrado = restaurantes[i];
                            break;
                        }
                    }
                    if (restauranteEncontrado != null) {
                        System.out.print("Añadir valoracion: ");
                        String valoracionTexto = br.readLine();

                        System.out.print("Añadir puntuacion (0-5): ");
                        int puntuacion = Integer.parseInt(br.readLine());
                        if (puntuacion < 0 || puntuacion > 5) {
                            System.out.println("Puntuacion invalida. Debe estar entre 0 y 5.");
                            break;
                        }

                        new Valoracion(puntuacion, valoracionTexto, restauranteEncontrado);
                        System.out.println("Valoracion añadida correctamente.");
                    } else {
                        System.out.println("No se encontro el restaurante.");
                    }
                    break;

                case 3:
                    System.out.println("Restaurantes con estrella Michelin:");
                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurantes[i].getEstrellaMichelin()) {
                            System.out.println(restaurantes[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Restaurantes con valoracion media superior a 3:");
                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurantes[i].valoracionMedia() > 3) {
                            System.out.println(restaurantes[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los restaurantes con su valoracion media:");
                    for (int i = 0; i < contRestaurante; i++) {
                        System.out.println(restaurantes[i]);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opt != 6);
    }
}
