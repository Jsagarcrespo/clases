import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt;
        int contRestaurante = 0;
        int contValo = 0;

        // Necesito inicializarlo aqui si o si, no me vale con
        Restaurante[] restaurante = new Restaurante[10];

        //necesito inicializarlo porque sino en la opcion 6 me salta al hacer el bucle
        Valoracion[] valoracions = new Valoracion[10];

        do {

            System.out.print("1. Crear nuevo restaurante\n" +
                    "2. Añadir una valoración a un restaurante\n" +
                    "3. Listado de los restaurantes con estrella Michelin\n" +
                    "4. Listado de los restaurantes con valoración media superior a 3\n" +
                    "5. Listado de todos los restaurante con su valoración media\n" +
                    "6. ver esctructura \n" +
                    "7. salir\n" +
                    "opcion: ");
            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    System.out.print("Estrella Michelin: ");
                    boolean estrellaMichelin = br.readLine().trim().equalsIgnoreCase("si");

                    System.out.print("Precio Medio: ");
                    int precioMedio = Integer.parseInt(br.readLine());

                    restaurante[contRestaurante] = new Restaurante(nombre, precioMedio, estrellaMichelin);
                    // Que no se me olvide decir cual es la referencia del array a la que me refiero, si no no me mostrara nada
                    System.out.println(restaurante[contRestaurante]);

                    contRestaurante++;

                    break;


                case 2:
                    System.out.print("escribe un nombre: ");
                    nombre = br.readLine();

                    //No se puede usar un foreach porque si no nos da problemas de "NullPointeException"
                    for (int i = 0; i < contRestaurante; i++) {
                        if (nombre.equalsIgnoreCase(restaurante[i].getNombre())) {

                            System.out.println("Restaurante encontrado: " + restaurante[i]);

                            System.out.print("Añadir valoracion: ");
                            String valoracion = br.readLine();

                            System.out.print("Añadir puntuacion: ");
                            int puntuacion = Integer.parseInt(br.readLine());


                            System.out.println("==========");

                        // para no necesitar usar el set en valoracion
                            restaurante[i].getValoracion()[contValo] = new Valoracion(puntuacion, valoracion, restaurante);
                        // importante para que me pueda ir sumando cada puntuacion
                            restaurante[i].agValoracion(restaurante[i].getValoracion()[contValo]);

                            System.out.println(restaurante[i].getValoracion()[contValo]);

                            contValo++;

                        } else {
                            System.out.println("No existe el restaurante");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Lista: ");

                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurante[i].getEstrellaMichelin()) {
                            System.out.println(restaurante[i]);

                        }
                    }

                    break;

                case 4:

                    System.out.println("Restaurantes con valoracion media superior a 3:");

                    for (int i = 0; i < contRestaurante; i++) {
                        if (restaurante[i].valoracionMedia() > 3){
                            System.out.println(restaurante[i] + ": Media puntuacion --> " + restaurante[i].valoracionMedia());
                        }
                    }

                    break;

                case 5:
                    for (int i = 0; i < contRestaurante; i++) {
                            System.out.println(restaurante[i] + ": Media puntuacion --> " + restaurante[i].valoracionMedia());
                    }

                    break;

                case 6:
                    // System.out.println(restaurante[contRestaurante -1].getValoracion()[contValo - 1]);

                    /*for (Valoracion valoracion : restaurante[contRestaurante -1].getValoracion()){
                        if (valoracion != null){
                        System.out.println(valoracion);
                        } else {
                            System.out.println("vacio");
                        }
                    }*/

                    /*for (Restaurante r : restaurante){
                        for (int i = 0; i < 10; i++) {
                            if (r != null){
                                System.out.println(r + " " + restaurante[contRestaurante -1].getValoracion()[i] + "cuenta de i: " + i);
                            }
                        }

                    }*/

                    /*System.out.println("======================");


                    for (Valoracion valo : valoracions){
                        if (valo != null) {
                            System.out.println(" valo" + restaurante[contRestaurante - 1].getValoracion()[contValo - 1]);
                        }
                    }*/


                // ESTO ME AYUDA A VISUALIZAR SI AUN NO HE LLEGADO A LA CONCLUSION DE COMO HACER EL BUCLE PARA MOSTRARLO

                /*    System.out.println("=====si lo hacemos 1 a 1 ======");
                    System.out.println(restaurante[0].getValoracion()[0]);
                    System.out.println(restaurante[1].getValoracion()[1]);

                    System.out.println(restaurante[0].getValoracion()[1]);
                    System.out.println(restaurante[1].getValoracion()[0]);
                    System.out.println("");*/


                    System.out.println("=======SI LO HACEMOS CON FOR========");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (restaurante[i] != null){
                                if (restaurante[i].getValoracion()[j] != null){
                                System.out.println(restaurante[i] + ": " + restaurante[i].getValoracion()[j]);}

                            }
                        }

                    }
                    System.out.println("");
                    
                    break;

                case 7:
                    System.out.println("salir");
                    break;


                default:
                    System.out.println("opcion no valido");
                    break;

            }

        } while (opt != 7);


    }
}