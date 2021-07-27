package dominio;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Facultad> facultades;

    public Universidad(String nombre, List<Facultad> facultades) {
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
        this.facultades = facultades;
    }

    public boolean addFacultad(Facultad f) {
        return facultades.add(f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }

}
