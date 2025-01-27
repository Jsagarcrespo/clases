import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // para que no me pida nada dentro de Robot() tengo que crear un constructo sin nada dentro de: public Robot()
        Robot Robot = new Robot();
        Robot.imprimirPosicion();

        String inputX = "";

        do {

            System.out.print("Movimiento de X: ");
            inputX = br.readLine();

            if (inputX.equalsIgnoreCase("salir") ){
                System.out.println("SALIENDO");
                break;
            }

            try{
                // TENER CUIDADO DENTRO DE PARSEINT PONER (inputX) no br.readline
                int numeroX = Integer.parseInt(inputX);

                System.out.print("Movimiento Y: ");
                int numeroY = Integer.parseInt(br.readLine());

                if ((numeroX < -1 || numeroX > 1) || (numeroY < -1 || numeroY > 1)) {
                    System.out.println("Solo valores entre -1, 0 y 1.");
                } else {
                    Robot.mover(numeroX, numeroY);
                }
            }catch (NumberFormatException e){
                System.out.println("solo numeros");
            }



        } while (!inputX.equalsIgnoreCase("salir"));

    }
}