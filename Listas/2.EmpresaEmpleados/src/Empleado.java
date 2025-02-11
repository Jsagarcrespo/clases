import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Empleado {

    private String nombre, apellidos;
    private int edad;
    private LocalDate fechaContrato;
    private Empresa empresa;
    private int cont;


    public Empleado(String apellidos, String nombre, int edad, LocalDate fechaContrato,  Empresa empresa) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaContrato = fechaContrato;
        this.cont = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int diasContratado(Empleado empleado) {
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(fechaContrato, hoy);
        return (int) dias;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "fechaContrato=" + fechaContrato +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
