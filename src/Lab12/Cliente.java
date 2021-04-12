
package Lab12;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class Cliente extends Persona {
    private String numCedula;
    private int numVuelo;
    private String nacionalidad;
    
    public Cliente(){
    }
    
    public Cliente(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Cliente(String nombre, String apellidos, String numCedula){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCedula = numCedula;
    }
    
    public Cliente(String nombre, String apellidos, String numCedula, String nacionalidad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCedula = numCedula;
        this.nacionalidad = nacionalidad;
    }

    public Cliente(String nombre, String apellidos, String numCedula, int numVuelo, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCedula = numCedula;
        this.numVuelo = numVuelo;
        this.nacionalidad = nacionalidad;
    }
    
    public void solicitarDatos(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Favor digite su nombre: ");
        this.nombre = sca.next();
        System.out.println("Favor digite su apellidos: ");
        this.apellidos = sca.next();
        System.out.println("Favor digite su cedula: ");
        this.numCedula = sca.next();
        System.out.println("Favor digite su numero vuelo: ");
        this.numVuelo = sca.nextInt();
        System.out.println("Favor digite su nacionalidad: ");
        this.nacionalidad = sca.next();
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numCedula=" + numCedula + ", numVuelo=" + numVuelo + ", nacionalidad=" + nacionalidad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
 
    
}
