import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private String codigoCuetna;
    private LocalDateTime fechaAlta;

    public double calcualarSaldo(){
        return 1;
    }

    public double nuevoApunte(double cantidad){
        return 1;
    }

    List<Titular> titulars;
    List<Apunte> apuntes;

    public CuentaBancaria(String codigoCuetna, LocalDateTime fechaAlta) {
        this.codigoCuetna = codigoCuetna;
        this.fechaAlta = fechaAlta;
        titulars = new ArrayList<>();
        apuntes = new ArrayList<>();
    }

    public String getCodigoCuetna() {
        return codigoCuetna;
    }

    public void setCodigoCuetna(String codigoCuetna) {
        this.codigoCuetna = codigoCuetna;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Titular> getTitulars() {
        return titulars;
    }

    public void setTitulars(List<Titular> titulars) {
        this.titulars = titulars;
    }

    public List<Apunte> getApuntes() {
        return apuntes;
    }

    public void setApuntes(List<Apunte> apuntes) {
        this.apuntes = apuntes;
    }
}
