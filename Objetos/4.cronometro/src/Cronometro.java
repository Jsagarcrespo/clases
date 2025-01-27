public class Cronometro {
    private long horaIncio;

    public Cronometro() {
        // para registrar el tiempo actual en nano segundos
        this.horaIncio = System.nanoTime();
    }

    public long getHoraIncio() {
        return System.nanoTime() - horaIncio;

    }
}
