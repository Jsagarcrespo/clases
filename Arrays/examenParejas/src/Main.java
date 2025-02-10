import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// NO TOCAR
public class Main {
    private static final char[][] letras = new char[][]{
            {'A', 'C', 'D', 'E'},
            {'C', 'B', 'D', 'B'},
            {'F', 'A', 'E', 'F'},
    };

    private static final boolean[][] visibles = new boolean[][]{
            {true, false, true, true},
            {false, true, true, true},
            {false, true, true, false},
    };
// NO TOCAR


    // FUNCIONES

    public static boolean terminado(){
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if (!visibles[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean jugada(int fila, int columna, int fila2, int columna2){
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                char letra1 = letras[fila][columna];
                char letra2 = letras[fila2][columna2];

                if (letra1 == letra2){
                    visibles[fila][columna] = true;
                    visibles[fila2][columna2] = true;
                    return true;

                }
            }
        }
        return false;
    }

    public static void visualizar(){
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if (visibles[i][j]){
                    System.out.format("%3s", letras[i][j]);

                }else {
                    System.out.print("  .");
                }

            }
            System.out.println("");
        }
    }

    // FUNCIONES 

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int posicion = 0;

        visualizar();

        do {
            System.out.println( ", introduce fila1 (1-3) y columna1 (1-4): ");
            int fila = Integer.parseInt(br.readLine()) - 1;
            int columna = Integer.parseInt(br.readLine()) - 1;

            System.out.println( ", introduce fila2 (1-3) y columna2 (1-4): ");
            int fila2 = Integer.parseInt(br.readLine()) - 1;
            int columna2 = Integer.parseInt(br.readLine()) - 1;

            if (jugada(fila, columna, fila2, columna2)) {
                System.out.println("Coinciden");
            } else {
                System.out.println("No coinciden");
            }

            visualizar();

        } while (!terminado());
        System.out.println("Juego terminado...");

    }
}