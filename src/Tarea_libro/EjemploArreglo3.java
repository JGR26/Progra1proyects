
package Tarea_libro;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class EjemploArreglo3 {
    
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int total=0;

        System.out.println("Digite el primer numero de la lista");
        int num1 = sca.nextInt();

        System.out.println("Digite el segundo numero para la lista: ");
        int num2 = sca.nextInt();
        System.out.println("Digite el tercer numero para la lista: ");
        int num3 = sca.nextInt(); 
        System.out.println("Digite el cuarto numero para la lista: ");
        int num4 = sca.nextInt();
        System.out.println("Digite el quinto numero para la lista: ");
        int num5 = sca.nextInt();
        System.out.println("Digite el sexto numero para la lista: ");
        int num6 = sca.nextInt();
        System.out.println("Digite el septimo numero para la lista: ");
        int num7 = sca.nextInt();
        System.out.println("Digite el octavo numero para la lista: ");
        int num8 = sca.nextInt();
        System.out.println("Digite el noveno numero para la lista: ");
        int num9 = sca.nextInt();
        System.out.println("Digite el decimo numero para la lista: ");
        int num10 = sca.nextInt();
           
        int[] arreglo = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
        
        for(int contador=0;contador<arreglo.length;contador++)
        total+=arreglo[contador];
        
        System.out.printf("%s%8s%n","Indice","Valor");
        for(int contador=0;contador<arreglo.length;contador++)
            System.out.printf("%5d%8d%n",contador,arreglo[contador]);
        
        System.out.printf("El total de la suma de arreglos es: %d%n",total);

    }

}
 

