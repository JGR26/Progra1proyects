
package Tarea_libro;

/**
 *
 * @author JGR
 */
public class testerCartas {
    
public static void main(String[] args){
        PaqCartas thepack= new PaqCartas();
        thepack.Baraja();
        
        for(int i=1;i<=52;i++){
            System.out.printf("%-19s",thepack.repartirCarta());
                    
            if(i%4==0)
                System.out.println();
        }
            
    }
    
}

