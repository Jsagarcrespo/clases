import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void contarLetras(String texto, int[] contlet){

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                contlet[c - 'A']++;
            } else if (c == 'Ñ') {
                contlet[26]++;
            }
        }

    }

    public static void visualizarRecuento(int[] contlet){
        for (int i = 0; i < contlet.length; i++) {
            if (contlet[i] > 0) {
                if (i < 26) {
                    System.out.println((char) (i + 'A') + ": " + contlet[i]);
                } else {
                    System.out.println("Ñ: " + contlet[i]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] contlet = new int[27];

        System.out.print("introduce el texto: ");
        String texto = br.readLine().toUpperCase();

        contarLetras(texto, contlet);
        visualizarRecuento(contlet);



    }
}