
package dominio;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Carrera> carreras  =new ArrayList<>();
    private List<Profesor> profesores =new ArrayList<>();
    private Director director;
    private Universidad universidad;

    public Facultad(String nombre, Director director, Universidad universidad) {
        this.nombre = nombre;
        this.director = director;
        this.universidad = universidad;
    }

  
    public boolean addCarrera(Carrera c){
        return carreras.add(c);
    }
    public boolean addProfesor(Profesor p){
        return profesores.add(p);
    }
    public String getNombre() {
        return nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    public void setDirector(Director director) {
        this.director = director;
    }
    
    public Director getDirector() {
        return director;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
   
}
