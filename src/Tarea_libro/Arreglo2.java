package Tarea_libro;

/**
 *
 * @author HP USER
 */
public class Arreglo2 {

    public static void main(String[] args) {

        final int long_arreglo = 100;
        int[] arreglo = new int[long_arreglo];
        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = 100 + 2 / 2 * contador;
        }
        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
        }

    }

}
