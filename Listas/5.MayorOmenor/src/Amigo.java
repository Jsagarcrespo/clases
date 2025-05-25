import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Objects;

// Importante fijarse en la parte de arriba porque si no no va el el compareTo
public class Amigo implements Comparable<Amigo> {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Amigo(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static int edad(LocalDate fecha){
        return Period.between(fecha, LocalDate.now()).getYears();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Amigo amigo = (Amigo) o;
        return Objects.equals(nombre, amigo.nombre) && Objects.equals(fechaNacimiento, amigo.fechaNacimiento);
    }


    @Override
    public int compareTo( Amigo amigo) {
        return this.getFechaNacimiento().compareTo(amigo.getFechaNacimiento());
    }
}
