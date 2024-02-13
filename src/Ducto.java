public class Ducto {
    // Atributos del ducto
    private Seccion[] secciones;

    // Constructor

    public Ducto(Seccion[] secciones) {
        this.secciones = secciones;
    }
    /*
        public Ducto(Seccion seccion1, Seccion seccion2) {
        this.secciones = new Seccion[]{seccion1, seccion2};
    }

     */

    // Método para obtener las secciones conectadas por el ducto
    public Seccion[] getSecciones() {
        return secciones;
    }
}
