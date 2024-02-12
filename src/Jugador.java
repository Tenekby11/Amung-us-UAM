import java.util.ArrayList;
import java.util.List;

    public abstract class Jugador {
    // Atributos comunes a todos los jugadores
    private String nombre;
    private boolean vivo;
    private Seccion posicion;
    private List<Item> items;
    private List<Tarea> tareas;
    private int votosRecibidos;
    private String color;

    // Constructor Getters y setters

        public Jugador(String nombre, boolean vivo, Seccion posicion, List<Item> items, List<Tarea> tareas, int votosRecibidos, String color) {
            this.nombre = nombre;
            this.vivo = vivo;
            this.posicion = posicion;
            this.items = items;
            this.tareas = tareas;
            this.votosRecibidos = votosRecibidos;
            this.color = color;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public boolean isVivo() {
            return vivo;
        }

        public void setVivo(boolean vivo) {
            this.vivo = vivo;
        }

        public Seccion getPosicion() {
            return posicion;
        }

        public void setPosicion(Seccion posicion) {
            this.posicion = posicion;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public List<Tarea> getTareas() {
            return tareas;
        }

        public void setTareas(List<Tarea> tareas) {
            this.tareas = tareas;
        }

        public int getVotosRecibidos() {
            return votosRecibidos;
        }

        public void setVotosRecibidos(int votosRecibidos) {
            this.votosRecibidos = votosRecibidos;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }



        // Métodos comunes de todos los jugadores
        public void votar(Jugador jugador) {
            // Comprueba si el jugador está vivo antes de permitirle votar
            if (this.isVivo()) {
                System.out.println(this.getNombre() + " ha votado contra " + jugador.getNombre() + ".");
            } else {
                System.out.println("Los jugadores muertos no pueden votar.");
            }
        }

        public void chatear(String mensaje) {
            System.out.println(this.getNombre() + " dice: " + mensaje);
        }

        public void convocarReunion() {
            System.out.println(this.getNombre() + " ha convocado una reunión.");
        }

        public void reportar() {
            System.out.println(this.getNombre() + " ha reportado un cuerpo.");
        }

        public void correr() {
            System.out.println(this.getNombre() + " está corriendo.");
        }

}



/*public abstract class Jugador {

    private String nombre;
    private boolean vida;
    private boolean eyectado;
    private Colores color;
    private String ubicacion;
    //fin de los atributos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public boolean isEyectado() {
        return eyectado;
    }

    public void setEyectado(boolean eyectado) {
        this.eyectado = eyectado;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Jugador(String nombre, boolean vida, boolean eyectado, Colores color, String ubicacion) {
        this.nombre = nombre;
        this.vida = vida;
        this.eyectado = eyectado;
        this.color = color;
        this.ubicacion = ubicacion;
    }
    //fin de setters getters y constructor

    //metodos correr, reportar.


}
//votar, chatear, reunion;

 */