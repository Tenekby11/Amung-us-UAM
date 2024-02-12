public class Tarea {
    private String descripcion;
    private boolean realizada;

    // Constructor
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.realizada = false;
    }



    // Método para realizar la tarea
    public void realizar() {
        realizada = true;
    }



}
