package Proyecto.Problem6;

/**
 *
 * @author HP USER
 */
public class ControladorSistemaNotas {

    
    ModeloSistemaNotas mm;
    VistaSistemaNotas vista=new VistaSistemaNotas(mm);
    public void Iniciar() {
        
        
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
                    vista.generarReporteTodosAlumnos();
                    break;
                
                case 4:
                    vista.generarReporteTodosExamenesOrdenados();
                    break;
                case 5:
                    vista.imprimirNotaMasAlta();
                    break;
                case 6:
                    vista.ImprimirNotaBaja();
                    break;
                case 7:
                    vista.ImprimirPromedio();
                    break;
                
                
                    
                
            }
            if(numMenu==8){break;}
        }
    }
}
