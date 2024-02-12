import java.util.List;

public class Tripulante extends Jugador {
    private String tipo; // Puede ser "científico" o "ingeniero"
    //fin de los atributos

    //constructor por defecto
    public Tripulante(String nombre, boolean vivo, Seccion posicion, List<Item> items, List<Tarea> tareas, int votosRecibidos, String color) {
        super(nombre, vivo, posicion, items, tareas, votosRecibidos, color);
    }

    // Constructor settes y getters
    public Tripulante(String nombre, boolean vivo, Seccion posicion, List<Item> items, List<Tarea> tareas, int votosRecibidos, String color, String tipo) {
        super(nombre, vivo, posicion, items, tareas, votosRecibidos, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Fin Constructor settes y getters


   // Métodos de los tripulantes
   public void realizarTarea(Tarea tarea) {
       if (this.isVivo()) {
           tarea.realizar();
           System.out.println(this.getNombre() + " ha realizado la tarea " + tarea.getDescripcion() + ".");
       } else {
           System.out.println("Los tripulantes muertos no pueden realizar tareas.");
       }
   }

    public void usarDucto(Ducto ducto) {
        if (this.isVivo() && this.getTipo().equals("ingeniero")) {
            Seccion[] secciones = ducto.getSecciones();
            // Supongamos que el ducto conecta la sección actual del jugador con otra sección
            if (this.getPosicion() == secciones[0]) {
                this.setPosicion(secciones[1]);
            } else {
                this.setPosicion(secciones[0]);
            }
            System.out.println(this.getNombre() + " ha usado un ducto para moverse a la sección " + this.getPosicion().getNombre() + ".");
        } else {
            System.out.println("Solo los ingenieros vivos pueden usar ductos.");
        }
    }

    public void monitorearSignosVitales(List<Jugador> jugadores) {
        if (this.isVivo() && this.getTipo().equals("científico")) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " está " + (jugador.isVivo() ? "vivo" : "muerto") + ".");
            }
        } else {
            System.out.println("Solo los científicos vivos pueden monitorear signos vitales.");
        }
    }


}


/*
                if (tipo.equals("científico")) {
            // Implementa la lógica para monitorear signos vitales aquí
        } else {
            System.out.println("Solo los científicos pueden monitorear signos vitales.");
        }



            if (tipo.equals("ingeniero")) {
            // Implementa la lógica para usar un ducto aquí
        } else {
            System.out.println("Solo los ingenieros pueden usar ductos.");
        }



 */