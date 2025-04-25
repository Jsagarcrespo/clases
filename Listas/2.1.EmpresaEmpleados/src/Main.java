import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Empresa> empresas = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String salida = " ";

        do {

            System.out.println("1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir\n" +
                    "opcion: ");

            int opt = Integer.parseInt(br.readLine());

            switch (opt){
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    System.out.print("fecha fundacion: ");
                    LocalDate fechaFuncacion = LocalDate.parse(br.readLine());

                    empresas.add(new Empresa(nombre, fechaFuncacion));

                    break;

                case 2:
                    System.out.print("Nombre de la empresa: ");
                    String nomEmp = br.readLine();

                    Empresa empresaEncontrado = nombreEmpresa(nomEmp);

                    if (empresaEncontrado == null){
                        System.out.printf("No existe la empresa\n");
                        break;
                    }
                        System.out.print("Nombre emp: ");
                        String nombrEmp = br.readLine();

                        System.out.print("Apellidos emp: ");
                        String apellidos = br.readLine();

                        System.out.print("edad emp: ");
                        int edad = Integer.parseInt(br.readLine());

                        System.out.print("Fecha contrato emp: ");
                        LocalDate fechaContrato = LocalDate.parse(br.readLine());

                        Empleado empleado = new Empleado(nombrEmp, edad, apellidos, fechaContrato, empresaEncontrado);
                        empresaEncontrado.getEmpleados().add(empleado);



                    break;




                case 3:
                    for (Empresa e : empresas){
                        System.out.printf("Nombre: %s\n" +
                                        "Fecha de la fundacion: %s\n",
                                e.getNombre(),
                                e.getFechaFundacion());
                    }
                    break;

                case 4:
                    for (Empresa e : empresas){
                        System.out.printf("Nombre: %s\n" +
                                        "Fecha de la fundacion: %s\n",
                                e.getNombre(),
                                e.getFechaFundacion());
                        for (Empleado emp : e.getEmpleados()){
                            System.out.printf("Nombre: %s\n" +
                                            "edad: %d\n" +
                                            "apellidos: %s\n" +
                                            "fecha contrato: %s\n" +
                                            "fecha de hoy: %s\n" +
                                            "dias contratado: %d\n",
                                    emp.getNombre(),
                                    emp.getEdad(),
                                    emp.getApellidos(),
                                    emp.getFechaContrato(),
                                    LocalDate.now(),
                                    emp.diasContratado());
                        }
                    }
                    break;

                default:
                    System.out.printf("Opcion no valida");


            }

        } while (!salida.equalsIgnoreCase("salir"));

    }

    private static Empresa nombreEmpresa(String nomEmp){
        for (Empresa e : empresas){
            if (e.getNombre().equals(nomEmp)){
                return e;
            }
        }
        return null;
    }

}