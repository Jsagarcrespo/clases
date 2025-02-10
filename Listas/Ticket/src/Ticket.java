import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {
    private LocalDate fecha;
    private LocalDateTime hora;
    private int numTicket;

    public Ticket(LocalDate fecha, LocalDateTime hora, int numTicket) {
        this.fecha = fecha;
        this.hora = hora;
        this.numTicket = numTicket;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", numTicket=" + numTicket +
                '}';
    }
}
