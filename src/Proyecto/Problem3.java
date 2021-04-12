
package Proyecto;

import static com.sun.javafx.geom.BaseBounds.BoundsType.RECTANGLE;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author JGR
 */
public class Problem3 extends JPanel{
    private Color[] colores={Color.BLUE,Color.YELLOW,Color.LIGHT_GRAY,Color.green,Color.orange,Color.red};
    public Problem3(){
        setBackground(Color.GREEN);
    }
    
    public void paint(Graphics g){
       super.paint(g);
       int numtotal=10;
       
       for(int n=colores.length;n>0;n--){
            g.setColor(colores[n-1]);
            g.setColor(colores[++n-1]);
            g.setColor(colores[++n-1]);
            for(int z=0;z<numtotal;z++){
       g.drawLine(25, 90, 60, 50);
       g.drawOval(150, 50, 100, 100);
      
       g.fillOval(340, 50, 80, 120);
       //g.setColor(colores[n-1]);
       g.fillOval(200,160, 160, 80);
       //g.setColor(colores[n-1]);
       g.fillOval(800,670, 90, 40);
       }
       }
       //
      // g.setColor(colores[n-1]);
       //g.fillOval(200,160, 160, 80);
      //g.setColor(colores[n-1]);
    }
    
   
    
}
