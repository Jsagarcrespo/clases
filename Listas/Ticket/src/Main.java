import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String respuesta = "";
        System.out.print("fecha: ");
        LocalDate fecha = LocalDate.parse(br.readLine());

        System.out.println("hora: ");
        LocalDateTime hora = LocalDateTime.now();

        System.out.println(hora);

        System.out.print("Numero de ticket: ");
        int numTicket = Integer.parseInt(br.readLine());

        Ticket ticket = new Ticket(fecha, hora, numTicket);

        //CON ESTE METODO SE ME DUPLICA

       // LineaTicket lineaTicket = null;

        System.out.println(ticket);

        do {

            System.out.println("Nombre producto");
            String nombre = br.readLine();

            System.out.println("Unidad: ");
            int unidad = Integer.parseInt(br.readLine());

            System.out.println("Precio: ");
            double precio = Double.parseDouble(br.readLine());

            //CON ESTE METODO SE ME DUPLICA
            // lineaTicket = new LineaTicket(nombre, unidad, precio, ticket);

            new LineaTicket(nombre, unidad, precio, ticket);

            System.out.print("quieres salir: ");
            respuesta = br.readLine();

        } while (!respuesta.equalsIgnoreCase("si"));

        System.out.println("Resumen ticket: ");
        double tl = 0;

        for (LineaTicket linea : ticket.getLineaTicket()) {
            double totalLinea = linea.getPrecio() * linea.getUnidad();
            System.out.printf("\nProducto: %s \n" +
                            "Unidades: %d \n" +
                            "Precio Total: %.2f",
                    linea.getNombre(),
                    linea.getUnidad(),
                    totalLinea);

            //CON ESTE METODO SE ME DUPLICA

            /*System.out.println(lineaTicket);
            System.out.println(totalLinea);*/


            tl += totalLinea;
        }
    }
}