package Proyecto.problem1y2;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class SistemadecambiodeMoneda {

    public byte monedaorigen;

    /**
     *Metodo para iniciar el programa
     */
    public void iniciarprograma() {

        MetodosCambioMoneda monedasalida = new MetodosCambioMoneda();
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.println("Digite 1 para cambiar de Dolares a Colones\nDigite 2 para cambiar de Euros a Colones\nDigite 3 para cambiar de Colones a Dolares\nDigite 4 para cambiar de Colones a Euros\nDigite 5 para cambiar de Dolares a Euros\nDigite 6 para cambiar de Euros a Dolares");
            monedaorigen = sca.nextByte();

            switch (monedaorigen) {
                //en cada uno de los case se presenta el objeto correcto que tiene ue ejecutar el programa
                case 1:

                    monedasalida.DolarAColon();

                    break;

                case 2:
                    monedasalida.EuroAColon();
                    break;
                    
                case 3:
                    monedasalida.ColonADolar();
                    break;
                
                case 4:
                    
                    monedasalida.ColonAEuros();
                    break;
                
                case 5:
                    monedasalida.DolaresAEuros();
                    break;
                    
                case 6:
                    monedasalida.EurosADolares();
                    break;
                 

            }//llave del switch

        }//lave del while
    }//llave del metodo iniciar

}//llave de la clase
