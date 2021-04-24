
package Lab14;

import java.util.Date;

/**
 *
 * @author JGR
 */
public class CarritoDecompras {
    
    private Date created;
    private LineItem[] line;
    private int contadorLinea;
    public CarritoDecompras(){
        created=new Date();
        line=new LineItem[100];
    }
    public void agregarLinea(LineItem linea){
        line[contadorLinea]=linea;
        contadorLinea++;
    }
    
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public LineItem[] getLine() {
        return line;
    }

    public void setLine(LineItem[] line) {
        this.line = line;
    }
    
    
}
