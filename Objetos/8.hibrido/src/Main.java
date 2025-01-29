import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Marca: ");
        String marca = br.readLine();

        System.out.print("Modelo: ");
        String modelo = br.readLine();

        System.out.print("Color: ");
        int color = Integer.parseInt(br.readLine());
        
        // Iniciamos basicamente para que en el if de arrancado nos deje usar los atributos del motor
        // Si queremos acceder a los datos dentro de el necesitos que haya algun dato dentro de el al menos
        Coche coche = new Coche(marca, modelo, color);

        System.out.print("tipo de motor: ");
        String tipoMotor = br.readLine();

        System.out.print("Esta arrancado: ");
        // Con este metodo podemos hacer que podamos elegir el boolean en modo string
        boolean arrancado = br.readLine().trim().equalsIgnoreCase("si");

        // Tambien podemos poner if (true)
        // Con este metodo usamos los dos metodos que hemos creado en moto que se nos pedia
        if (arrancado){
            coche.getMotor().isArrancado();
        } else {
            coche.getMotor().parar();
        }

        System.out.print("potencia: ");
        int potencia = Integer.parseInt(br.readLine());

        // POR SI QUEREMOS PODER USAR LAS VARIBLES FUERA DEL IF
        MotorCombustionInterna motorCombustionInterna;
        MotorElectrico motorElectrico;

        int cilindrada = 0 ;
        String  combustible = "";
        String bateria = "";

        if (tipoMotor.equalsIgnoreCase("combustion")){
            System.out.print("Cilindrada: ");
            cilindrada = Integer.parseInt(br.readLine());

            System.out.print("Combustible: ");
            combustible = br.readLine();

            // MotorCombustionInterna motorCombustionInterna = new MotorCombustionInterna(potencia, cilindrada, combustible, arrancado);
            // System.out.println(motorCombustionInterna);
        } else if (tipoMotor.equalsIgnoreCase("Electrico")) {
            System.out.print("Tipo bateria: ");
            bateria = br.readLine();
        }

        System.out.println("***********");

        motorCombustionInterna = new MotorCombustionInterna(potencia, cilindrada, combustible, arrancado);
        motorElectrico = new MotorElectrico(arrancado, potencia, bateria);

        // Para que pueda elelgri entre dos opciones pero sin tanto codigo que escribir
        System.out.println(tipoMotor.equalsIgnoreCase("combustion") ? motorCombustionInterna : motorElectrico);

        System.out.println("***********");
        
        // POR SI LO QUEREMOS MOSTRAR LAS DOS FUERA DE LOS FI
        // Combustion
        System.out.println(motorCombustionInterna);
        // Electrico
        System.out.println(motorElectrico);

        System.out.println("======================");
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Diametro: ");
            int diametro = Integer.parseInt(br.readLine());

            coche.getRueda()[i] = new Rueda(diametro, coche);

            //No es necesario ya que esto nos lo mostrara cada vez que haga el bucle para ello usaremos otro for para llamarlo
            //System.out.println(coche.getRueda()[i]);

            /*
            coche = new Coche(marca, modelo, color, coche.getMotor() );
            System.out.println(coche);
            */

            System.out.println("/////////////////////");
        }

        //para imprimir todo
        for (Rueda rueda : coche.getRueda()) {
            System.out.println(rueda);
        }

    }
}