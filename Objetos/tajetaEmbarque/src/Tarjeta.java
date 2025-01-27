public class Tarjeta {
    private int flight, date, time, seat, zone;
    private String clase, origin, destination;


    public Tarjeta(int flight, int date, int time, int seat, int zone, String clase, String origin, String destination) {
        this.flight = flight;
        this.date = date;
        this.time = time;
        this.seat = seat;
        this.zone = zone;
        this.clase = clase;
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "flight=" + flight +
                ", date=" + date +
                ", time=" + time +
                ", seat=" + seat +
                ", zone=" + zone +
                ", clase='" + clase + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
