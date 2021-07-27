
package dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String id;
    private List<Materia> materias = new ArrayList<>();

    public Estudiante(String nombre, String apellido, int edad, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }
    public boolean addMaterias(Materia m){
        return materias.add(m);
    }
    public String getNombre() {
        return nombre;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    public List<Materia> getMaterias() {
        return materias;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
