import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Restaurante[] restaurantes = new Restaurante[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int contadorRes = 0;
        int contadorVal = 0;

        int opcion;
        do {
            System.out.println("1. Crear nuevo restaurante\n2. Añadir una valoración a un restaurante\n3. Listado de los restaurantes con estrella Michelin\n4. Listado de los restaurantes con valoración media superior a 3\n5. Listado de todos los restaurante con su valoración media\n6. Salir");
            System.out.println("Opcion:");
            opcion = Integer.parseInt(br.readLine());
            boolean restuartenex;
            if (opcion == 1) {
                System.out.println("Nombre restaurante");
                String nombre = br.readLine();
                System.out.println("Estrella michelin [true o false ]");
                restuartenex = Boolean.parseBoolean(br.readLine());
                System.out.println("precio medio ");
                double precio = Double.parseDouble(br.readLine());
                restaurantes[contadorRes] = new Restaurante(nombre, restuartenex, precio);
                ++contadorRes;
            } else if (opcion != 2) {
                Restaurante[] var12;
                int var14;
                int var15;
                Restaurante restaurante;
                if (opcion == 3) {
                    var12 = restaurantes;
                    var14 = restaurantes.length;

                    for(var15 = 0; var15 < var14; ++var15) {
                        restaurante = var12[var15];
                        if (restaurante != null) {
                            if (restaurante.isEstrella()) {
                                System.out.println(restaurante.getNombre());
                            }
                        } else {
                            System.out.println("Restuarnte no creado");
                        }
                    }
                } else if (opcion == 4) {
                    var12 = restaurantes;
                    var14 = restaurantes.length;

                    for(var15 = 0; var15 < var14; ++var15) {
                        restaurante = var12[var15];
                        if (restaurante != null) {
                            if (restaurante.calcularValoracionMedia() > 3.0) {
                                System.out.println(restaurante.getNombre());
                            }
                        } else {
                            System.out.println("No hay reestaurantes creados");
                        }
                    }
                } else if (opcion == 5) {
                    var12 = restaurantes;
                    var14 = restaurantes.length;

                    for(var15 = 0; var15 < var14; ++var15) {
                        restaurante = var12[var15];
                        if (restaurante != null) {
                            System.out.println(restaurante.getNombre());
                            System.out.println(restaurante.calcularValoracionMedia());
                        } else {
                            System.out.println("No hay reestaurantes creados");
                        }
                    }
                } else if (opcion == 6) {
                    System.out.println("Saliendo ...");
                } else {
                    System.out.println("Opcion no valida");
                }
            } else {
                int restaurante_encontrado = 0;
                restuartenex = false;
                System.out.println("Nombre restaurante");
                String nombre = br.readLine();

                for(int i = 0; i < restaurantes.length; ++i) {
                    if (restaurantes[i] != null && restaurantes[i].getNombre().equalsIgnoreCase(nombre)) {
                        restaurante_encontrado = i;
                        restuartenex = true;
                        ++contadorVal;
                    }
                }

                if (restuartenex) {
                    System.out.println("Texto");
                    String texto = br.readLine();
                    System.out.println("Puntuacion");
                    int puntuacion = Integer.parseInt(br.readLine());
                    if (puntuacion > 5) {
                        System.out.println("Puntuacion tiene que ser 1 a 5");
                    } else {
                        Valoracion valoracion = new Valoracion(puntuacion, texto, restaurantes[restaurante_encontrado]);
                        restaurantes[restaurante_encontrado].agregarVal(valoracion);
                        System.out.println("valoracion agregada");
                    }
                } else {
                    System.out.println("Resturante no existe");
                }
            }
        } while(opcion != 6);

    }
}
