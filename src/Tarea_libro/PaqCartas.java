
package Tarea_libro;

import java.security.SecureRandom;

/**
 *
 * @author JGR
 */
public class PaqCartas {
 
private Carta[] paquete;
    private int cartaActual;
    private static final SecureRandom numAleatorio=new SecureRandom();
    private static final int NUMERO_DE_CARTAS=52;
    public PaqCartas(){
      
        String[] caras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve", "Diez","Joker","Reina","Rey"};
        String[] palos={"Corazones","Diamantes","Treboles","Espadas"};
        paquete=new Carta[NUMERO_DE_CARTAS];
        cartaActual=0;
        
        for(int cuenta=0;cuenta<paquete.length;cuenta++)
            paquete[cuenta]=new Carta(caras[cuenta%13],palos[cuenta/13]);
               
    }
    public void Baraja(){
        cartaActual=0;
        
        for(int primera=0;primera<paquete.length;primera++){
            int segunda= numAleatorio.nextInt(NUMERO_DE_CARTAS);
            
            Carta temp= paquete[primera];
            paquete[primera]=paquete[segunda];
            paquete[segunda]=temp;
        } 
        
        
    }
    
    public Carta repartirCarta(){
        if(cartaActual<paquete.length)
            return paquete[cartaActual++];
        else
            return null;
    }
    
    
}



