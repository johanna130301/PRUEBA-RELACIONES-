
package dominio;

import java.util.List;


public class Profesor {
    private String nombre;
    private String cedula;
    private List<Materia> materias;
    private Facultad facultad;

    public Profesor(String nombre, String cedula, Facultad fac) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.facultad= fac;
    }
    public boolean addMaterias(Materia m){
        return materias.add(m);
    }
    public String getNombre() {
        return nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
}
