package ExamenFinal;

import javax.swing.JOptionPane;

/**
 *
 * @author JGR
 */
public class ClaseVista {

    EquipoSonido ep;

    public ClaseVista(EquipoSonido ep) {
        this.ep = ep;
    }

    public int menuInic() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Para escuchar lista de reproduccion\n2.Para escuchar la Radio"));
        return menu;
    }

    public int menu() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar Canciones a lista de reproducción\n2.Reproducir Lista en Orden\n"
                + "3.Reproducir Lista aleatoria\n4.Mostrar Lista Completa\n4.Eliminar audio\n5.Salir"));
        return menu;
    }

    public void agregarCanciones(ListaReproducción reproducción) {
        String cancion = JOptionPane.showInputDialog("Digite el codigo del audio para agregarlo a su lista de  reproducción: ");

        reproducción.setCanciones(cancion);

    }

    public void habilitacionParlantes(Parlantes pr) {
        String parI = JOptionPane.showInputDialog("Desea habilitar el parlante Izquierdo?");
        String parR = JOptionPane.showInputDialog("Desea habilitar el parlante derecho?");
        String parS = JOptionPane.showInputDialog("Desea habilitar el parlante subwoof?");
        String volumen = JOptionPane.showInputDialog("Del 0 al 10 que volumen desea?");
        pr.setParlanteDerecho(parR);
        pr.setParlanteIzquierdo(parI);
        pr.setParlanteSubwoof(parS);
        pr.setVolumen(volumen);
    }

    public void reproduccion(String propiedad) {

        JOptionPane.showMessageDialog(null, propiedad);

    }

    public void habilitacionParlantes(Radio rd, Parlantes pr) {
        String codAudio = JOptionPane.showInputDialog("Digite el codigo Binario del audio: ");
        rd.setAudio(codAudio);
        String parI = JOptionPane.showInputDialog("Desea habilitar el parlante Izquierdo?");
        String parR = JOptionPane.showInputDialog("Desea habilitar el parlante derecho?");
        String parS = JOptionPane.showInputDialog("Desea habilitar el parlante subwoof?");
        String volumen = JOptionPane.showInputDialog("Del 0 al 10 que volumen desea?");
        pr.setParlanteDerecho(parR);
        pr.setParlanteIzquierdo(parI);
        pr.setParlanteSubwoof(parS);
        pr.setVolumen(volumen);
    }

}
