// Importante para saber a quien nos refereimos
public class Maquina implements Visualizable{

    private String marca, modelo, sn;

    public Maquina(String marca, String modelo, String sn) {
        this.marca = marca;
        this.modelo = modelo;
        this.sn = sn;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    // Necesitamos implementar el metodo visualizable porque sino necesitariamos
    // declararlo abstracta
    @Override
    public  void visualizar() {
        System.out.format(" %s, %s, %s", marca, modelo, sn);
    }
}
