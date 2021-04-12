
package Lab12;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class DestinoViaje  {
    String pais;
    double precio;
    float distancia;
    int numHorasDuracion;
    String aerolinea;
 
    public void solicitarDatosDestino(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Favor digite el nombre del pais: ");
        this.pais = sca.next();
        System.out.println("Favor digite el precio: ");
        this.precio = sca.nextDouble();
        System.out.println("Favor digite la distancia: ");
        this.distancia = sca.nextFloat();
        System.out.println("Favor digite la numero de horas duracion: ");
        this.numHorasDuracion = sca.nextInt();
        System.out.println("Favor digite la aerolinea: ");
        this.aerolinea = sca.next();
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getNumHorasDuracion() {
        return numHorasDuracion;
    }

    public void setNumHorasDuracion(int numHorasDuracion) {
        this.numHorasDuracion = numHorasDuracion;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public String toString() {
        return "DestinoViaje{" + "pais=" + pais + ", precio=" + precio + ", distancia=" + distancia + ", numHorasDuracion=" + numHorasDuracion + ", aerolinea=" + aerolinea + '}';
    }
  
}
