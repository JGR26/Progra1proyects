package Proyecto.Problem4;

import java.util.Arrays;// se importa la libreria arrays
import java.util.Scanner;

/**
 * Problema de busqueda binaria #4
 *
 * @author JGR
 */
public class Busquedabinaria {

    private int[] listanum = {200, 1, 8, 4, 45};//esta propiedad no es necesaria que sea publica ya que usa valores predeterminados que no es necesario cambiar
    public int numSolicitado;//Esta propiedad la define el usuario
    
    /**
     * Este metodo sirve para que el usuario busque un numero dentro de una
     * lista de numeros predeterminada
     */
    public void busquedabinaria() {
        Scanner sca = new Scanner(System.in);
        Arrays.sort(listanum);// esto es solo para practicar otras formas de arreglo aunq no era necesario queria practicarlo jajaja
        System.out.println("Digite un numero para verificar si esta en el arreglo:");
        this.numSolicitado = sca.nextInt();// se le pide un numero al usuario para buscarlo en  el sistema

        if (Arrays.binarySearch(this.listanum, this.numSolicitado) > 0) //en el if se encuentra el Arrays.binarySearch el cual hace la busqueda del numero en el sistema
        {
            System.out.printf("El numero %s esta dentro de la lista de numeros\n", numSolicitado);//utilizo el printf solo por practica no tiene importancia en el programa
        } else {
            System.out.printf("El numero %s no se encuentra dentro de la lista de numeros\n", numSolicitado);
        }
        
      

    }
    
    /**
     *Este metodo es para retornar al usuario el orden y la lista de numeros
     */
    public void listanumeros(){
         //Arrays.sort(listanum);
        System.out.printf("%s%8s%n","Indice","Valor");
        for(int n=0;n<listanum.length;n++)//se utiliza el .length para que el sistema busque e imprima cada numero de la lista
            System.out.printf("%5d%8d%n",n,listanum[n]);
    }

}
