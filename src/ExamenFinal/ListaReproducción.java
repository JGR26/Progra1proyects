
package ExamenFinal;

/**
 *
 * @author JGr
 */
public class ListaReproducción {
    
    String canciones;
    public ListaReproducción(){
        
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
        return "Lista de Canciones: " + canciones ;
    }
    
    
    
}
