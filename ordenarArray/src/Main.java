import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] generarAle(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }

        return array;
    }

    public static void visualizar(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println(" ");

    }

    public static int[] ordenar(int[] array){
        int[] copia = array.clone();

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia.length - 1; j++) {
                int actual = copia[j];
                int siguiente = copia[j + 1];

                // Tener en cuenta esto
                if (actual > siguiente){
                    copia[j] = siguiente;
                    copia[j +1] = actual;

                }

            }
        }
        return copia;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        generarAle(array);

        System.out.println("Array originar: ");
        visualizar(array);

        System.out.println("Array ordenado: ");
        int[] ordenarArray = ordenar(array);
        visualizar(ordenarArray);





    }
}
