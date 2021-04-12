
package Proyecto;

import javax.swing.JFrame;

/**
 *
 * @author HP USER
 */
public class paneldibujo {
    
    
    
    public static void main(String[] args){
        
        Problem3 panel=new Problem3();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(4000, 4000);
        aplicacion.setVisible(true);
    }
    
}
