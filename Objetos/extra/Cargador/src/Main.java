import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {

    static List<Ciudad> ciudades = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt = 0;


        while (opt != 6) {

            try {
                System.out.println("1. Dar de alta una ciudad\n" +
                        "2. Añadir un cargador a una ciudad\n" +
                        "3. Listado de los cargadores de una ciudad\n" +
                        "4. Listado de todas las ciudades y total de cargadores en cada una\n" +
                        "5. Ciudad con más cargadores y ciudad con menos\n" +
                        "6. Salir\n" +
                        "opt: ");

                opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:

                        System.out.print("Nombre ciudad: ");
                        String nombre = br.readLine();

                        Ciudad ciudadEcontrado = buscarCiudad(nombre);

                        /*if (ciudadEcontrado == null) {
                            System.out.println("La ciudad no existe.");
                            break;
                        }*/

                        if (ciudades.contains(ciudadEcontrado)) {
                            System.out.println("Esta ciudad ya esta registrada");
                        } else {
                            Ciudad ciudad = new Ciudad(nombre);
                            ciudades.add(ciudad);
                            System.out.println("Registrando ");
                        }

                        break;

                    case 2:
                        System.out.print("Ciudad: ");
                        String ciudadNom = br.readLine();

                        Ciudad ciEnc = buscarCiudad(ciudadNom);

                        if (ciEnc == null) {
                            System.out.println("la ciudad no existe");
                            break;
                        }


                        System.out.print("Potencia del cargador: ");
                        int potenciaMax = Integer.parseInt(br.readLine());

                        System.out.print("N de enchufes: ");
                        int numEnch = Integer.parseInt(br.readLine());

                        System.out.print("Latitud");
                        double latititud = Double.parseDouble(br.readLine());

                        System.out.print("Longitud: ");
                        double longitud = Double.parseDouble(br.readLine());

                        System.out.print("Ultima Actualizacion ");
                        LocalDate actualizacion = LocalDate.now();

                        Cargador cargador = new Cargador(potenciaMax, numEnch, latititud, longitud, actualizacion);
                        ciEnc.addCargador(cargador);


                        break;

                    case 3:

                        System.out.print("Ciudad:");
                        String nombreCiudad = br.readLine();

                        Ciudad busCiudad = buscarCiudad(nombreCiudad);

                        for (Cargador cargador1 : busCiudad.getCargadors()){
                            System.out.println(cargador1);
                        }


                        break;

                    case 4:

                        for (Ciudad ciudad : ciudades) {
                            int cantidadCargadores = ciudad.numCargadores();
                            System.out.println( ciudad);
                            System.out.println("Cantidad de cargadores " + cantidadCargadores);
                            for (Cargador cargador1 : ciudad.getCargadors()) {
                                System.out.printf("\tpotencia maxima: %d\n" +
                                                "\tnumero encuhfes: %d\n" +
                                                "\tlatitud: %.2f\n" +
                                                "\tlingitud: %.2f\n" +
                                                "\tultima actualizacion: %s\n" +
                                                "-----------\n" ,
                                        cargador1.getPotenciaMax(),
                                        cargador1.getNumEnchufes(),
                                        cargador1.getLatitud(),
                                        cargador1.getLongitud(),
                                        cargador1.getUltimaActualizador().toString());

                            }
                        }
                        break;

                    case 5:
                        if (ciudades.isEmpty()) {
                            System.out.println("No hay ciudades registradas");
                            break;
                        }

                        Ciudad ciudadMax = null;
                        Ciudad ciudadMin = null;
                        int maxCargadores = Integer.MIN_VALUE;
                        int minCargadores = Integer.MAX_VALUE;

                        for (Ciudad ciudad : ciudades) {
                            int numCargadores = ciudad.numCargadores();
                            
                            if (numCargadores > maxCargadores) {
                                maxCargadores = numCargadores;
                                ciudadMax = ciudad;
                            }
                            
                            if (numCargadores < minCargadores) {
                                minCargadores = numCargadores;
                                ciudadMin = ciudad;
                            }
                        }

                        System.out.println("Ciudad con más cargadores: " + ciudadMax.getNombre() + 
                                          " (" + maxCargadores + " cargadores)");
                        System.out.println("Ciudad con menos cargadores: " + ciudadMin.getNombre() + 
                                          " (" + minCargadores + " cargadores)");
                        break;

                    case 6:
                        System.out.println("saliendo del programa");
                        break;

                    default:
                        System.out.printf("Opcion no valida");
                        break;


                }
            } catch (NumberFormatException e) {
                System.out.println("Solo numeros positivos");
            }


        }


    }

    private static Ciudad buscarCiudad(String nombre) {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equalsIgnoreCase(nombre)) {
                return ciudad;
            }
        }
        return null;
    }

}