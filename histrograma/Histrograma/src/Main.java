import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] generarDatos(int num) {
        int[] generar = new int[num];

        for (int i = 0; i < generar.length; i++) {
            generar[i] = (int) (Math.random() * 10);
        }

        return generar;
    }


    public static void visualizar(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int[] calcularFrecuencias(int[] array){

        // necesitamos iterar en algo que no sea el array
        int[] frecuencia = new int[10];

        for(int i = 0; i < array.length; i++){
           // if (array[i] >= 0 && array[i] < 10) {
                frecuencia[array[i]]++;
            //}
        }
        return frecuencia;
    }


    public static void historgrama(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Numero de valores aleatorios: ");
        int num = Integer.parseInt(br.readLine());

        int[] array = new int[num];

        // Para que aqui no tenga que hacer int[] array = podemos hacer esto.
        int[] arrayGenerado = generarDatos(num);
        visualizar(arrayGenerado);

        System.out.println("Frecuencias");
        int[] frecuencia = calcularFrecuencias(arrayGenerado);
        visualizar(frecuencia);


        // mirarme esto
        System.out.println("histograma");
        historgrama(frecuencia);


    }

}