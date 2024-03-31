package umariana.organizadortareas;

/**
 *
 * @author Juan Eraso
 */
public class Tarea {
    
    //Atributos
    private int idTarea;
    private String descripcion;
    private int prioridad;
    
    //Constructores
    public Tarea() {
    }

    public Tarea(int idTarea, String descripcion, int prioridad) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    
    //Getters & Setters
    public int getIdTarea() {
        return idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
