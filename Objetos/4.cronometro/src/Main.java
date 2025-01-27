import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        int contador = 0;
        Cronometro[] crono = new Cronometro[3];

        do {

            System.out.print("1. Nuevo cronómetro.\n" +
                    "2. Consultar cronómetro.\n" +
                    "3. Salir.\n" +
                    "opcion: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion){
                case 1:

                    if (contador < crono.length){
                        crono[contador] = new Cronometro();
                        System.out.println(contador + "º crono: ");

                        // para asinar en la posicion del array, con lo que vamos a tener que ir sumando el contador para que nos vaya creandolos
                        System.out.println(crono[contador].getHoraIncio());
                    } else {
                        System.out.println("Te pasas de cronometro");
                    }

                    // comenzamos en un principio en contador a cero, pero en cada loop se va sumando 1, con lo que con el 3 loop ya se abra sumado hasta 3
                    // con lo que en la linea 44 el if quedaria tal que: (elect >= 0 && elect < 3 && crono[elect] != null)
                    contador++;
                    break;

                case 2:
                    System.out.print("Elige el cronómetro: ");
                    int elect = Integer.parseInt(br.readLine());

                    // Con esto nos permitira ver si hay alguna coincidencia con el
                    if (elect >= 0 && elect < contador && crono[elect] != null) {
                        System.out.println(crono[elect].getHoraIncio());
                    } else {
                        System.out.println("Cronómetro no encontrado. Por favor, elige otro.");
                    }

                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 3);

    }
}
