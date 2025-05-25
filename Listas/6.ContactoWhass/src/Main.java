import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Contacto> contactoMap = new LinkedHashMap<>();

        int opt = -1;


            do {
                try {
                    System.out.println();
                    System.out.print("CONTACTOS\n" +
                            "---------\n" +
                            "\t0. Salir\n" +
                            "Gestión de contactos\n" +
                            "\t1. Nuevo contacto.\n" +
                            "\t2. Eliminar contacto.\n" +
                            "Búsqueda\n" +
                            "\t3. Buscar contacto por número de teléfono.\n" +
                            "\t4. Buscar contacto por nombre.\n" +
                            "Listados\n" +
                            "\t5. Listado de todos los contactos, tal como se han añadido.\n" +
                            "\t6. Listado de todos los contactos, ordenados por número de teléfono.\n" +
                            "opt: ");
                    opt = Integer.parseInt(br.readLine());

                    switch (opt) {
                        case 0:
                            System.out.println("saliendo. ");

                            break;

                        case 1:
                            System.out.print("Nombre: ");
                            String nombre = br.readLine();

                            System.out.print("Apellido:");
                            String apellido = br.readLine();

                            System.out.print("email:");
                            String email = br.readLine();

                            System.out.print("Telefono: ");
                            int tel = Integer.parseInt(br.readLine());


                            if (contactoMap.containsKey(tel)){
                                System.out.print("El telefono ya esta registrado");
                            } else{
                                Contacto contacto = new Contacto(nombre, apellido, email);
                                contactoMap.put(tel, contacto);
                            }

                            break;

                        case 2:

                            System.out.print("Telefono: ");
                            tel = Integer.parseInt(br.readLine());


                            if (contactoMap.containsKey(tel)){
                                System.out.println("telefono borrado con exito");
                                contactoMap.remove(tel);
                            } else {
                                System.out.println("No existe el telefono ");
                            }

                            break;

                        case 3:

                            System.out.print("Telefono");
                            tel = Integer.parseInt(br.readLine());


                            if (contactoMap.containsKey(tel)){
                                for (Map.Entry<Integer, Contacto> contactoEntry : contactoMap.entrySet()){
                                    System.out.printf("Nombre: %s \n" +
                                            "Apellido: %s \n" +
                                            "Email: %s \n",
                                            contactoEntry.getValue().getNombre(),
                                            contactoEntry.getValue().getApellido(),
                                            contactoEntry.getValue().getEmail());
                                }
                            } else {
                                System.out.println("No existe el telefono ");
                            }

                            break;

                        case 4:

                            System.out.print("Nombre: ");
                            nombre = br.readLine();

                            Contacto nombreEncontrado = buscarContacto(contactoMap, nombre);

                            if (nombreEncontrado == null){
                                System.out.println("No existe el contacto");
                                break;
                            }

                            for (Map.Entry<Integer, Contacto> contactoEntry : contactoMap.entrySet()){
                                System.out.printf("Nombre: %s \n" +
                                                "Apellido: %s \n" +
                                                "Email: %s \n",
                                        contactoEntry.getValue().getNombre(),
                                        contactoEntry.getValue().getApellido(),
                                        contactoEntry.getValue().getEmail());
                            }

                            break;

                        case 5:

                           /* for (Map.Entry<Integer, Contacto> contactoEntry : contactoMap.entrySet()){
                                System.out.printf("Nombre: %s \n" +
                                                "Apellido: %s \n" +
                                                "Email: %s \n",
                                        contactoEntry.getValue().getNombre(),
                                        contactoEntry.getValue().getApellido(),
                                        contactoEntry.getValue().getEmail());
                            }*/

                            for (Map.Entry<Integer, Contacto> contacto : contactoMap.entrySet()) {
                                System.out.println("Telefono: " + contacto.getKey() + " -> Info: " + contacto.getValue());
                            }

                            break;

                        case 6:
                            // TREEMAP PARA ORDENAR SEGUN EL TELEFONO
                            Map<Integer, Contacto> ordenado = new TreeMap<>(contactoMap);

                            for (Map.Entry<Integer, Contacto> contacto : ordenado.entrySet()) {
                                System.out.println("Telefono: " + contacto.getKey() + " -> Info: " + contacto.getValue());
                            }
                            break;

                        default:
                            break;



                    }
                } catch (NumberFormatException e){
                    System.out.println("tiene que introducir un numero entero");
                }
            } while (opt != 0);



    }

    public static Contacto buscarContacto (Map<Integer, Contacto> contactoMap, String nombre){
        for (Map.Entry<Integer, Contacto> contactoEntry : contactoMap.entrySet()){
            if (contactoEntry.getValue().getNombre().equals(nombre)){
                return contactoEntry.getValue() ;
            }
        }

        return null;
    }

}