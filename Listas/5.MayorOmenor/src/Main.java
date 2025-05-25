import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static List<Amigo> amigos = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt = 0;

        do {
            System.out.print("1. Nuevo amigo\n" +
                    "2. Listado de amigos y edad de cada uno\n" +
                    "3. ¿Mayor o menor?\n" +
                    "4. Salir\n" +
                    "opt: ");

            opt = Integer.parseInt(br.readLine());


            switch (opt){
                case 1:
                    System.out.print("Nombre: ");
                    String nom = br.readLine();

                    System.out.print("Fecha nacimiento: ");
                    LocalDate fechaNacimiento = LocalDate.parse(br.readLine());

                    Amigo amigo = new Amigo(nom, fechaNacimiento);

                    if (amigos.contains(amigo)){
                        System.out.println("Amigo ya estaba registrado");
                    }else{
                        amigos.add(amigo);
                    }

                    break;

                case 2:

                    for (Amigo ami : amigos){
                        System.out.printf("Nombre: %s\n" +
                                "Fecha nacimiento: %s\n",
                                ami.getNombre() ,
                                ami.getFechaNacimiento());
                    }

                    break;

                case 3:

                    System.out.print("Pone el nombre del 1 amigo: ");
                    String ami1 = br.readLine();
                    Amigo amigo1 = amigoExiste(ami1);

                    if (amigo1 == null) {
                        System.out.println("El alumno no existe.");
                        break;
                    }

                    System.out.print("Pone el nombre del 2 amigo: ");
                    String ami2 = br.readLine();
                    Amigo amigo2 = amigoExiste(ami2);

                    if (amigo2 == null) {
                        System.out.println("El alumno no existe.");
                        break;
                    }

                   if (amigo1.compareTo(amigo2) < 0){
                       System.out.println(amigo1.getNombre() + " es menor que " + amigo2.getNombre());
                   } else if (amigo1.compareTo(amigo2) > 0) {
                       // No es lo mismo que el de arriba amigo2 esta de primeras
                       System.out.println(amigo2.getNombre() + " es mayor que " + amigo1.getNombre());
                   }  else {
                       System.out.println("Misma edad. ");
                   }


                    break;

                case 4:
                    break;

                default:
                    break;



            }

        } while (opt != 4);


    }

    public static Amigo amigoExiste(String nombre){
        for (Amigo a : amigos){
            if (a.getNombre().equals(nombre)){
                return a;
            }
        }

        return null;
    }
}

