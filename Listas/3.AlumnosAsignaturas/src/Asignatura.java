import java.util.ArrayList;
import java.util.List;

public class Asignatura {

    private String nombre;
    private int horasSemanles;

    List<Alumno> alumnos;

    public Asignatura(String nombre, int horasSemanles) {
        this.nombre = nombre;
        this.horasSemanles = horasSemanles;
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanles() {
        return horasSemanles;
    }

    public void setHorasSemanles(int horasSemanles) {
        this.horasSemanles = horasSemanles;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
