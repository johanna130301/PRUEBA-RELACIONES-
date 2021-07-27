
package dominio;


public class Director {
    private String nombre;
    private String cedula;
    private String id;

    public Director(String nombre, String cedula, String id) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
