package ExamenFinal;

/**
 *
 * @author JGR
 */
public class EquipoSonido {

    public ListaReproducción[] reproduccion;
    public int cont;
    public int max;
    public Reloj rj;
    public Parlantes pr;
    public EquipoSonido(ListaReproducción[] reproduccion) {
        this.reproduccion = reproduccion;
    }

    public EquipoSonido() {
        max = 1000;
        reproduccion = new ListaReproducción[max];
        cont = 0;
    }

    public ListaReproducción[] getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(ListaReproducción[] reproduccion) {
        this.reproduccion = reproduccion;
    }

    public boolean agregarAudio(ListaReproducción lt) {
        boolean resultado = false;
        if (cont < max) {
            reproduccion[cont] = lt;
            cont++;
            resultado = true;

        }
        return resultado;
    }

    public boolean eliminarAudio() {
        boolean resultado = false;
        if (cont != 0) {
            cont--;
            reproduccion[cont] = null;
            resultado = true;
        }
        return resultado;

    }
    
    public void alarma(ClaseVista vista,Reloj rj){
        if(vista.solicreloj()==true){
            vista.relojvista(rj);
        }
    }
}
