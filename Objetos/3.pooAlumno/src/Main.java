import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno[] alumnos = new Alumno[2];

        for (int i = 0; i < alumnos.length; i++) {

            System.out.println((i + 1) + ": ");

            System.out.print("Nombre: ");
            String nom = br.readLine();

            System.out.print("Apellido: ");
            String ape = br.readLine();

            System.out.print("DNI: ");
            String DNI = br.readLine();

            System.out.print("Telefono: ");
            String tel = br.readLine();

            // Para decirle que almacene los elementos del alumno
            alumnos[i] = new Alumno(nom, ape, DNI, tel);
        }

        // para imprimir por pantalla los datos del alumno
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i + 1) + " alumno: ");
            System.out.print(alumnos[i].getNombre() + ",");
            System.out.print(alumnos[i].getApellidos() + ",");
            System.out.print(alumnos[i].getDNI() + ",");
            System.out.println(alumnos[i].getTelefono());
        }
    }
}