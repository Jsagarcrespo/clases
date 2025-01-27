import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Grupo grupo = new Grupo("7fdam");


        for (int i = 0; i < 2; i++) {

            System.out.println("Nombre: ");
            String nom = br.readLine();

            System.out.println("Apellidos: ");
            String ape = br.readLine();

            System.out.println("DNI: ");
            String DNI = br.readLine();

            System.out.println("telefono: ");
            String tel = br.readLine();

            Alumno alumno = new Alumno(nom, ape, DNI, tel);

            // Establecer el grupo del alumno
            alumno.setGrupo(grupo);

            // con esto lo almacenamos en el array que tenemos en grupo de Alumno[]
            grupo.getAlumno()[i] = alumno;

        }

        for (int i = 0; i < grupo.getAlumno().length; i++) {
            //aqui accderemos a cada metodos y atributos del objeto Alumno
            Alumno alumno = grupo.getAlumno()[i];

            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellido());
            System.out.println("DNI: " + alumno.getDNI());
            System.out.println("Telefono: " + alumno.getTelefono());
            System.out.println();
        }

        System.out.println(grupo.getCodigo());

    }
}