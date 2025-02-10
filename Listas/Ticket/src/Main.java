import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("fecha: ");
        LocalDate fecha = LocalDate.parse(br.readLine());

        System.out.print("hora: ");
        LocalDateTime hora = LocalDateTime.parse(br.readLine());

        System.out.print("Numero de ticket: ");
        int numTicket = Integer.parseInt(br.readLine());

        Ticket ticket = new Ticket(fecha, hora, numTicket);

        System.out.println(ticket);





    }
}