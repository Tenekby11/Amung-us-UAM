import java.util.ArrayList;
import java.util.List;

public class Seccion {
    // Atributos de la sección
    private String nombre;
    private List<Tarea> tareas;
    private Tarea tareaSabotaje;
    private Ducto[] ductos;

    // Constructor
    public Seccion(String nombre, Tarea tareaSabotaje, Ducto[] ductos) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.tareaSabotaje = tareaSabotaje;
        this.ductos = ductos;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public Tarea getTareaSabotaje() {
        return tareaSabotaje;
    }

    public void setTareaSabotaje(Tarea tareaSabotaje) {
        this.tareaSabotaje = tareaSabotaje;
    }

    public Ducto[] getDuctos() {
        return ductos;
    }

    public void setDuctos(Ducto[] ductos) {
        this.ductos = ductos;
    }




    // Métodos de la sección
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void sabotear() {
        // Implementa la lógica para sabotear aquí
    }


}
