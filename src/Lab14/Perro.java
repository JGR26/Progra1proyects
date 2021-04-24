
package Lab14;

/**
 *
 * @author JGR
 */
public class Perro {
    public String nombre;
    public String color;
    public static  int contador;

    public Perro() {
    }
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

   public static void incrementarContador(){
       contador++;
       System.out.println(contador);
   }
    
    
}
