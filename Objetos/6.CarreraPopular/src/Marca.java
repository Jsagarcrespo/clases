import java.util.PrimitiveIterator;

public class Marca {
    private double time;

    public Participante participante;
    public Carrera carrera;


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
