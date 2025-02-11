import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private LocalDateTime hora;
    private int numTicket;
    private List<LineaTicket> lineaTicket;

    public Ticket(LocalDate fecha, LocalDateTime hora, int numTicket) {
        this.fecha = fecha;
        this.hora = hora;
        this.numTicket = numTicket;
        this.lineaTicket = new ArrayList<>();


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

    public List<LineaTicket> getLineaTicket() {
        return lineaTicket;
    }

    public void setLineaTicket(List<LineaTicket> lineaTicket) {
        this.lineaTicket = lineaTicket;
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
