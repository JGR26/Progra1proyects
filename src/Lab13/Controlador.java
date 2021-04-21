package Lab13;

/**
 *
 * @author JGR
 */
public class Controlador {

    Modelo modelo;
    Vista vista;

    public void iniciar() {

        modelo = new Modelo();
        vista = new Vista(modelo);
        int resultado = 0;
        
        while (true) {
            int menu = vista.mostrarMenu();

            switch (menu) {

                case 1:
                    vista.solicitarNum();

                    break;

                case 2:
                    resultado = modelo.suma();
                    break;

                case 3:
                    resultado = modelo.resta();
                    break;

                case 4:
                    vista.mostrarResultado(resultado);
                    break;

            }

        }

    }
}
