import java.time.LocalDate;

public class Cargador {

    private int potenciaMax, numEnchufes;
    private  double latitud, longitud;
    private LocalDate ultimaActualizador;

    private Ciudad ciudad;

    public Cargador(int potenciaMax, int numEnchufes, double latitud, double longitud, LocalDate ultimaActualizador) {
        this.potenciaMax = potenciaMax;
        this.numEnchufes = numEnchufes;
        this.latitud = latitud;
        this.longitud = longitud;
        this.ultimaActualizador = ultimaActualizador;
        ciudad = ciudad;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public int getNumEnchufes() {
        return numEnchufes;
    }

    public void setNumEnchufes(int numEnchufes) {
        this.numEnchufes = numEnchufes;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public LocalDate getUltimaActualizador() {
        return ultimaActualizador;
    }

    public void setUltimaActualizador(LocalDate ultimaActualizador) {
        this.ultimaActualizador = ultimaActualizador;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }


    @Override
    public String toString() {
        return "Cargador{" +
                "potenciaMax=" + potenciaMax +
                ", numEnchufes=" + numEnchufes +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", ultimaActualizador=" + ultimaActualizador +
                '}';
    }
}
