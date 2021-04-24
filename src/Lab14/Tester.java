
package Lab14;

/**
 *
 * @author JGR
 */
public class Tester {
    
    public static void main(String[] args) {
        
        
        
        
        Perro p1= new Perro();
        p1.setNombre("aaa");
        p1.getNombre();
        p1.setColor("Cafe");
        Perro.contador++;
       
        
        Perro p2=new Perro("Lanyer","Cafe");
        Perro.contador++;
        
        Perro.incrementarContador();
        System.out.println(p1.nombre);
        System.out.println(Perro.contador);
        System.out.println(p2.nombre+p2.color);
        System.out.println(Perro.contador);
        
        Integer num1=0;
        Integer num2=0;
        int numero1=0;
        if(p1.equals(p2)){
            System.out.println("Los perros son iguales"); 
        }
        else{
            System.out.println("Los perros no son iguales");
        }
        
        if(num1==num2){
            System.out.println("Si se imprime");
        }
        if(num1.equals(Integer.valueOf(numero1))){
            
        }
    }
    
}
