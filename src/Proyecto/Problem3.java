package Proyecto;

import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;



import javax.swing.JPanel;

/**
 *
 * @author JGR
 */
public class Problem3 extends JPanel {

    int paramOval;//se declran distintas variables para los parametros para que los valores sean distintos cuando se llame el metodo Secure Random
    int paramOval2;
    int paramOval3;
    int paramOval4;
    int paramRect;
    int paramRect2;
    int paramRect3;
    int paramRect4;
    private static final SecureRandom numRamdon = new SecureRandom();

    /**
     *El constructor tiene la funcion de establecer el fondo y iniciar el programa
     */
    public Problem3() {
        setBackground(Color.GREEN);
    }
    
    
    public void paint(Graphics g) {//se encarga de crear en un numero aleatorio de veces figuras de tipo ovalo o rectangulo
        super.paint(g);
        
        int numCreacionFiguras=numRamdon.nextInt(10);
        for (int n = 0; n <numCreacionFiguras; n++) {
            figuras(g);

        }

    }

    /**
     *Este metodo se encarga de pintar y crear las figuras con parametros aleatorios
     * @param g
     */
    public void figuras(Graphics g) {
        
        
        this.paramOval = numRamdon.nextInt(1000);
        this.paramOval2 = numRamdon.nextInt(1000);
        this.paramOval3 = numRamdon.nextInt(1000);
        this.paramOval4 = numRamdon.nextInt(1000);
        
        this.paramRect = numRamdon.nextInt(1000);
        this.paramRect2 = numRamdon.nextInt(1000);
        this.paramRect3 = numRamdon.nextInt(1000);
        this.paramRect4 = numRamdon.nextInt(1000);
        g.setColor(Color.red);
        g.fillOval(paramOval, paramOval2, paramOval3, paramOval4);
        g.setColor(Color.BLUE);
        g.fillRect(paramRect, paramRect2, paramRect3, paramRect4);
        
        
               
                
    }

}
