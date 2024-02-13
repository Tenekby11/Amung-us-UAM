import java.util.List;

public class Impostor extends Jugador {

    private boolean cambiaFormas;
    //fin de los atributos

    //constructor por defecto
   public Impostor(String nombre, boolean vivo, Seccion posicion, List<Item> items, List<Tarea> tareas, int votosRecibidos, Color color) {
        super(nombre, vivo, posicion, items, tareas, votosRecibidos, color);
    }

    // Constructor getters y setters
    public Impostor(String nombre, boolean vivo, Seccion posicion, List<Item> items, List<Tarea> tareas, int votosRecibidos, Color color, boolean cambiaFormas) {
        super(nombre, vivo, posicion, items, tareas, votosRecibidos, color);
        this.cambiaFormas = cambiaFormas;
    }

    public boolean isCambiaFormas() {
        return cambiaFormas;
    }

    public void setCambiaFormas(boolean cambiaFormas) {
        this.cambiaFormas = cambiaFormas;
    }



    // Métodos específicos de los impostores
    public void asesinar(Jugador jugador) {
        if (this.isVivo()) {
            System.out.println(this.getNombre() + " ha asesinado a " + jugador.getNombre() + ".");
            jugador.setVivo(false);
        } else {
            System.out.println("Los impostores muertos no pueden asesinar.");
        }
    }

    public void sabotear() {
        System.out.println(this.getNombre() + " ha saboteado una sección.");
    }

    // Si el impostor es un cambiaformas, puede cambiar su forma

    public void cambiarForma(Jugador jugador) {
        if (cambiaFormas) {
            // Guarda el nombre original del impostor (es una variable)
            String nombreOriginal = this.getNombre();

            // Cambia el nombre del impostor al nombre del jugador objetivo
            this.setNombre(jugador.getNombre());

            System.out.println(nombreOriginal + " ha cambiado su forma a " + jugador.getNombre() + ".");
        } else {
            System.out.println("Solo los impostores cambiaformas pueden cambiar de forma.");
        }
    }





}
