
package Lab12;

import java.util.Date;

/**
 *
 * @author HP USER
 */
public class Empleado extends Persona {
    
    private String numEmpleado;
    private Date fechaInicio;
    private Date fechaTermino;

    public Empleado(String nombre,String apellidos,String numEmpleado, Date fechaInicio, Date fechaTermino) {
        this.numEmpleado = numEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public Empleado(String numEmpleado, Date fechaInicio, Date fechaTermino) {
        this.numEmpleado = numEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    
    
    
    
    
}
