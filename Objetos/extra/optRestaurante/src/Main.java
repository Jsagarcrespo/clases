import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt;
        int contRestaurante = 0;
        int contValo = 0;

        Restaurante[] restaurante = new Restaurante[10];

        do {
            System.out.print("1. Crear nuevo restaurante\n" +
                    "2. Añadir una valoración a un restaurante\n" +
                    "3. Listado de los restaurantes con estrella Michelin\n" +
                    "4. Listado de los restaurantes con valoración media superior a 3\n" +
                    "5. Listado de todos los restaurante con su valoración media\n" +
                    "6. Ver estructura\n" +
                    "7. Salir\n" +
                    "Opción: ");
            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    System.out.print("Estrella Michelin (si/no): ");
                    boolean estrellaMichelin = br.readLine().trim().equalsIgnoreCase("si");

                    System.out.print("Precio Medio: ");
                    int precioMedio = Integer.parseInt(br.readLine());

                    restaurante[contRestaurante] = new Restaurante(nombre, precioMedio, estrellaMichelin);
                    System.out.println(restaurante[contRestaurante]);

                    contRestaurante++;
                    break;

                case 2:
                    System.out.print("Escribe un nombre: ");
                    nombre = br.readLine();

                    boolean encontrado = false;
                    for (int i = 0; i < contRestaurante; i++) {
                        if (nombre.equalsIgnoreCase(restaurante[i].getNombre())) {
                            encontrado = true;
                            System.out.println("Restaurante encontrado: " + restaurante[i]);

                            System.out.print("Añadir valoración: ");
                            String valoracion = br.readLine();

                            System.out.print("Añadir puntuación (1-5): ");
                            int puntuacion = Integer.parseInt(br.readLine());

                            restaurante[i].getValoracion()[contValo] = new Valoracion(puntuacion, valoracion, restaurante[i]);
                            restaurante[i].agValoracion(restaurante[i].getValoracion()[contValo]);

                            System.out.println(restaurante[i].getValoracion()[contValo]);

                            contValo++;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No existe el restaurante");
                    }

                    break;

                case 3:
                    System.out.println("Lista de restaurantes con estrella Michelin: ");
                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurante[i].getEstrellaMichelin()) {
                            System.out.println(restaurante[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Restaurantes con valoración media superior a 3:");
                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurante[i].valoracionMedia() > 3) {
                            System.out.println(restaurante[i] + ": Media puntuación --> " + restaurante[i].valoracionMedia());
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < contRestaurante; i++) {
                        System.out.println(restaurante[i] + ": Media puntuación --> " + restaurante[i].valoracionMedia());
                    }
                    break;

                case 6:
                    System.out.println("======= Estructura =======");
                    for (int i = 0; i < contRestaurante; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (restaurante[i].getValoracion()[j] != null) {
                                System.out.println(restaurante[i] + ": " + restaurante[i].getValoracion()[j]);
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opt != 7);
    }
}
