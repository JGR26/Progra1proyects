
package Lab13;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class Vista {
    Modelo modelo;
    
    public Vista(Modelo modelo){
        this.modelo = modelo;
       
    }
    
    public int mostrarMenu(){
        
        Scanner sca= new Scanner(System.in);
        
        System.out.println("---Digite la opción que desee--\n1. Introducir dos numeros\n2. Sumar\n3. Resta\n4. Mostrar resultado");
        
        int menu=sca.nextInt();
        
        return menu;
        
    }
    
    public void mostrarResultado(int resultado){
        
        System.out.printf("El resultado es:%s%n",resultado);
           
    }
    
    public void solicitarNum(){
        Scanner sca= new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        this.modelo.setNum1(sca.nextInt());
        
        System.out.println("Digite el segundo numero: ");
        this.modelo.setNum2(sca.nextInt());
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
