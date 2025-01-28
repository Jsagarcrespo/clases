import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Marca");
        String marca = br.readLine();

        System.out.print("modelo");
        String modelo = br.readLine();

        System.out.print("color");
        int color = Integer.parseInt(br.readLine());

        Coche coche = new Coche(marca, modelo, color); 

        System.out.print("Cuantos motores: ");
        int cantMotor = Integer.parseInt(br.readLine());

        for (int i = 0; i < cantMotor; i++) {
            System.out.print("Esta arrancado: ");
            String arrancado = br.readLine();

            System.out.print("Potencia: ");
            int potencia = Integer.parseInt(br.readLine());

            System.out.print("Cilindrada: ");
            int cilindrada = Integer.parseInt(br.readLine());

           System.out.print("Combustible: ");
            int combustible = Integer.parseInt(br.readLine());

           
            
        }






    }
}