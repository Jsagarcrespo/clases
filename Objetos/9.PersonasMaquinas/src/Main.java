public class Main {

    /**
     * No se puede modificar la función main()
     */
    public static void main(String[] args) {

        Visualizable[] datos = new Visualizable[2];

        datos[0] = new Maquina("Braun", "BNE-001-BK", "0000-0000-0001");
        datos[1] = new Persona("Arthur", "Dent", 42);

        for (Visualizable dato : datos) {
            dato.visualizar();
        }
    }
}
