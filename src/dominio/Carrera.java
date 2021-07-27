
package dominio;

public class Carrera {
    private String nombre;
    private Facultad facultad;

    public Carrera(String nombre, Director director, Facultad facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
}
