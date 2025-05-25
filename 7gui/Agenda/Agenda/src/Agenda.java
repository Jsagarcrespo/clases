import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contacto> contactos = new ArrayList<>(); // le quito para que pueda usarlo en otros objetos

    public List<Contacto> getContactos() {
        return contactos;
    }

    private Contacto contacto;

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void nuevo(Contacto contacto){
        contactos.add(contacto);
    }

    public Contacto bucar(String consulta, CampoBusqueda filtro){
        for (Contacto con : contactos){
            if (filtro == CampoBusqueda.NOMBRE && con.getNombre().equalsIgnoreCase(consulta)){
               return con;
            } else if (filtro == CampoBusqueda.TELEFONO && con.getTelefono().equalsIgnoreCase(consulta)){
                return con;
            } else if (filtro == CampoBusqueda.EMAIL && con.getTelefono().equalsIgnoreCase(consulta)){
                return con;
            }
        }
        return null;
    }

    public int numContactos(){
        return contactos.size();
    }

}
