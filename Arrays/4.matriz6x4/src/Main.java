import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void generarMatriz(double[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] =  ((Math.random() * 20) -10);
            }
        }

    }

    public static void visualizar(double[][] matriz){
        for (double[] amatriz : matriz){
            for (double intMatri : amatriz){
                // En format la estructura de f sirve para los double ya que indica donde estaria la coma
                // para enteros solo ponemos la: d
                System.out.format("%8.1f", intMatri);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[][] matriz = new double[6][4];

        generarMatriz(matriz);
        visualizar(matriz);

    }
}