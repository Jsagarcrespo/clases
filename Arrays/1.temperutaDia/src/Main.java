import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] horas = new int[7];
        int suma = 0;
        int temp;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;


        for (int i = 0; i < horas.length; i++) {
            System.out.print("Introduce temp: ");
            temp = Integer.parseInt(br.readLine());

            horas[i] = temp;

            suma += horas[i];

            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }

        }

        for (int i = 0; i < horas.length; i++) {
            System.out.print(i + "  ");

            for (int j = 0; j < horas[i]; j++) {
                System.out.print("*");
            }

            if (horas[i] == max){
                System.out.print(" --> MAX");
            }
            if (horas[i] == min){
                System.out.print(" --> MIN");
            }

            System.out.println("");
        }

        System.out.println("media: " + suma / 7);
    }
}