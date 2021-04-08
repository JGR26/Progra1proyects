
package Tarea_libro;

import java.security.SecureRandom;

/**
 *
 * @author JGR
 */
public class EjemploArreglo5 {
    
     public static void main(String[] args){
        
        SecureRandom aleatorio=new SecureRandom();
        int [] frecuencia=new int[7];
        
        for(int tiro=1;tiro<=6000000;tiro++)
            ++frecuencia[1+aleatorio.nextInt(6)];
        System.out.printf("%s%10s%n","Cara","Frecuencia");
        
        for(int cara=1;cara<frecuencia.length;cara++)
            System.out.printf("%4d%10d%n",cara,frecuencia[cara]);
        
    }
    
}

    

