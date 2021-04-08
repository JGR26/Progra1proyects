
package Tarea_libro;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class LibroCalificaciones {
    private String Curso;
    private int[] calificaciones;
    public String CodigoCurso;
    public String nombreCurso;
    Scanner sca=new Scanner(System.in);
    
    public void DatosCurso(){
        System.out.print("Digite el codigo del curso: ");
        this.CodigoCurso=sca.next();
        System.out.print("Digite el nombre del curso: ");
      
        this.nombreCurso=sca.next();
    }
    public LibroCalificaciones(int[] calificaciones){
        this.calificaciones=calificaciones;
    }
    public void procesarNotas(){
        imprimirNotas();
        System.out.printf("%nEl promedio de la clase es %.2f%n",promedio());
        System.out.printf("La calificacion mas baja es %d%nLa calificacion mas alta es %d%n%n",notaMinima(), notaMaxima());
        Grafico();
    }

    public int notaMinima(){
        int notaBaja=calificaciones[70];
        
        for (int nota:calificaciones){
            notaBaja=nota;
            if(nota<notaBaja)
                notaBaja=nota;
        }
       
       return notaBaja; 
    }
    
    public int notaMaxima(){
        int notaAlta=calificaciones[70];
        
        for (int nota:calificaciones){
            notaAlta=nota;
            if(nota>=notaAlta)
                notaAlta=nota;
        }
       return notaAlta; 
    }
    
    public double promedio(){
        int total=0;
        
        for (int nota:calificaciones)
            total +=nota;
        
        return (double) total/calificaciones.length;  
    }
    
    public void Grafico(){
        
       System.out.println("Distribucion de calificaciones:");
       
       int[] frecuencia=new int [11];
       
      for(int notas:calificaciones)
          ++frecuencia[notas/10];
      
      for(int cuenta=0;cuenta<frecuencia.length;cuenta++){
          if(cuenta==10)
              System.out.printf("%5d: ",100);
          else
              System.out.printf("%02d-%02d: ",cuenta*10,cuenta*10+9);
          
          for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
              System.out.print("*");
          System.out.println();
      }
    }
    
    public void imprimirNotas(){
        System.out.printf("Las calificaciones son:%n%n");
            for (int estudiante = 0; estudiante < calificaciones.length; estudiante++)
                System.out.printf("Est %2d: %3d%n",estudiante+1, calificaciones[estudiante]);
    }
    
}
