
package Lab14;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
