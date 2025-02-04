import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TiendaSingleton tiendaSingleton = TiendaSingleton.getInstanacia();

        int opt = 0;
        int cont = 0;

        Vendible[] vendibles = new Vendible[10];


        do {
            System.out.println("");
            System.out.print("1. Crear nuevo vehículo\n" +
                    "2. Listar todos los vehículos\n" +
                    "3. Vender un vehículo\n" +
                    "4. Salir\n" +
                    "Opcion: ");
            opt = Integer.parseInt(br.readLine());

            switch (opt){
                case 1:


                    System.out.print("Marca: ");
                    String marca = br.readLine();

                    System.out.print("Modelo: ");
                    String modelo = br.readLine();

                    System.out.print("año: ");
                    int anio = Integer.parseInt(br.readLine());

                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(br.readLine());

                    System.out.println("Tipo de Vehiculo (COCHE / MOTO): ");
                    String tipoVehiculo = br.readLine();

                    TipoVehiculo tipoVehiculo1 = null;

                    switch (tipoVehiculo){
                        case "COCHE":
                            tipoVehiculo1 = TipoVehiculo.COCHE;
                            System.out.print("Num Puertas: ");
                            int numPuertas = Integer.parseInt(br.readLine());

                            break;

                        case "MOTO":
                            tipoVehiculo1 = TipoVehiculo.MOTO;
                            System.out.println("cilindrada");
                            int cilindrada = Integer.parseInt(br.readLine());
                            break;
                    }

                        tiendaSingleton.getVehiculo()[cont] = new Vehiculo(marca, modelo, anio, precio, tipoVehiculo1 , false);
                        tiendaSingleton.anyadirVehiculo(tiendaSingleton.getVehiculo()[cont]);

                        vendibles[cont] = new Vehiculo(marca, modelo, anio, precio, tipoVehiculo1, false);

                        cont++;

                    break;

                case 2:
                    /*for (int i = 0; i < cont; i++) {
                        tiendaSingleton.getVehiculo()[i].vendible();
                    }*/

                    System.out.println(cont + " " + ((cont > 1) ? "Vehiculos: " : "Vehiculo: "));
                    tiendaSingleton.listarVehiculos();

                    break;

                case 3:
                    tiendaSingleton.listarVehiculos();

                    System.out.println("Que coche quieres vender");
                    int num = Integer.parseInt(br.readLine());

                    System.out.print("Quires vender el vehiculo? : ");
                    boolean vendido = br.readLine().trim().equalsIgnoreCase("si");


                    break;

                case 4:

                    break;

                default:

                    break;




            }


        }while(opt != 4);

    }
}