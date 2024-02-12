import java.util.HashMap;
import java.util.Map;

public class Mapa {
    // Atributo que representa las secciones del mapa
    private Map<String, Seccion> secciones;

    // Constructor
    public Mapa() {
        secciones = new HashMap<>();
    }

    // Método para añadir una sección al mapa
    public void añadirSeccion(String nombre, Seccion seccion) {
        secciones.put(nombre, seccion);
    }

    // Método para obtener una sección del mapa
    public Seccion obtenerSeccion(String nombre) {
        return secciones.get(nombre);
    }


}
