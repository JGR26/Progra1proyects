
package Tarea_libro;

/**
 *
 * @author JGR
 */
public class Carta {
    
 private final String cara;//Variable  constante
   private final String palo;
   
   public Carta(String caraCarta,String paloCarta){
       
       this.cara=caraCarta;
       this.palo=paloCarta; 
   }

    @Override
    public String toString() {
        return cara+"de"+palo;
    }
   
    
}


