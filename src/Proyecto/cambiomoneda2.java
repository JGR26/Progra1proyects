package Proyecto;

import java.util.Date;
import java.util.Scanner;

/**
 * Este es el problema dos del proyecto
 *
 * @author JGR
 */
public class cambiomoneda2 {

    public double monto;
    public double cambioAColon;
    public double CambioADolares;
    //las tres variables anteriores son publicas y double ya que el usuario necesita ingresar el tipo de cmabio y el double por si el usuario desea ingresar decimales

    /**
     * Este metodo es para que el usuario haga la conversion de dolares a
     * colones
     */
    public void DolarAColon() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();// el usuario intruduce el monto mediante un scanner
        System.out.println("Cual es el cambio actual de Dolares a Colones: ");
        this.cambioAColon = sca.nextDouble();//el usuario ingresa el tipo de cambio de dolares a colones
        double resultado = this.monto * this.cambioAColon;// se hace la conversion mediante una multiplicación
        System.out.println("El monto en colones es de: ₡" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

    public void EuroAColon() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();
        System.out.println("Cual es el cambio actual de Euros a Dolares: ");
        this.CambioADolares = sca.nextDouble();//se pide el cambio a dolares

        System.out.println("Cual es el cambio actual de Dolares a Colones: ");
        this.cambioAColon = sca.nextDouble();//se pide el cambio a colon

        double resultado = (this.monto * this.CambioADolares) * this.cambioAColon;
        System.out.println("El monto en colones es de: ₡" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

    /**
     * Este metodo sirve para que el usuario pueda convertir un monto de colones
     * a Dolares
     */
    public void ColonADolar() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a Dolares: ");
        this.monto = sca.nextDouble();
        System.out.println("Cual es el cambio de dolar a colon: ");
        this.cambioAColon = sca.nextDouble();
        double resultado = this.monto / this.cambioAColon;//se utiliza division para saber cual es el monto total en dolares
        System.out.println("El monto en dólares es de: $" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

    /**
     * Este metodo convierte un monto de Colones a Euros
     */
    public void ColonAEuros() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a Euros: ");
        this.monto = sca.nextDouble();
        System.out.println("Cual es el cambio de dolar a colon: ");
        this.cambioAColon = sca.nextDouble();// se le pide al usuario el cambio de moneda
        System.out.println("Cual es el cambio de euro a dolar: ");
        this.CambioADolares = sca.nextDouble();// se pide el cambio de euros a dolares
        double resultado = (this.monto / this.cambioAColon) / this.CambioADolares;//se utilizan dos divisiones para calcular el valor en euros
        System.out.println("El monto en Euros es de: €" + resultado);// Imprime el monto total en euros
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

    /**
     * Este metodo convierte un monto de Dolares a Euros
     */
    public void DolaresAEuros() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a Euros: ");
        this.monto = sca.nextDouble();
        System.out.println("Cual es el cambio de euro a dolar: ");
        this.CambioADolares = sca.nextDouble();// se pide el cambio de dolar a Euro
        double resultado = this.monto / this.CambioADolares;//se utiliza la division para retornar el valor total de dolares a Euros
        System.out.println("El monto en Euros es de: €" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

    /**
     * Este metodo convierte de Euros a Dolares
     */
    public void EurosADolares() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a dolares: ");
        this.monto = sca.nextDouble();//se le pide un monto en euros al usuario
        System.out.println("Cual es el cambio de euro a dolar: ");
        this.CambioADolares = sca.nextDouble();//se pide el cambio de euro a dolar
        double resultado = this.monto * this.CambioADolares;//se utiliza la multiplicacion para retornar el valor total de Euros a dolares
        System.out.println("El monto en Dolares es de: $" + resultado);//se imprime la informacion
        System.out.println("Actualizado con el cambio de moneda del dia: "+fecha);
    }

}
