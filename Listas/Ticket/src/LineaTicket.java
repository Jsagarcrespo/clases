import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LineaTicket extends Ticket{

    private String nombre;
    private int unidad;
    private double precio, precioUnidad;
    List<Ticket> tickets = new ArrayList<>();

    public LineaTicket(LocalDate fecha, LocalDateTime hora, int numTicket, String nombre, int unidad, double precio, double precioUnidad, List<Ticket> tickets) {
        super(fecha, hora, numTicket);
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
        this.precioUnidad = precioUnidad;
        this.tickets = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioUnidad(){
       return this.precio * this.unidad;
    }
}
