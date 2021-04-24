package Proyecto.Problem6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author JGR
 */
public class VistaSistemaNotas {

    ModeloSistemaNotas modelo;

    public VistaSistemaNotas(ModeloSistemaNotas modelo) {
        this.modelo = modelo;
    }

    public void digitarNotas() {

        String nombre = JOptionPane.showInputDialog("Digite el nombre del alumno: ");
        String padres = JOptionPane.showInputDialog("Digite el Nombre del padre O Encargado del alumno: ");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante: "));
        String pts = JOptionPane.showInputDialog("Digite el total de puntos Obtenidos");

        modelo.agregarNota(nota, pts, nombre, padres);

    }

    public void totalDeAlumnos() {
        int cantidadEst = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de estudiantes al que desea agregar notas"));
        modelo = new ModeloSistemaNotas(cantidadEst);
    }

    public void ImprimirNotas() {
        JTextArea textArea = new JTextArea();

        for (int i = 0; i < modelo.getIndice(); i++) {

            textArea.append("Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }
        JOptionPane.showMessageDialog(null, textArea);

    }

    public void NotaAlta() {
        

    }

    public int Menu() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("---------Bienvenido al Sistema De Notas JGR---------\nDigite a continuacion el numero de la opción a la cual desea acceder"
                + "\n1.Digitar el total de estudiantes que desea agregar al Sistema\n2.Digitar Notas\n3.Imprimir Notas de Alumnos,Nombre de padre o Encargado y Nombre de alumno"
                + "\n4.Imprimir Nota más Alta"
                + "\n5.Imprimir Nota mas Baja\n6.Imprimir Promedio"));

        return menu;
    }

}
