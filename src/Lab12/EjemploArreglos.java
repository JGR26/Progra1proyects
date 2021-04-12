
package Lab12;

/**
 *
 * @author JGR
 */
public class EjemploArreglos {
    public static void main(String[] args){
    
        
        long varNumGrande = 9223372;
        
        int[] enteros = new int[5];
        
        enteros[3] = 233;
        enteros[4] = 555;
        enteros[1] = 7;
        
        
        System.out.println(enteros.length);
        System.out.println(enteros[3]);
        
        int[] arregloGrande = new int[100];
        
        for(int i=0;i<100;i++){
            arregloGrande[i]=1;
        }
        
        for(int i=0;i<100;i++){
            System.out.println(arregloGrande[i]);
        }
        
        
    }
}
