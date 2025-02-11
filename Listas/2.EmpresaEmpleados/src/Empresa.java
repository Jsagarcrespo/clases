import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private LocalDate fechaFundacion;
    private List<Empleado> empleados;

    public Empresa(String nombre, LocalDate fechaFundacion) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "fechaFundacion=" + fechaFundacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
