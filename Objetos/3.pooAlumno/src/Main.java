import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Alumno[] alumnos = new Alumno[2];
        int contador = 0;

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

            alumnos[i] = new Alumno(nom, ape, DNI, tel);


        }

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i + 1) + " alumno: ");
            System.out.print(alumnos[i].getNombre() + ",");
            System.out.print(alumnos[i].getApellidos() + ",");
            System.out.print(alumnos[i].getDNI() + ",");
            System.out.println(alumnos[i].getTelefono());

        }








    }
}