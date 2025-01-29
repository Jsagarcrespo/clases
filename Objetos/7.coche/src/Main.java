import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Marca: ");
        String marca = br.readLine();

        System.out.print("modelo: ");
        String modelo = br.readLine();

        System.out.print("color: ");
        int color = Integer.parseInt(br.readLine());

        Coche coche = new Coche(marca, modelo, color);

        System.out.println(coche);

        System.out.print("Cuantos motores: ");
        int cantMotor = Integer.parseInt(br.readLine());

        for (int i = 0; i < cantMotor; i++) {
            System.out.println("cantidad motores = " + cantMotor);

            System.out.print("Esta arrancado: ");
            boolean arrancado = Boolean.parseBoolean(br.readLine());

            System.out.print("Potencia: ");
            int potencia = Integer.parseInt(br.readLine());

            System.out.print("Cilindrada: ");
            int cilindrada = Integer.parseInt(br.readLine());

            System.out.print("Combustible: ");
            String combustible = br.readLine();

            // importante guaradar los valores por cada iteracion que haga
            coche.getMotor()[i] = new Motor(arrancado,potencia, cilindrada, combustible, coche);

            System.out.println(coche.getMotor()[i]);

        }

        System.out.print("cuantas puertas: ");
        int cantPuertas = Integer.parseInt(br.readLine());

        for (int i = 0; i < cantPuertas; i++) {
            System.out.print("Tiene elevalunas: ");
            Boolean elevalunas = Boolean.parseBoolean(br.readLine());

            coche.getPuerta()[i] = new Puerta(elevalunas);
            System.out.println(coche.getPuerta()[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Diametro: ");
            int diametro = Integer.parseInt(br.readLine());

            coche.getRueda()[i] = new Rueda(diametro);
            System.out.println(coche.getRueda()[i]);
        }

    }
}