package dominio;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private String descripcion;
    private String nrc;
    private List<Estudiante> estudiantes= new ArrayList<>();
    private List<Profesor> docentes= new ArrayList<>();

    public Materia(String nombre, String descripcion, String nrc) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nrc = nrc;

    }
    public boolean addProfesor(Profesor p){
        return docentes.add(p);
    }
    public boolean addEstudiante(Estudiante e){
       
        return estudiantes.add(e);
    }
    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Profesor> docentes) {
        this.docentes = docentes;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
