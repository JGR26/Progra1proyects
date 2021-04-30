package Proyecto.problem1y2;

import java.util.Scanner;
import java.util.Date;

/**
 * Primer problemaproyecto
 *
 * @author JGR
 */
public class MetodosCambioMoneda {

    public double monto;//variable en la cual el usuario ingresa el monto total a convertir a dolares o euros
    private short cambioacolon = 500;//es una variable privada ya que es un valor fijo y no necesita ser cambiado por el usuario
    private double euroAdolares = 1.53;//es una variable privada igual ya que no es necesario cambiarla
    // en las dos variables anteriores se mantienen privadas y con un valor quemado ya que no es necesario el acceso de terceras persobas o que el usuario inicialice las variables ya que son valores predeterminados

    /**
     * Este metodo sirve para que el usuario convierta un monto de dolares a
     * colones
     */
    public void DolarAColon() {
        Date fecha = new Date();
        Scanner sca = new Scanner(System.in);
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();//el usuario asigna el monto desde un scanner
        double resultado = this.monto * this.cambioacolon;//esta formula retorna el monto total convertido a colones
        System.out.println("El monto en colones es de: ₡" + resultado);//imprime el monto total en colones
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);
    }

    /**
     * Este metodo sirve para que el usuario convierta un monto de euros a
     * colones
     */
    public void EuroAColon() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a colones: ");
        this.monto = sca.nextDouble();//el usuario asigna el monto desde un scanner
        double resultado = (this.monto * this.euroAdolares) * this.cambioacolon;// esta formula calcula el monto total convertido de euros a colones
        System.out.println("El monto en colones es de: ₡" + resultado);//imprime al usuario el monto total a colones
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);
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
        double resultado = this.monto / this.cambioacolon;//se utiliza division para saber cual es el monto total en dolares
        System.out.println("El monto en dólares es de: $" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);
    }

    /**
     * Este metodo retorna el monto de Colones a Euros al usuario
     */
    public void ColonAEuros() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a Euros: ");
        this.monto = sca.nextDouble();
        double resultado = (this.monto / this.cambioacolon) / this.euroAdolares;//se utilizan dos divisiones para calcular el valor en euros
        System.out.println("El monto en Euros es de: €" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);

    }

    /**
     * Este metodo retorna al usuario un valor de Dolares a Euros mediante un
     * scanner
     */
    public void DolaresAEuros() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a Euros: ");
        this.monto = sca.nextDouble();
        double resultado = this.monto / this.euroAdolares;//se utiliza la division para retornar el valor total de dolares a Euros
        System.out.println("El monto en Euros es de: €" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);
    }

    /**
     * Este metodo retorna al usuario un valor de euros a dolares mediante un
     * escaner
     */
    public void EurosADolares() {
        Scanner sca = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Cual es el monto a convertir a dolares: ");
        this.monto = sca.nextDouble();
        double resultado = this.monto * this.euroAdolares;//se utiliza la multiplicacion para retornar el valor total de Euros a dolares
        System.out.println("El monto en Dolares es de: $" + resultado);
        System.out.println("Actualizado con el cambio de moneda del dia: " + fecha);
    }

}
