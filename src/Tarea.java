public class Tarea {
    private String descripcion;
    private boolean realizada;


    // Constructor y getter y setter
    public Tarea(String descripcion, boolean realizada) {
        this.descripcion = descripcion;
        this.realizada = realizada;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }



    // Método para realizar la tarea
    public void realizar() {
        realizada = true;
    }


}
