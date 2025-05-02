import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<CuentaBancaria> cuentaBancarias = new ArrayList<>();
    static List<Titular> titulars = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt = 0;

        do {

            System.out.println("1. Titular\n" +
                    "\ta. Nuevo titular\n" +
                    "2. Cuenta bancaria\n" +
                    "\ta. Nueva cuenta\n" +
                    "\tb. Nuevo apunte\n" +
                    "\tc. Borrar cuenta\n" +
                    "3. Consultas\n" +
                    "\ta. Dado un titular, saldo de todas sus cuentas\n" +
                    "\tb. Dada una cuenta, titulares asociados\n" +
                    "4. Salir\n" +
                    "opcion: ");

            opt = Integer.parseInt(br.readLine());

            switch (opt){
                case 1:

                    System.out.print("Nombre: ");
                    String nombreTit = br.readLine();

                    System.out.print("Apellidos: ");
                    String apellidos = br.readLine();

                    System.out.print("DNI: ");
                    String DNI = br.readLine();

                    System.out.print("fecha alta: ");
                    LocalDateTime fechAlta = LocalDateTime.parse(br.readLine());

                    Titular titular = new Titular(nombreTit, apellidos, DNI, fechAlta);
                    titulars.add(titular);



                    break;

                case 2:

                    System.out.print("\ta. Nueva cuenta\n" +
                            "\tb. Nuevo apunte\n" +
                            "\tc. Borrar cuenta" +
                            "opcion: ");

                    String elec = br.readLine();

                    switch (elec){
                        case "a":
                            System.out.print("IBAN: ");
                            String codigoCuenta = br.readLine();

                            System.out.print("fecha alta: ");
                            LocalDateTime fechAltaI = LocalDateTime.parse(br.readLine());

                            CuentaBancaria cuentaBancaria = new CuentaBancaria(codigoCuenta, fechAltaI);
                            
                    }

                    break;

                case 1:
                    break;

                case 1:
                    break;



            }


        }while (opt !=4);

    }
}