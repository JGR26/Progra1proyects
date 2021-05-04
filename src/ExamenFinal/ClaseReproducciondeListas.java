package ExamenFinal;

/**
 *
 * @author JGR
 */
public class ClaseReproducciondeListas {

    EquipoSonido es;
    ClaseVista vista;
    Parlantes parlante;
    Radio rd;

    public ClaseReproducciondeListas(EquipoSonido es, ClaseVista vista, Parlantes parlantes) {
        this.es = es;
        this.vista = vista;
        this.parlante = parlantes;
    }

    public ClaseReproducciondeListas(EquipoSonido es, ClaseVista vista, Parlantes parlante, Radio rd) {
        this.es = es;
        this.vista = vista;
        this.parlante = parlante;
        this.rd = rd;
    }

    public void reproducirCanciones() {
        String listareproduccion = "";
        for (int i = 0; i < es.cont; i++) {

            listareproduccion += es.getReproduccion()[i].toString();
            listareproduccion += "Parlantes y Volumen Activado en este momento" + parlante.toString();
            listareproduccion += "En este momento empezara a sonar sus rolitas esperemos que disfrute";
        }
        vista.reproduccion(listareproduccion);

    }

    public void reproducirCancionesAleatorio() {
        String listareproduccion = "";
        for (int i = 0; i < es.cont; i++) {

            listareproduccion += es.getReproduccion()[i + 2].toString() + "\n";
            listareproduccion += "Parlantes y Volumen Activado en este momento" + parlante.toString() + "\n";
            listareproduccion += "En este momento empezarán a sonar sus rolitas esperemos que disfrute" + "\n";
        }
        vista.reproduccion(listareproduccion);

    }

    public void imprimirListaReproducción() {
        String imprimirLista = "";
        for (int i = 0; i < es.cont; i++) {
            imprimirLista += "Su lista de reproduccion tiene los siguientes audios: \n" + es.getReproduccion()[i].toString();

        }
        vista.reproduccion(imprimirLista);

    }

    public void radio() {
        String reproduccionRadio = "";

        reproduccionRadio += rd.toString();
        reproduccionRadio += "Parlantes y Volumen Activado en este momento" + parlante.toString();
        reproduccionRadio += "En este momento empezara a sonar sus rolitas esperemos que disfrute";

        vista.reproduccion(reproduccionRadio);

    }

}
