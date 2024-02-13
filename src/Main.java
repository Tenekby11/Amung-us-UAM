import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//main para mapa de nave
        /* Crear secciones
        Seccion seccion1 = new Seccion("Nave", "R//eparar cables",true);
        Seccion seccion2 = new Seccion("Electricidad");
        Seccion seccion = new Seccion("Nave", tareaSabotaje, ductos);

         */

       /* // Crear ductos
        Ducto ducto = new Ducto();

        */

        // Crear ductos
        Seccion seccion1 = new Seccion("Nave", Tarea., null);
        Seccion seccion2 = new Seccion("Electricidad", tareaSabotaje, null);
        Ducto[] ductos = {new Ducto(new Seccion[]{seccion1, seccion2})};

        // Crear tareas
        // Tareas en comun de los mapas
        Tarea tarea1 = new Tarea("Descargar datos",true);
        Tarea tarea2 = new Tarea("Cargar datos",true);
        Tarea tarea3 = new Tarea("Subir datos",true);
        Tarea tarea4 = new Tarea("Arreglasr cableado",true);
        Tarea tarea5 = new Tarea("Reparar cables",true);

        /* Tareas de Polus
        Tarea tarea6 = new Tarea("Abrir camino de agua");
        Tarea tarea7 = new Tarea("Alinear telescopio");
        Tarea tarea8 = new Tarea("Registrar temperatura");
        Tarea tarea9 = new Tarea("Reparar taladro");
        Tarea tarea10 = new Tarea("Inspeccionar muestra");
        Tarea tarea11 = new Tarea("Enviar escaneo");
        Tarea tarea12 = new Tarea("Llenar frascos");
        Tarea tarea13 = new Tarea("Reemplazar jarra de agua");
        Tarea tarea14 = new Tarea("Reiniciar WIFI");
        Tarea tarea15 = new Tarea("Curso de gracifos");
        Tarea tarea16 = new Tarea("Insertar llaves");
        // Taraas de The Skeld
        Tarea tarea17 = new Tarea("Alinear salida de motor");
        Tarea tarea18 = new Tarea("Calibar distriuidor");
        Tarea tarea19 = new Tarea("Desviar energia");
        Tarea tarea20 = new Tarea("Encender escudos");
        Tarea tarea21 = new Tarea("Encender ventiladores");
        Tarea tarea22 = new Tarea("Vaciar basurero");
        Tarea tarea23 = new Tarea("Vaciar contenedor");

         */

        //  Creacion de items
        //Trajes:
        Item item1 = new Item("Astronauta","Traje de astronauta");
        Item item2 = new Item("Capitán","Traje de capitan");
        Item item3 = new Item("Mecánico", "Traje de mecánico");
        Item item4 = new Item("Militar", "Traje militar");
        Item item5 = new Item("Policía", "Uniforme de policía");
        Item item6 = new Item("Doctor", "Bata de doctor");
        Item item7 = new Item("Traje Negro", "Traje formal de color negro");
        Item item8 = new Item("Traje Blanco", "Traje formal de color blanco");
        Item item9 = new Item("Guardia de Pared", "Traje de guardia de pared");
        //Sombreros:
        Item item10 = new Item("Gorro de fiesta","Gorrito de fiesta");
        Item item11 = new Item("Sombrero negro","Sombrero perron");
        Item item12 = new Item("Gafas de esquí", "Gafas para proteger los ojos durante el esquí");
        Item item13 = new Item("Mascarilla", "Mascarilla para protegerse de los gérmenes");
        Item item14 = new Item("Sombrero de cowboy", "Sombrero de vaquero para el sol");
        Item item15 = new Item("Monda de plátano", "Una monda de plátano en la cabeza");
        Item item16 = new Item("Gorro rojo", "Un gorro rojo para el frío");
        Item item17 = new Item("Orejas de oso", "Un gorro con orejas de oso");
        Item item18 = new Item("Queso", "Un trozo de queso en la cabeza");

        // Crear jugadores
        Tripulante tripulante1 = new Tripulante("Adolfo", true, seccion1, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0,Color.AZUL, "Científico");
        Tripulante tripulante2 = new Tripulante("Jose", true, seccion1, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.ROJO, "Científico");
        Tripulante tripulante3 = new Tripulante("Alejandro", true, seccion1, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.VERDE, "Científico");
        Tripulante tripulante4 = new Tripulante("Leonardo", true, seccion1, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.CAFE, "Científico");
        Tripulante tripulante5 = new Tripulante("AARON", true, seccion1, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.NARANJA, "Científico");
        Impostor impostor1 = new Impostor("Carlos", true, seccion2, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.BLANCO, false);
        Impostor impostor2 = new Impostor("Andres", true, seccion2, Arrays.asList(item1, item2), Arrays.asList(tarea1, tarea2), 0, Color.NEGRO, true);

        System.out.println(tripulante1);

        /* Simular acciones
        tripulante.realizarTarea(tarea1);
        impostor.asesinar(tripulante);
        tripulante.reportar();
        tripulante.votar(impostor);
        impostor.votar(tripulante);



         */
    }
}
