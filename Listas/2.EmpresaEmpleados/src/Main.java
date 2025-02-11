import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Empresa buscarEmpresa(String nombre) {
        for (Empresa empresa : empresas) {
            if (empresa.getNombre().equalsIgnoreCase(nombre)) {
                return empresa;
            }
        }
        return null;
    }


    static List<Empresa> empresas = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int opt = 0;

        do {
            System.out.print("1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir\n" +
                    "Opcion: ");

            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:

                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    System.out.print("Fecha Fundacion: ");
                    LocalDate fechaFundacion = LocalDate.parse(br.readLine());

                    Empresa empresa = new Empresa(nombre, fechaFundacion);

                    empresas.add(empresa);

                    for (Empresa e : empresas) {
                        System.out.println(e);
                    }

                    break;

                case 2:


                    System.out.print("En que empresa quieres añadir empleado: ");
                    String nombreEmpresa = br.readLine();

                    boolean encontrado = false;

//                    for (Empresa e : empresas) {
//                        if (e.getNombre().equalsIgnoreCase(nombreEmpresa)) {
//                            encontrado = true;

                    // necesario para que lo pueda añadir en empleado
                    Empresa empresaEncontrada = buscarEmpresa(nombreEmpresa);
                    if (empresaEncontrada == null) {
                        System.out.println("La empresa no existe.");
                        break;
                    }


                            System.out.print("Nombre: ");
                            String nombreEmpleado = br.readLine();

                            System.out.print("Apellidos: ");
                            String apellido = br.readLine();

                            System.out.print("edad: ");
                            int edad = Integer.parseInt(br.readLine());

                            System.out.print("Fecha contrato: ");
                            LocalDate fechaContrato = LocalDate.parse(br.readLine());

                            Empleado empleado = new Empleado(apellido, nombreEmpleado, edad, fechaContrato, empresaEncontrada);

                           // Importante no olvidarese porque si no en la opcion 4 no me lo imprimiria al no haberlos añadido
                            // a la lista de empleados de la empresa
                            empresaEncontrada.getEmpleados().add(empleado);


                            System.out.println(empleado);
//                        }
//                    }
//
//                    if (!encontrado){
//                        System.out.println("no se ha encontrado. ");
//                    }


                    break;

                case 3:
                    for (Empresa e : empresas) {
                        System.out.println(e);
                    }

                    break;

                case 4:

                    for (Empresa e : empresas) {
                        System.out.println("Empresa: " + e.getNombre());
                        for (Empleado emp : e.getEmpleados()) {
                            System.out.printf("Nombre: %s, Apellidos: %s, Edad: %d, Fecha de Contrato: %s",
                                    emp.getNombre(),
                                    emp.getApellidos(),
                                    emp.getEdad(),
                                    emp.getFechaContrato());
                        }
                    }
                    break;

                case 5:

                    break;

                default:

                    break;


            }


        } while (opt != 5);

    }
}