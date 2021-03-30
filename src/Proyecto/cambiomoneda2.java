package Proyecto;

import java.util.Scanner;

/**
 *Este es el problema dos del proyecto
 * @author JGR
 */
public class cambiomoneda2 {

    public double monto;
    public double cambioAColon;
    public double CambioADolares;
    //las tres variables anteriores son publicas y double ya que el usuario necesita ingresar el tipo de cmabio y el double por si el usuario desea ingresar decimales

    /**
     *Este metodo es para que el usuario haga la conversion de dolares a colones
     */
    public void DolarAColon() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();// el usuario intruduce el monto mediante un scanner
        System.out.println("Cual es el cambio actual de Dolares a Colones: ");
        this.cambioAColon = sca.nextDouble();//el usuario ingresa el tipo de cambio de dolares a colones
        double resultado = this.monto * this.cambioAColon;// se hace la conversion mediante una multiplicación
        System.out.println("El monto en colones es de: ₡" + resultado);

    }

    public void EuroAColon() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();
        System.out.println("Cual es el cambio actual de Euros a Dolares: ");
        this.CambioADolares = sca.nextDouble();

        System.out.println("Cual es el cambio actual de Dolares a Colones: ");
        this.cambioAColon = sca.nextDouble();

        double resultado = (this.monto * this.CambioADolares) * this.cambioAColon;
        System.out.println("El monto en colones es de: ₡" + resultado);

    }

}
