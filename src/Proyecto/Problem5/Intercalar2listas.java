package Proyecto.Problem5;

import java.util.Scanner;





/**
 *
 * @author JGR
 */
public class Intercalar2listas {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Digite un numero para la lista: ");
        int num1 = sca.nextInt();//se le pide mediante un scanner un numero al usuario
        System.out.println("Digite un numero para la lista: ");
        int num2 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num3 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num4 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num5=sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num6 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num7 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num8 = sca.nextInt();
        System.out.println("Digite un numero para la lista: ");
        int num9 = sca.nextInt();
       System.out.println("Digite un numero para la lista: ");
       int num10 = sca.nextInt();
       
        int[] conjunto1 = {num1, num2, num3, num4, num5};
        int[] conjunto2 = {num6,num7, num8, num9,num10};
        
        //int[] mezclar = new int [(conjunto1.length + conjunto2.length)-1]; esta funcion no sirvio se cancelo todo  :V
        System.out.printf("%8s%n","Valor");
        for (int n = 0; n < conjunto1.length; n++) {//este for es el encargado de intercalar los numeros solo utilizo como referencia el conjunto1 porque tienen la misma longitud
            System.out.printf("%8d%n%8d%n", conjunto1[n],conjunto2[n]);
            //System.out.printf("%8d%n", conjunto2[n]);
           
        }

    }

}
