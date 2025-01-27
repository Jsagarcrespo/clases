public class Grupo {

    private String codigo;

    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private Alumno[] alumno = new Alumno[2];

    public Alumno[] getAlumno() {
        return alumno;
    }
}
