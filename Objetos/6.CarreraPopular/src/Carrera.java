public class Carrera {
    private long time;
    private Marca[] marca;
    private int contador;

    private Carrera(){
        marca = new Marca[1000];
        contador = 0;

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

            marca[contador] = clasificacion;
            contador++;
        } else {
            System.out.println("No se pueden registrar mas participantes.");
        }
    }

    public void verClasificacion() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (marca[j].getTiempo() > marca[j + 1].getTiempo()) {
                    Marca temp = marca[j];
                    marca[j] = marca[j + 1];
                    marca[j + 1] = temp;
                }
            }
        }

        System.out.println("--- Clasificacion --------------");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%03d | %-15s | %7.2f\n",
                    Integer.parseInt(marca[i].getParticipante().getDorsal()),
                    marca[i].getParticipante().getNombre(),
                    marca[i].getTiempo()
            );
        }
        System.out.println("--------------------------------");
    }

}
