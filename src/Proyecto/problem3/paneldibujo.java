
package Proyecto.problem3;

import Proyecto.problem3.Problem3;
import javax.swing.JFrame;

/**
 *
 * @author HP USER
 */
public class paneldibujo {
    
    
    
    public static void main(String[] args){//se encarga de crear un JFrame con medidas exactas y pone a funcionar la clase problem3
        
        Problem3 panel=new Problem3();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(1000, 1000);
        aplicacion.setVisible(true);
    }
    
}
