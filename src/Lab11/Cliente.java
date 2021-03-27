
package Lab11;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class Cliente {

    String nombre;
    String apellidos;
    String numCedula;
    int numVuelo;
    String nacionalidad;
    
    
    
    public Cliente(){
        
    }
    public Cliente(String nombre,String apellidos){
        
        this.nombre= nombre;
        this.apellidos=apellidos;
        
    }
    public Cliente(String nombre,String apellidos,String numCedula){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numCedula=numCedula;
        
        
    }
    public Cliente(String nombre,String apellidos,String numCedula,String nacionalidad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numCedula=numCedula;
        this.nacionalidad=nacionalidad;
        
        
    }
    
    public Cliente(String nombre,String apellidos,String numCedula,String nacionalidad,int numVuelo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numCedula=numCedula;
        this.nacionalidad=nacionalidad;
        this.numVuelo=numVuelo;
        
    }
    
    
    public void Datos() {

        Scanner sca = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        this.nombre = sca.next();
        System.out.println("Digite su Apellido: ");
        this.apellidos= sca.next();
        System.out.println("Digite su número de Identificación: ");
        this.numCedula=sca.next();
        System.out.println("Digite el número de vuelo: ");
        this.numVuelo=sca.nextShort();
        System.out.println("Digite su nacionalidad: ");
        this.nacionalidad=sca.next();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\n Numero de identificación" + numCedula + "\nNumero de vuelo" + numVuelo + "\nNacionalidad: " + nacionalidad ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}

