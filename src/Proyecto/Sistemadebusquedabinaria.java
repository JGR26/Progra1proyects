
package Proyecto;

import java.util.Scanner;

/**
 *Este sistema es para una busqueda binaria o visualizar uan lista de numeros predeterminada
 * @author JGR
 */
public class Sistemadebusquedabinaria {
    
    /**
     *Este metodo es para iniciar el sistema
     */
    public void iniciar(){//
        Scanner sca=new Scanner(System.in);
        Busquedabinaria bin=new Busquedabinaria();// se declara el objeto como bin
        while(true){//se utiliza un ciclo para repetirlo varias veces
            
            System.out.println("Digite 1 si desea buscar un numero en la lista predeterminada\nDigite 2 si desea ver la lista");
            Byte menu= sca.nextByte();//utilizo byte porq solo hay dos opciones de menu 
            
            switch(menu){
                
                case 1:
                    bin.busquedabinaria();//se llama los metods mediante el objeto bin
                    break;
                
                case 2:
                    bin.listanumeros();
                    break;
            }//llave del switch
            
        }//llave del while
        
    }//llave del metodo
    
}//llave de la clase
