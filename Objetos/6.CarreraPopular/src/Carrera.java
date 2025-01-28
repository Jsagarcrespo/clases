public class Carrera {


    private long time;
    private Marca[] marca;
    private int contador;

    private Carrera(){
        marca = new Marca[1000];
        contador = 0;
    }

    private static Carrera carrera; //instancia
    public static Carrera getCarrera() {//instancia
        // necesario para que no me salga el error NullPointerException
        if (carrera == null) {
            carrera = new Carrera();
        }
        return carrera;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public Marca[] getMarca() {
        return marca;
    }

    public void setMarca(Marca[] marca) {
        this.marca = marca;
    }

    public void registrarMarca(Marca clasificacion){

        if (contador < marca.length) {
            // Aqui le diremos que nos registre la marca de la persona, primera persona en registrarse
            // contador = 0; con lo que marca[0] = clasificacion, se le guardara el tiempo que ha hecho.
            marca[contador] = clasificacion;
            contador++;
        } else {
            System.out.println("No se pueden registrar mas participantes.");
        }
    }

    public void verClasificacion() {

        // para ordenar las marcars primero veremos todos los elementos del array del primero al penultimo
        // para ahorrar tiempo
        for (int i = 0; i < contador - 1; i++) {
            // reducimos el rango del bucle interno para que los numeros mas grandes vayan hacia el final
            for (int j = 0; j < contador - i - 1; j++) {
                if (marca[j].getTime() > marca[j + 1].getTime()) {
                    Marca temp = marca[j];
                    marca[j] = marca[j + 1];
                    marca[j + 1] = temp;
                }
            }
        }

        System.out.println("--- Clasificacion --------------");
        for (int i = 0; i < contador; i++) {
            // Hay que tener cuidado con como creamos el format porque si no a la hora de imprimir en pantalla nos puede dar errores
            // por ejemplo si hubieramos puesto System.out.printf("%03d | %-15s | %7.2f\n"...), ese %03d esta indicando un Integer
            System.out.printf("%-15s | %-15s | %7.2f\n",
                    marca[i].getParticipante().getDorsal(),
                    marca[i].getParticipante().getNombre(),
                    marca[i].getTime() // Asegúrate de usar getTime()
            );
        }
        System.out.println("--------------------------------");

    }

}
