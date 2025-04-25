import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Empleado {

    private String nombre, apellidos;
    private int edad;
    private LocalDate fechaContrato;

    public int diasContratado(){
        LocalDate diaActual = LocalDate.now();

        return (int) ChronoUnit.DAYS.between(fechaContrato, diaActual); // Cálculo correcto de días totales
    }

    private Empresa empresa;

    public Empleado(String nombre, int edad, String apellidos, LocalDate fechaContrato, Empresa empresa) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.fechaContrato = fechaContrato;
        this.empresa = empresa;
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


}
