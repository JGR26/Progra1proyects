
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
    }
    
}
