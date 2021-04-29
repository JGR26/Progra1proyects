package Proyecto.Problem6;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author JGR
 */
public class VistaSistemaNotas {

    ModeloSistemaNotas modelo;
    Date date = new Date();
    Scanner sca = new Scanner(System.in);

    public VistaSistemaNotas(ModeloSistemaNotas modelo) {
        this.modelo = modelo;
    }

    public void digitarNotas() {

        String nombre = JOptionPane.showInputDialog("Digite el nombre del alumno: ");
        String padres = JOptionPane.showInputDialog("Digite el nombre del padre o encargado del alumno: ");
        double nota = Double.parseDouble((JOptionPane.showInputDialog("Digite la nota del estudiante: ")));
        String pts = JOptionPane.showInputDialog("Digite el total de puntos Obtenidos bajo el formato ptsObtenidos/puntosTotales:");

        modelo.agregarNota(nota, pts, nombre, padres);

    }

    public void digitarNotasScanner() {
        String ss = sca.nextLine();
        System.out.print("Digite el nombre del alumno: ");
        String nombre = sca.nextLine();
        System.out.print("Digite el nombre del padre o encargado del alumno: ");
        String padres = sca.nextLine();
        System.out.print("Digite la nota del estudiante: ");
        double nota = sca.nextDouble();
        System.out.print("Digite el total de puntos Obtenidos bajo el formato ptsObtenidos/puntosTotales: ");
        String pts = sca.next();
        modelo.agregarNota(nota, pts, nombre, padres);
    }

    public void datosProfesor() {
        String nombre = JOptionPane.showInputDialog("Digite su nombre completo: ");
        String curso = JOptionPane.showInputDialog("Digite el nombre del curso: ");
        String codigoCurso = JOptionPane.showInputDialog("Digite el código del curso:");

        modelo.agregarDatosProfesor(nombre, curso, codigoCurso);

    }

    public void datosProfesorScanner() {
        String ss = sca.nextLine();
        System.out.print("Digite su nombre completo: ");
        String nombre = sca.nextLine();
        System.out.print("Digite el nombre del curso: ");
        String curso = sca.nextLine();
        System.out.print("Digite el código del curso: ");
        String codigoCurso = sca.next();

        modelo.agregarDatosProfesor(nombre, curso, codigoCurso);
    }

    public void totalDeAlumnos() {
        int cantidadEst = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de estudiantes al que desea agregar notas"));
        modelo = new ModeloSistemaNotas(cantidadEst);
    }

    public void totalDeAlumnosScanner() {
        System.out.println("Digite el total de estudiantes al que desea agregar notas:");
        int cantidadEst = sca.nextInt();
        modelo = new ModeloSistemaNotas(cantidadEst);
    }

    public void generarReporteTodosAlumnos() {
        JTextArea textArea = new JTextArea();

        String datosCurso = ("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\nFecha de reporte: " + date + "\n-----------Presione aceptar para imprimir notas de alumnos-----------");
        for (int i = 0; i < modelo.getIndice(); i++) {

            textArea.append(
                    "Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }

        JOptionPane.showMessageDialog(null, datosCurso);
        JOptionPane.showMessageDialog(null, textArea);

    }

    public void generarReporteTodosAlumnosScanner() {
        String datosCurso = ("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor());
        System.out.println(datosCurso + "\n-----------------------------\n");
        for (int i = 0; i < modelo.getIndice(); i++) {
            System.out.println("Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }
        System.out.println("Fecha de reporte: " + date + "\n");
    }

    public void generarReporteTodosExamenesOrdenadosScanner() {
        modelo.bubbleSortCalifi();
        String datosCurso = ("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor());
        System.out.println(datosCurso + "\n-----------------------------\n");
        for (int i = 0; i < modelo.getIndice(); i++) {
            System.out.println("Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }
        System.out.println("Fecha de reporte: " + date + "\n");
    }

    public void generarReporteTodosExamenesOrdenados() {

        JTextArea textArea = new JTextArea();
        modelo.bubbleSortCalifi();
        String datosCurso = ("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\nFecha de reporte: " + date + "\n-----------Presione aceptar para imprimir notas de alumnos-----------");

        for (int i = 0; i < modelo.getIndice(); i++) {

            textArea.append(
                    "Nombre del Alumno: " + modelo.getNombreAlumno(i)
                    + "\nNombre del Padre o Encargado: " + modelo.getNombrePadre(i)
                    + "\nNota del Estudiante: " + modelo.getNota(i)
                    + "\nPuntos Obtenidos: " + modelo.getPuntosObtenidos(i) + "\n-----------------------------\n");

        }
        JOptionPane.showMessageDialog(null, datosCurso);
        JOptionPane.showMessageDialog(null, textArea);
    }

    public void imprimirPromedio() {
        JTextArea textArea = new JTextArea();
        textArea.append("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\nEl promedio ponderado del grupo es de: " + modelo.promedio() + "\nFecha de reporte: " + date);
        JOptionPane.showMessageDialog(null, textArea);

    }

    public void imprimirPromedioScanner() {
        System.out.println("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\n-----------------------------\n"
                + "\nEl promedio ponderado del grupo es de: " + modelo.promedio() + "\nFecha de reporte: " + date);
    }

    public void imprimirNotaBaja() {
        JTextArea textArea = new JTextArea();
        modelo.bubbleSortCalifi();
        int n = 0;
        for (int i = 0; i < 0; i--) {
            n = modelo.calificaciones.length - 1;
        }

        textArea.append("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\nEl alumno con nota mas baja es: " + modelo.getNombreAlumno(n)
                + "\nEl promedio del examen es:" + modelo.notaMinima() + "\nFecha de reporte: " + date);

        JOptionPane.showMessageDialog(null, textArea);
    }

    public void imprimirNotaBajaScanner() {
        modelo.bubbleSortCalifi();
        int n = 0;
        for (int i = 0; i < 0; i--) {
            n = modelo.calificaciones.length - 1;
        }
        System.out.println("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\n-----------------------------\n"
                + "\nEl alumno con nota mas baja es: " + modelo.getNombreAlumno(n)
                + "\nEl promedio del examen es:" + modelo.notaMinima() + "\nFecha de reporte: " + date);
    }

    public void imprimirNotaMasAlta() {
        JTextArea textArea = new JTextArea();
        textArea.append("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\nEl alumno con nota mas Alta es: " + modelo.getNombreAlumno(modelo.calificaciones.length - 1)
                + "\nEl promedio del examen es:" + modelo.notaMaxima()
                + "\nFecha de reporte: " + date);

        JOptionPane.showMessageDialog(null, textArea);

    }

    public void imprimirNotaMasAltaScanner() {
        System.out.println("Codigo del curso: " + modelo.getCodigoCurso()
                + "\nNombre del curso: " + modelo.getNombreCurso()
                + "\nProfesor: " + modelo.getNombreProfesor()
                + "\n-----------------------------\n"
                + "\nEl alumno con nota mas Alta es: " + modelo.getNombreAlumno(modelo.calificaciones.length - 1)
                + "\nEl promedio del examen es:" + modelo.notaMaxima()
                + "\nFecha de reporte: " + date);

    }

    public int menu() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("---------Bienvenido al Sistema De Calificaciones JGR---------\nDigite a continuacion el numero de la opción a la cual desea acceder"
                + "\n1.Digitar el total de estudiantes que desea agregar al Sistema\n2.Digitar datos del Curso"
                + "\n3.Digitar Notas\n4.Imprimir Notas de Alumnos,Nombre de padre o Encargado y Nombre de alumno"
                + "\n5.Imprimir Notas Ordenadas\n6.Imprimir Estudiante con la nota mas Alta"
                + "\n7.Imprimir Estudiante con nota mas Baja\n8.Imprimir Promedio de la clase\n9.Manual al Usuario\n10.Acerca de\n11.Salir."));

        return menu;
    }

    public int menuScanner() {

        System.out.println("---------Bienvenido al Sistema De Calificaciones JGR---------\nDigite a continuacion el numero de la opción a la cual desea acceder"
                + "\n1.Digitar el total de estudiantes que desea agregar al Sistema\n2.Digitar datos del Curso"
                + "\n3.Digitar Notas\n4.Imprimir Notas de Alumnos,Nombre de padre o Encargado y Nombre de alumno"
                + "\n5.Imprimir Notas Ordenadas\n6.Imprimir Estudiante con la nota mas Alta"
                + "\n7.Imprimir Estudiante con nota mas Baja\n8.Imprimir Promedio de la clase\n9.Manual al Usuario\n10.Acerca de\n11.Salir.");
        int menu = sca.nextInt();
        return menu;
    }

    public void manualUsuario() {
        String manual = "---------GRACIAS POR UTILIZAR NUESTRO SISTEMA DE CALIFICACIONES---------\n"
                + "A continuación hemos preparado una guía para ayudarlo mejor a entender el sistema:\n"
                + "\nEn la opción 1 el usuario tendrá que digitar el total de alumnos que desee subir al sistema de calificaciones"
                + "\nEn la opción 2 el usuario digitará su nombre y los datos del curso respectivo"
                + "\nEn la opción 3 el usuario digitará los datos de los alumnos y notas respectivas,"
                + "\nesta opción la tendra que repetir dependiendo la cantidad de estudiantes a la cual necesita asignar notas"
                + "\nsi digita una cantidad de notas diferente a la cual asignó en la opción 1 estas no se subiran al sistema"
                + "\nEn la opción 4 se desplegará primero un mensaje de confirmación de datos del curso "
                + "\nsi estos datos no son correctos tiene que oprimir CANCELAR"
                + " de lo contrario oprima Aceptar y se desplegarán las notas de los alumnos"
                + "\nEn la opción 5 se desplegarán las notas de los estudiantes de menor a mayor"
                + "\nEn la opción 6 se desplegará la nota más baja del curso"
                + "\nEn la opción 7 se desplegará la nota más alta del curso"
                + "\nEn la opción 8 se desplegará el promedio ponderado del grupo";
        JOptionPane.showMessageDialog(null, manual);
    }

    public void manualUsuarioScanner() {
        String manual = "---------GRACIAS POR UTILIZAR NUESTRO SISTEMA DE CALIFICACIONES---------\n"
                + "A continuación hemos preparado una guía para ayudarlo mejor a entender el sistema:\n"
                + "\nEn la opción 1 el usuario tendrá que digitar el total de alumnos que desee subir al sistema de calificaciones"
                + "\nEn la opción 2 el usuario digitará su nombre y los datos del curso respectivo"
                + "\nEn la opción 3 el usuario digitará los datos de los alumnos y notas respectivas,esta opción la tendra que repetir dependiendo la cantidad de estudiantes a la cual necesita asignar notas"
                + " si digita una cantidad de notas diferente a la cual asignó en la opción 1 estas no se subiran al sistema"
                + "\nEn la opción 4 se desplegará primero un mensaje de confirmación de datos del curso si estos datos no son correctos tiene que oprimir CANCELAR"
                + " de lo contrario oprima Aceptar y se desplegarán las notas de los alumnos"
                + "\nEn la opción 5 se desplegarán las notas de los estudiantes de menor a mayor"
                + "\nEn la opción 6 se desplegará la nota más baja del curso"
                + "\nEn la opción 7 se desplegará la nota más alta del curso"
                + "\nEn la opción 8 se desplegará el promedio ponderado del grupo";
        System.out.println(manual);
    }
    
    public void acercaDe(){
        
        String acercaDe= "Autor del programa: Jairo Guzmán\n"
                + "Función del programa: El programa es un sistema de calificaciones el cual solicita datos"
                + " al usuario y imprime información fundamental para el control de las calificaciones\n"
                + "Versión del software: 1.0"
                + "\nTipo de programa: Proyecto Universitario";
        JOptionPane.showMessageDialog(null, acercaDe);
    }
    
    public void acercaDeScanner(){
        String acercaDe= "Autor del programa: Jairo Guzmán\n"
                + "Función del programa: El programa es un sistema de calificaciones el cual solicita datos"
                + " al usuario y imprime información fundamental para el control de las calificaciones\n"
                + "Versión del software: 1.0"
                + "Tipo de programa: Proyecto Universitario";
        System.out.println(acercaDe);
    }
    
}
