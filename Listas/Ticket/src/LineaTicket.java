import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LineaTicket{

    private String nombre;
    private int unidad;
    private double precio, precioUnidad;
    private Ticket ticket;

    public LineaTicket(String nombre, int unidad, double precio, Ticket ticket) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
        this.ticket = ticket;
        this.precioUnidad = precioUnidad;


        //si no añado esta linea no me lo muestra por la pantalla el bucle que tengo.
        if (ticket != null) {
            ticket.getLineaTicket().add(this);
        }
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

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "nombre='" + nombre + '\'' +
                ", unidad=" + unidad +
                ", precio=" + precio +
                ", ticket=" + ticket +
                '}';
    }
}
