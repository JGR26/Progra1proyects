package Lab11;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class destinoviaje {

    String país;
    double precio;
    float distancia;
    int numhoras;
    String aerolinea;

    

    public void solicitardatosdestino() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite el país: ");
        this.país = sca.next();
        System.out.println("Digite el precio: ");
        this.precio = sca.nextDouble();
        System.out.println("Digite la distancia: ");
        this.distancia = sca.nextFloat();
        System.out.println("Digite las horas de vuelo: ");
        this.numhoras = sca.nextInt();
        System.out.println("Digite la aerolinea: ");
        this.aerolinea=sca.next();

    }

    public void setPaís(String país) {
        this.país = país;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getPaís() {
        return país;
    }

    public double getPrecio() {
        return precio;
    }

    public float getDistancia() {
        return distancia;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    @Override
    public String toString() {
        return "destinoviaje{" + "país=" + país + ", precio=" + precio + ", distancia=" + distancia + ", numhoras=" + numhoras + ", aerolinea=" + aerolinea + '}';
    }

}
