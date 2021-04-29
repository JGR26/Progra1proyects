package Proyecto.Problem6;

/**
 *
 * @author HP USER
 */
public class ControladorSistemaNotas {

    boolean modoGrafico = true;
    ModeloSistemaNotas mm;
    VistaSistemaNotas vista = new VistaSistemaNotas(mm);

    public void Iniciar() {
        if (modoGrafico == true) {

            while (true) {
                int numMenu = vista.menu();

                switch (numMenu) {

                    case 1:

                        vista.totalDeAlumnos();
                        break;
                    case 2:
                        vista.datosProfesor();
                        break;
                    case 3:
                        vista.digitarNotas();
                        break;

                    case 4:
                        vista.generarReporteTodosAlumnos();
                        break;

                    case 5:
                        vista.generarReporteTodosExamenesOrdenados();
                        break;
                    case 6:
                        vista.imprimirNotaMasAlta();
                        break;
                    case 7:
                        vista.imprimirNotaBaja();
                        break;
                    case 8:
                        vista.imprimirPromedio();
                        break;
                    case 9:
                        vista.manualUsuario();
                        break;
                    case 10:
                        vista.acercaDe();
                        break;
                }
                if (numMenu == 11) {
                    break;
                }
            }
        } else {
            while (true) {
                int numMenu = vista.menuScanner();

                switch (numMenu) {

                    case 1:

                        vista.totalDeAlumnosScanner();
                        break;
                    case 2:
                        vista.datosProfesorScanner();
                        break;
                    case 3:
                        vista.digitarNotasScanner();
                        break;

                    case 4:
                        vista.generarReporteTodosAlumnosScanner();
                        break;

                    case 5:
                        vista.generarReporteTodosExamenesOrdenadosScanner();
                        break;
                    case 6:
                        vista.imprimirNotaMasAltaScanner();
                        break;
                    case 7:
                        vista.imprimirNotaBajaScanner();
                        break;
                    case 8:
                        vista.imprimirPromedioScanner();
                        break;
                    case 9:
                        vista.manualUsuarioScanner();
                        break;
                    case 10:
                        vista.acercaDeScanner();
                        break;
                }
                if (numMenu == 9) {
                    break;
                }
            }
        }
    }
}
