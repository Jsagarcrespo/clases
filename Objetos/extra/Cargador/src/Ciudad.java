import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ciudad {

    private String nombre;
    private int contCargador = 0;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        cargadors = new ArrayList<>();

    }

    private List<Cargador> cargadors;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return ciudad.nombre != null && nombre.equalsIgnoreCase(ciudad.nombre);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cargador> getCargadors() {
        return cargadors;
    }

    public void setCargadors(List<Cargador> cargadors) {
        this.cargadors = cargadors;
    }
    
    public void addCargador(Cargador cargador){
        if (cargador != null) {
            cargadors.add(cargador);
        }
        contCargador++;
    }

    public int numCargadores(){
        return contCargador;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
