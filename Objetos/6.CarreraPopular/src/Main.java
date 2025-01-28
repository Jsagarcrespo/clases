import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // en el objeto de Carrera getCarrera la tengo que hacer estatica si no no podre acceder a el
        // si no quremos hacerlo estatica podemos hacer como hemos echo con Participante pero
        // dentro de Marca tendriamos que poner sus valores, si en el constructor tuvieramos algo, sino tendria que ser publico Carrera
        Carrera carrera = Carrera.getCarrera();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String dorsal = " ";
        long inicio = System.nanoTime();

        do {
            System.out.print("escribe un dorsal: ");
            dorsal = br.readLine();

            if (dorsal.equalsIgnoreCase("fin")){
                break;
            }

            System.out.print("Nombre: ");
            String nombre = br.readLine();

            double tiempo = (System.nanoTime() - inicio) / 1_000_000_000.0;

            Participante participante = new Participante(dorsal, nombre);
            Marca marca = new Marca(tiempo, participante, carrera);

            participante.setMarca(marca);
            marca.setParticipante(participante);
            marca.setCarrera(carrera);

            carrera.registrarMarca(marca);


        }while (!dorsal.equalsIgnoreCase("FIN"));

        carrera.verClasificacion();

    }
}