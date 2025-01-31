public class Rueda {

    private int diametro;

    // Como se explica en el readme no hace falta que la relacion sea bidireccional ya que es de agregacion
    // Solamente se hizo bidireccional porque el profe lo pidio pero no es necesario

    //vincular con coche
  //  private Coche coche;

    public Rueda(int diametro) {
        this.diametro = diametro;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

   /* public Coche getCoche() {
        return coche;
    }*/

   /* public void setCoche(Coche coche) {
        this.coche = coche;
    }*/

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro='" + diametro  +
                '}';
    }
}
