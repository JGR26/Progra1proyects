package Proyecto;

import java.util.Scanner;





/**
 *
 * @author JGR
 */
public class Intercalar2listas {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Digite un numero para la lista");
        int num1 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num2 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num3 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num4 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num5=sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num6 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num7 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num8 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num9 = sca.nextInt();
        System.out.println("Digite un numero para la lista");
        int num10 = sca.nextInt();

        int[] conjunto1 = {num1, num2, num3, num4, num5};
        int[] conjunto2 = {num6, num7, num8, num9, num10};

        int[] mezclar = new int[(conjunto1.length + conjunto2.length)-1];
        System.out.printf("%8s%n","Valor");
        for (int n = 0; n < mezclar.length; n++) {
            System.out.printf("%8d%n%8d%n", conjunto1[n],conjunto2[n]);
            //System.out.printf("%8d%n", conjunto2[n]);
           
        }

    }

}
