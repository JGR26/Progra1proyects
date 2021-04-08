
package Tarea_libro;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class InicArreglo {
    
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        System.out.println("Digite un primer numero para inicializar la lista: ");
        int num1=sca.nextInt();
        System.out.println("Digite un segundo numero para inicializar la lista: ");
        int num2=sca.nextInt();
        System.out.println("Digite un tercer numero para inicializar la lista: ");
        int num3=sca.nextInt();
        System.out.println("Digite un cuarto numero para inicializar la lista: ");
        int num4=sca.nextInt();
        System.out.println("Digite un quinto numero para inicializar la lista: ");
        int num5=sca.nextInt();
        
        int[] arreglo={num1,num3,num4,num2,num5};
        
        System.out.println("La lista se acomodará de diferente forma a continuación: ");

        System.out.printf("%s%8s%n","Indice","Valor");
        
        for(int i=0;i<arreglo.length;i++)
            
        System.out.printf("%5d%8d%n",i,arreglo[i]);    
        
    }
    
    
    
}

    

