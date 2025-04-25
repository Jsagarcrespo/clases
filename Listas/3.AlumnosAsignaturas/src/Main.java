import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Alumno> alumnos = new ArrayList<>();
    static List<Asignatura> asignaturas = new ArrayList<>();

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt = 0;

        do {

            System.out.print("1. Crear nuevo alumno.\n" +
                    "2. Crear nueva asignatura.\n" +
                    "3. Matricular alumno en asignatura.\n" +
                    "4. Listado de alumnos matriculados en una asignatura.\n" +
                    "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                    "6. Salir\n" +
                    "opcion: ");

            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:
                    System.out.print("Nombre: ");
                    String nom = br.readLine();

                    System.out.print("Apellidos: ");
                    String ape = br.readLine();

                    System.out.print("email: ");
                    String email = br.readLine();

                    Alumno alumno = new Alumno(nom, ape, email);
                    alumnos.add(alumno);


                    break;

                case 2:

                    System.out.printf("Nombre: ");
                    String nomAsig = br.readLine();

                    Asignatura asigExistente = existeAsignatura(nomAsig);

                    System.out.printf("Horas semanales: ");
                    int horas = Integer.parseInt(br.readLine());

                    Asignatura asignatura = new Asignatura(nomAsig, horas);
                    asignaturas.add(asignatura);

                    //asignaturas.add(new Asignatura(nomAsig,horas));


                    break;

                case 3:

                    System.out.print("Nombre alumno: ");
                    String nombAlumno = br.readLine();

                    Alumno alumExistente = existeAlumno(nombAlumno);

                    if (alumExistente == null) {
                        System.out.printf("No existe el alumno");
                        break;
                    }

                    System.out.print("Nombre Asignatura: ");
                    String nombAsig = br.readLine();

                    Asignatura asigExistente1 = existeAsignatura(nombAsig);

                    if (asigExistente1 == null) {
                        System.out.printf("No existe el alumno");
                        break;
                    }

                    asigExistente1.getAlumnos().add(alumExistente);
                    alumExistente.getAsignaturas().add(asigExistente1);

                    break;

                case 4:

                    System.out.print("Que asignatura quieres ver: ");
                    nomAsig = br.readLine();

                    Asignatura asigExistente2 = existeAsignatura(nomAsig);

                    if (asigExistente2 == null) {
                        System.out.printf("No existe el asignatura");
                        break;
                    }

                    System.out.printf("Asignatura: %s\n" +
                                    "horas semanales: %d\n ",
                            asigExistente2.getNombre(),
                            asigExistente2.getHorasSemanles());

                    for (Alumno a : asigExistente2.getAlumnos()) {
                        System.out.printf("Nombre: %s\n" +
                                        "Apellido: %s\n" +
                                        "email: %s\n" +
                                        "----------\n",
                                a.getNombre(),
                                a.getApellidos(),
                                a.getEmail());

                    }
                    break;

                case 5:
                    System.out.print("Nombre del alumno, lista en la que el alumno esta matriculado: ");
                    String nomAlu = br.readLine();

                    Alumno aluExistente = existeAlumno(nomAlu);

                    if (aluExistente == null) {
                        System.out.printf("No existe el alumno");
                        break;
                    }

                    System.out.printf("Nombre: %s\n" +
                                    "Apellido: %s\n" +
                                    "email: %s\n" +
                                    "----------\n",
                            aluExistente.getNombre(),
                            aluExistente.getApellidos(),
                            aluExistente.getEmail());

                    for (Asignatura a : aluExistente.getAsignaturas()) {
                        System.out.printf("Asignatura: %s\n" +
                                        "horas semanales: %d\n ",
                                a.getNombre(),
                                a.getHorasSemanles());

                    }
                    break;

                case 6:
                    break;

                default:
                    break;


            }

        } while (opt != 6);


    }

    public static Asignatura existeAsignatura(String nomAsig) {

        for (Asignatura a : asignaturas) {
            if (a.getNombre().equalsIgnoreCase(nomAsig)) {
                return a;
            }
        }
        return null;
    }

    public static Alumno existeAlumno(String nomAsig) {

        for (Alumno al : alumnos) {
            if (al.getNombre().equalsIgnoreCase(nomAsig)) {
                return al;
            }
        }
        return null;
    }


}