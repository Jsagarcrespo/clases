// añadir implements
public class Persona implements Visualizable {

    private String nombre, apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Necesitamos implementar el metodo visualizable porque sino necesitariamos
    // declararlo abstracta
    @Override
    public void visualizar(){
        System.out.format("\n %s, %s, %d", nombre, apellido, edad);
    }
}
