package Proyecto.Problem6;

import java.util.Arrays;
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
        double nota = Double.parseDouble((JOptionPane.showInputDialog("Digite la nota del estudiante: ")));
        String pts = JOptionPane.showInputDialog("Digite el total de puntos Obtenidos bajo el formato ptsObtenidos/puntosTotales:");

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

    public void ImprimirOrdenNotas() {

        JTextArea textArea = new JTextArea();
        modelo.bubbleSortCalifi();
        for (int i = 0; i < modelo.getIndice(); i++) {

            textArea.append("Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }
        JOptionPane.showMessageDialog(null, textArea);
    }

    public void ImprimirPromedio() {
        JTextArea textArea = new JTextArea();
        textArea.append("El promedio ponderado del grupo es de: " + modelo.promedio());
        JOptionPane.showMessageDialog(null, textArea);

    }

    /* public void ImprimirNotaAlta() {
        JTextArea textArea = new JTextArea();
        
            textArea.append("El Alumno con mejor promedio es: " + modelo.getNombreAlumno()
                    + "\nEl promedio del examen es:" + modelo.notaMaxima());
        
        JOptionPane.showMessageDialog(null, textArea);
    }
     */
    public int Menu() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("---------Bienvenido al Sistema De Notas JGR---------\nDigite a continuacion el numero de la opción a la cual desea acceder"
                + "\n1.Digitar el total de estudiantes que desea agregar al Sistema\n2.Digitar Notas\n3.Imprimir Notas de Alumnos,Nombre de padre o Encargado y Nombre de alumno"
                + "\n4.Imprimir Notas Ordenadas\n5.Imprimir estudiante con nota mas alta"
                + "\n6.Imprimir Estudiante connota mas Baja\n7.Imprimir Promedio de la clase\n8.Salir."));

        return menu;
    }

}
