package ExamenFinal;

/**
 *
 * @author JGr
 */
public class ListaReproducción {

    public String canciones;

    public ListaReproducción() {

    }

    public ListaReproducción(String canciones) {
        this.canciones = canciones;
    }

    public String getCanciones() {
        return canciones;
    }

    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "\nLista de Canciones: " + canciones + "\n-----------------\n";
    }

}
