package ExamenFinal;

/**
 *
 * @author
 *
 */
public class EquipoSonidoControlador {

    Parlantes pr = new Parlantes();
    EquipoSonido ep = new EquipoSonido();
    ClaseVista vista = new ClaseVista(ep);
    ClaseReproducciondeListas cr = new ClaseReproducciondeListas(ep, vista, pr);

    public void iniciar() {
        while (true) {
            int n = vista.menu();
            ListaReproducción lt = new ListaReproducción();
            switch (n) {
                case 1:

                    vista.agregarCanciones(lt);
                    ep.agregarAudio(lt);
                    vista.habilitacionParlantes(pr);
                    break;
                case 2:
                    cr.reproducirCanciones();
                    break;
                case 3:
                    cr.reproducirCancionesAleatorio();
                    break;
                case 4:
                    
                    break;

            }
            if (vista.menu() == 5) {
                break;

            }
        }

    }

}
