package Proyecto.Problem6;

/**
 *
 * @author HP USER
 */
public class ControladorSistemaNotas {

    VistaSistemaNotas vista;
    ModeloSistemaNotas mm;

    public void Iniciar() {
        vista = new VistaSistemaNotas(mm);
        while (true) {
        int numMenu = vista.Menu();

       
            switch (numMenu) {

                case 1:
                    vista.totalDeAlumnos();
                    break;
                case 2:
                    vista.digitarNotas();
                    break;
                    
                case 3:
                    vista.ImprimirNotas();
                    break;
            }
        }
    }
}
